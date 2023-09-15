import java.util.Scanner;
public class KeuntunganPerusahaan {
    public int jumlahPerusahaan;
    public int[] jumlahBulanPerusahaan;
    public double[][] keuntunganPerusahaan;

    public KeuntunganPerusahaan(int jumlahPerusahaan) {
        this.jumlahPerusahaan = jumlahPerusahaan;
        this.jumlahBulanPerusahaan = new int[jumlahPerusahaan];
        this.keuntunganPerusahaan = new double[jumlahPerusahaan][];
    }

    public double totalKeuntunganBF(double[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public double totalKeuntunganDC(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalKeuntunganDC(arr, l, mid - 1);
            double rsum = totalKeuntunganDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }

    public void inputKeuntungan() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan keuntungan perusahaan " + (i + 1) + ": ");
            jumlahBulanPerusahaan[i] = scanner.nextInt();
            keuntunganPerusahaan[i] = new double[jumlahBulanPerusahaan[i]];
            System.out.println("Masukkan keuntungan perusahaan " + (i + 1) + " (satuan juta, misal 5.9):");
            for (int j = 0; j < jumlahBulanPerusahaan[i]; j++) {
                System.out.print("Bulan ke-" + (j + 1) + ": ");
                keuntunganPerusahaan[i][j] = scanner.nextDouble();
            }
        }
    }

    public void hitungTotalKeuntungan() {
        System.out.println("==========================================================");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("Algoritma Brute Force");
            double totalBF = totalKeuntunganBF(keuntunganPerusahaan[i]);
            System.out.println("Total keuntungan selama " + jumlahBulanPerusahaan[i] + " bulan: " + totalBF);

            System.out.println("Algoritma Divide Conquer");
            double totalDC = totalKeuntunganDC(keuntunganPerusahaan[i], 0, jumlahBulanPerusahaan[i] - 1);
            System.out.println("Total keuntungan selama " + jumlahBulanPerusahaan[i] + " bulan: " + totalDC);

            System.out.println("==========================================================");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = scanner.nextInt();

        KeuntunganPerusahaan perusahaan = new KeuntunganPerusahaan(jumlahPerusahaan);
        perusahaan.inputKeuntungan();
        perusahaan.hitungTotalKeuntungan();
    }
}
