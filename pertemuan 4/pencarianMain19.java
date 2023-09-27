import java.util.Scanner;
public class pencarianMain19 {    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        // Minta pengguna untuk memasukkan jumlah elemen dalam array
        System.out.print("Masukkan jumlah elemen dalam array\t: ");
        int jumlahElemen = naswa.nextInt();

        // Membuat array untuk menyimpan data yang dimasukkan oleh pengguna
        double[] data = new double[jumlahElemen];

        // Meminta pengguna untuk memasukkan nilai-nilai dalam array
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            data[i] = naswa.nextDouble();
        }

        // Membuat objek orderedSearch19 dengan array yang telah dimasukkan oleh pengguna
        orderedSearch19 os = new orderedSearch19(data);

        // Menampilkan elemen-elemen array
        System.out.println("\nIsi elemen array : ");
        os.tampilkan();

        // Meminta pengguna untuk memasukkan nilai yang ingin dicari
        System.out.print("\nMasukkan nilai yang ingin dicari\t: ");
        double key = naswa.nextDouble();

        int index = os.cari(key);
        if (index != -1) {
            System.out.println("\nData " + key + " pada index " + index);
        } else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
    }
}