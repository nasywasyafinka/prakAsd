package tugas;
import java.util.Scanner;
public class queue {
    Scanner sc = new Scanner(System.in);
    int max, rear, front, size;
    mahasiswa19[] antri = new mahasiswa19[max];

    public queue(int n) {
        this.max = n;
        create();
    }

    public void create() {
        antri = new mahasiswa19[max];
        size = 0;
        front = rear = -1;
    }

    public static void menu() {
        System.out.println("============== MENU ==============");
        System.out.println("| 1. Mahasiswa baru              |");
        System.out.println("| 2. Mahasiswa keluar            |");
        System.out.println("| 3. Cek antrian terdepan        |");
        System.out.println("| 4. Cek semua antrian           |");
        System.out.println("| 5. Cek antrian paling belakang |");
        System.out.println("| 6. Cari mahasiswa              |");
        System.out.println("| 7. Cek index                   |");
        System.out.println("| 8. Clear                       |");
        System.out.println("==================================");
        System.out.print("Choose Menu\t: ");
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

    public void enqueue(mahasiswa19 data) {
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
            antri[rear] = data;
            size++;
        }
    }

    public int dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            data = Integer.parseInt(antri[front].nim);
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

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Data terdepan:");
            System.out.println("+-------------------+---------------+--------+-----+");
            System.out.println("|       Nama        |      NIM      | Absen  | IPK |");
            System.out.println("+-------------------+---------------+--------+-----+");
            System.out.printf("| %-17s | %-13s | %-6d | %.2f |\n", antri[front].nama, antri[front].nim,
                    antri[front].absen, antri[front].ipk);
            System.out.println("+-------------------+---------------+--------+-----+");
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Data terdepan:");
            System.out.println("+-------------------+---------------+--------+-----+");
            System.out.println("|       Nama        |      NIM      | Absen  | IPK |");
            System.out.println("+-------------------+---------------+--------+-----+");
            System.out.printf("| %-17s | %-13s | %-6d | %.2f |\n", antri[rear].nama, antri[rear].nim, antri[rear].absen,
                    antri[rear].ipk);
            System.out.println("+-------------------+---------------+--------+-----+");
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    public int peekPosition(String nim) {
        boolean found = false;
        
        if (!IsEmpty()) {
            System.out.println("Data mahasiswa:");
            System.out.println("+------+-------------------+---------------+--------+-----+");
            System.out.println("| No.  |       Nama        |      NIM      | Absen  | IPK |");
            System.out.println("+------+-------------------+---------------+--------+-----+");
            
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % max;
                if (antri[idx].nim.equalsIgnoreCase(nim)) {
                    System.out.printf("| %-4d | %-17s | %-13s | %-6d | %.2f |\n", i + 1, antri[idx].nama, antri[idx].nim, antri[idx].absen, antri[idx].ipk);
                    found = true;
                }
            }
            System.out.println("+------+-------------------+---------------+--------+-----+");
            
            if (found) {
                return 1; // Atau sesuaikan nilai kembalian sesuai kebutuhan Anda.
            } else {
                System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan dalam queue.");
            }
        } else {
            System.out.println("Queue masih kosong!");
        }
        return -1;
    }
    
    
    public void peekAt(int posisi) {
        if (!IsEmpty()) {
                    System.out.println("Data mahasiswa pada index " + posisi + ":");
                    System.out.println("+-------------------+---------------+--------+-----+");
                    System.out.println("|       Nama        |      NIM      | Absen  | IPK |");
                    System.out.println("+-------------------+---------------+--------+-----+");
                    int dataIndex = (front + posisi) % max;
                    System.out.printf("| %-17s | %-13s | %-6d | %.2f |\n", antri[dataIndex].nama, antri[dataIndex].nim,
                            antri[dataIndex].absen, antri[dataIndex].ipk);
                    System.out.println("+-------------------+---------------+--------+-----+");
            }
            System.out.println("Index ke-" + posisi + " tidak ditemukan.");
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

    public void print() {
        if (!IsEmpty()) {
            System.out.println("Data mahasiswa:");
            System.out.println("+-------------------+---------------+--------+-----+");
            System.out.println("|       Nama        |      NIM      | Absen  | IPK |");
            System.out.println("+-------------------+---------------+--------+-----+");
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % max;
                System.out.printf("| %-17s | %-13s | %-6d | %.2f |\n", antri[idx].nama, antri[idx].nim,
                        antri[idx].absen, antri[idx].ipk);
            }
            System.out.println("+-------------------+---------------+--------+-----+");
        } else {
            System.out.println("Queue masih kosong!");
        }
    }
}
