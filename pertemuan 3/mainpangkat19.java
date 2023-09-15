import java.util.Scanner;

public class mainpangkat19 {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        System.out.println("==========================================================");
        System.out.printf("Masukkan jumlah elemen yang akan dihitung\t: ");
        int elemen = naswa.nextInt();

        pangkat19[] png = new pangkat19[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + "\t: ");
            int nilai = naswa.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + "\t: ");
            int pangkat = naswa.nextInt();
            png[i] = new pangkat19(nilai, pangkat);
        }
        System.out.println("==========================================================");
        System.out.println("Pilih metode perhitungan:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilh menu\t: ");
        int pilihanMetode = naswa.nextInt();

        switch (pilihanMetode) {
            case 1:
                System.out.println("Hasil pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah :"
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah :"
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
