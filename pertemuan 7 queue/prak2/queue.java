package prak2;

public class queue {
    int max, rear, front, size;
    penumpang q[];

    public queue(int n) {
        this.max = n;
        create();
    }

    public void create() {
        q = new penumpang[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + q[front].nama + " " + q[front].kotaAsal
            + " " +  q[front].kotaTujuan + " " + q[front].jumlahTiket + " " + q[front].harga);
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(q[i].nama + " " + q[i].kotaAsal
            + " " +  q[i].kotaTujuan + " " + q[i].jumlahTiket + " " + q[i].harga);
                i = (i + 1) % max;
            }
            System.out.println(q[i] + " ");
            System.out.println("Jumlah elemen: " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil di hapus");
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    public void enqueue(penumpang data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh!");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            q[rear] = data;
            size++;
        }
    }

    public penumpang dequeue() {
        penumpang data = new penumpang(" ", " ", " ", 0, 0);
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            data = q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    public void peekRear(){
        if (!IsEmpty()) {
            System.out.println("Elemen paling belakang: " + q[rear].nama + " " + q[rear].kotaAsal
            + " " +  q[rear].kotaTujuan + " " + q[rear].jumlahTiket + " " + q[rear].harga);
        } else {
            System.out.println("Queue masih kosong!");
        }
    }
}
