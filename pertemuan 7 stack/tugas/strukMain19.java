package tugas;
import java.util.Scanner;

public class strukMain19 {
    public static void main(String[] args) {
        Scanner naswa1 = new Scanner(System.in);
        Scanner naswa2 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah struk : ");
        int nota = naswa2.nextInt();
        struk19 struk = new struk19(nota);
        for (int i = 0; i < nota; i++) {
            System.out.println("STRUK KE-" + (i + 1));
            System.out.print("Masukkan nomor transaksi\t\t\t: ");
            int noTrans = naswa2.nextInt();
            System.out.print("Masukkan tanggal transaksi (01 Januari 2023)\t: ");
            String tanggal = naswa1.nextLine();
            System.out.print("Jumlah barang yang dibeli\t\t\t: ");
            int totBarang = naswa2.nextInt();
            System.out.print("Total harga bayar\t\t\t\t: ");
            double totHarga = naswa2.nextInt();
            struk.input(noTrans, tanggal, totBarang, totHarga);
            System.out.println();
        }
        int pilih;
        do {
            System.out.println("============MENU===========");
            System.out.println("1. Cek struk");
            System.out.println("2. Cek Struk Paling Atas");
            System.out.println("3. Ambil Struk Paling Atas");
            System.out.println("4. Exit");
            System.out.println("===========================");
            System.out.print("Pilih menu\t: ");
            pilih = naswa2.nextInt();
            switch (pilih) {
                case 1:
                    struk.peekAll();
                    break;
                case 2:
                    struk.peekTop();
                    break;
                case 3:
                    struk.takeTop();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Menu yang anda inputkan salah!");
                    System.out.println();
                    break;
            }
        } while (pilih != 4);
    }
}
