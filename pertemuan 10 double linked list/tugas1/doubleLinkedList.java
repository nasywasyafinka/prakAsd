package tugas1;

public class doubleLinkedList {
    Node19 head;
    Node19 tail;
    int size;
    int queueNumber;

    public doubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, int queueNumber) {
        if (isEmpty()) {
            Node19 newNode = new Node19(nama, queueNumber);
            head = newNode;
            tail = newNode;
        } else {
            Node19 newNode = new Node19(nama, queueNumber);
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public String remove() {
        if (isEmpty()) {
            return null;
        } else {
            String removedName = head.nama;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            return removedName;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node19 current = head;
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("|  Daftar Pengantri Vaksin  |");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println(" ___________________________");
            System.out.println("| No.  |        Nama        |");
            System.out.println("|______|____________________|");
    
            int number = 1;
            while (current != null) {
                System.out.printf("| %-4d | %-15s    |\n", number, current.nama);
                System.out.println("|______|____________________|");
                current = current.next;
                number++;
            }
    
            System.out.println("\nSisa Antrian\t: " + size);
        } else {
            System.out.println("Antrian Vaksin Kosong");
        }
    }

}
