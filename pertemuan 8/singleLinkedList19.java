public class singleLinkedList19 {
    node19 head;
    node19 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            node19 tmp = head;
            System.out.print("Isi Linked List: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(int input) {
        node19 ndInput = new node19(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast (int input) {
        node19 ndInput = new node19(input,null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input) {
        node19 ndInput = new node19(input, null);
        node19 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0)
        {
            addFirst(input);
        } else {
            node19 temp = head;
            for (int i=0; i<index-1 ;i++) {
                temp = temp.next;
            }
            temp.next = new node19(input, temp.next);
            if (temp.next.next==null) tail=temp.next;
            
        }
    }
}
