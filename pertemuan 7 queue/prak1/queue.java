package prak1;
import java.util.Scanner;
public class queue {
    Scanner naswa = new Scanner(System.in);
    int max, rear, front, size;
    int q[];

    public queue(int n) {
        this.max = n;
        create();
    }

    public void create() {
        q = new int[max];
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
            System.out.println("Elemen terdepan: " + q[front]);
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
                System.out.println(q[i] + " ");
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

    public void enqueue(int data) {
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

    public int dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong!");
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

    public int peekPosition() {
        if (!IsEmpty()) {
            System.out.print("Masukkan data yang ingin dicari posisinya: ");
            int data = naswa.nextInt();

            for (int i = 0; i < size; i++) {
                int idx = (front + i) % max;
                if (q[idx] == data) {
                    System.out.println(data + " ada di urutan ke " + i);
                    return i;
                }
            }
            System.out.println(data + " tidak ditemukan dalam queue.");
        } else {
            System.out.println("Queue masih kosong!");
        }
        return -1;
    }

    public int peekAt(){
        if (!IsEmpty()) {
            System.out.print("Masukkan index yang ingin dicari: ");
            int index = naswa.nextInt();
            for (int i = 0; i < size; i++) {
                int data = (front + i) % max;
                if (data == index) {
                    System.out.println("Index ke-"+index+" adalah "+q[data]);
                    return i;
                }
            }
            System.out.println("Index ke-"+index + " tidak ditemukan.");
        } else {
            System.out.println("Queue masih kosong!");
        }
        return -1;
    }
}
