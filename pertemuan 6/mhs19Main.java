import java.util.Scanner;
public class mhs19Main {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        Scanner naswa2 = new Scanner(System.in);
        mhsBerprestasi19 data = new mhsBerprestasi19();
        int jumMhs = 5;

        for (int i=0; i<jumMhs; i++){
            System.out.print("Nama\t\t= ");
            String nama = naswa.nextLine();
            System.out.print("Tahun Masuk\t= ");
            int thnMasuk = naswa.nextInt();
            System.out.print("Umur\t\t= ");
            int umur = naswa.nextInt();
            System.out.print("IPK\t\t= ");
            double ipk = naswa.nextDouble();
            naswa.nextLine();
            System.out.print("\n");

            mhs19 m = new mhs19(nama, thnMasuk, umur, ipk);
            data.tambah(m);

        }

        System.out.println("------------------------------------------------");
            System.out.println("Data Mahasiswa sebelum sorting = ");
            data.tampil();

            System.out.println("\nData mahasiswa setelah sorting desc berdasar ipk = ");
            data.bubbleSort();
            data.tampil();

            System.out.println("\nData mahasiswa setelah sorting asc berdasar ipk = ");
            data.selectionSort();
            data.tampil();
    }
}
