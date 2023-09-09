import java.util.Scanner;
public class tugas1NasabahMain19 {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        tugas1Nasabah19 nasabah = new tugas1Nasabah19(19, "NASYWA SYAFINKA", "Jl. BELIMBING No. 123", 1234567890);


        while (true) {//looping
        System.out.println("\n====================================================================================\n\n");
        System.out.println("\t\t\t\t\tWORLD BANK\n\n");
        System.out.println("\t\tWELCOME, NASABAH " + nasabah.nama + "\n\t\tNO.ID\t: "+ nasabah.id+ "\n\t\tALAMAT\t: "+nasabah.alamat+"\n\t\tNO.HP\t: "+nasabah.noHP);
        System.out.println("\n====================================================================================\n");
        System.out.println("\tMENU NASABAH\t:");
        System.out.println("\n\t\t[1.] BUKA REKENING BARU\t\t[4.] TABUNGAN");
        System.out.println("\t\t[2.] TUTUP REKENING\t\t[5.] TARIK TUNAI");
        System.out.println("\t\t[3.] CEK SALDO\t\t\t[6.] PINJAMAN BANK ");
        System.out.println(" \t\t\t\t   [0.] KELUAR\n");
        System.out.println("====================================================================================\n");
        System.out.printf("\tCHOOSE MENU [1-6]\t: ");
        int menu = naswa.nextInt();

            switch (menu) {
                case 1://bukan metode statis karena memakai method void, sehingga memanggilnya pada objek nasabah, bukan pada kelas Nasabah.
                    nasabah.bukaRekening();
                    break;
                case 2:
                    nasabah.tutupRekening();
                    break;
                case 3:
                    nasabah.lihatSaldo();
                    break;
                case 4:
                    System.out.print("\n\tMASUKKAN JUMLAH YANG AKAN DITABUNG\t: ");
                    int deposit = naswa.nextInt();
                    nasabah.menabung(deposit);
                    break;
                case 5:
                    System.out.print("\n\tMASUKKAN JUMLAH YANG AKAN DITARIK\t: ");
                    int tarik = naswa.nextInt();
                    nasabah.tarikTunai(tarik);
                    break;
                case 6:
                    System.out.print("\n\tMASUKKAN JUMLAH YANG AKAN DIPINJAM\t: ");
                    float hutang = naswa.nextFloat();
                    nasabah.berhutang(hutang);
                    break;
                case 0:
                    System.out.println("\n\n\t\tTERIMA KASIH TELAH MENGGUNAKAN LAYANAN KAMI\n");
                    System.exit(0);
                default: 
                    System.out.println("\n\n\t\t\t\tMENU TIDAK VALID");
            }
        }  
    }
}