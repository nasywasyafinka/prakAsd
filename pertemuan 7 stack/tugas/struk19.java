package tugas;

public class struk19 {
    int size, top;
    int[] noTrans, totBarang;
    double [] totHarga;
    String[] tanggal;

    public struk19(int nota) {
        noTrans = new int[nota];
        totBarang = new int[nota];
        totHarga = new double[nota];
        tanggal = new String[nota];
        size = nota;
        top = -1;
    }

    public void input(int noTrans, String tanggal, int totBarang, double totHarga) {
        if (isFull()) {
            System.out.println("Data Struk Sudah Penuh!");
        } else {
            top++;
            this.noTrans[top] = noTrans;
            this.tanggal[top] = tanggal;
            this.totBarang[top] = totBarang;
            this.totHarga[top] = totHarga;
        }
    }

    public boolean isFull() {
        if (top == (size - 1)) {
            System.out.println("Data sudah penuh!");
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            System.out.println("Data masih kosong!");
            return true;
        } else {
            return false;
        }
    }

    public void takeTop() {
        if (isEmpty()) {
            System.out.println("Data Struk Masih Kosong!");
        } else {
            System.out.println("=========================================================================");
            System.out.println("| No Transaksi |   Tanggal Beli   |    Jml Barang    |    Total Harga   |");
            System.out.println("=========================================================================");
            System.out.printf("| %-12s | %-14s | %-13s | %-15s |\n", noTrans[top], tanggal[top], totBarang[top], totHarga[top]);
            System.out.println("========================================================================\n");

            top--;
            System.out.println();
        }
    }

    public void peekTop() {
        if (isEmpty()) {
            System.out.println("Data Struk Masih Kosong!");
        } else {
            System.out.println("========================================================================");
            System.out.println("| No Transaksi | Tanggal Beli   | Jml Barang    |  Total Harga    |");
            System.out.println("========================================================================");
            System.out.printf("| %-12s | %-14s | %-13s | %-15s |\n", noTrans[top], tanggal[top], totBarang[top],totHarga[top]);
            System.out.println("========================================================================\n");

            System.out.println();
        }
    }

    public void peekAll() {
        if (isEmpty()) {
            System.out.println("Data Struk Masih Kosong!");
        } else {
            System.out.println("========================================================================");
            System.out.println("| No Transaksi | Tanggal Beli   | Jml Barang    |  Total Harga    |");
            System.out.println("========================================================================");
            for (int i = top; i >= 0; i--) {
                System.out.printf("| %-12s | %-14s | %-13s | %-15s |\n", noTrans[i], tanggal[i], totBarang[i], totHarga[i]);
            }
            System.out.println("========================================================================\n");
        }
    }
}
