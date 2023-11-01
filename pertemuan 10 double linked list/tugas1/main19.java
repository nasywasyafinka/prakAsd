package tugas1;
import java.util.Scanner;

public class main19 {
    Scanner naswa = new Scanner (System.in);
    public static void menu(){
        System.out.println(" ");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("| PENGANTRI VAKSIN EXTRAVAGANZA |");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("|1. Tambah Data Penerima Vaksin |");
        System.out.println("|2. Hapus Data Pengantri Vaksin |");
        System.out.println("|3. Daftar Penerima Vaksin      |");
        System.out.println("|4. Keluar                      |");
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    public static int userPilih() {
        Scanner naswa = new Scanner(System.in);
        System.out.print("Pilih Menu\t: ");
        return naswa.nextInt();
    }

    public static int nomorAntri() {
        Scanner naswa = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------");
        System.out.println("                MASUKKAN DATA PENERIMA VAKSIN ");
        System.out.println("-------------------------------------------------------------");
        System.out.print("\nNomor antrian\t\t: ");
        return naswa.nextInt();
    }

    public static String namaPengguna() {
        Scanner naswa = new Scanner(System.in);
        System.out.print("Nama penerima vaksin\t: ");
        return naswa.next();
    }

    public static void main(String[] args) {
        doubleLinkedList dll = new doubleLinkedList();
        boolean vaksin = true;

        while (vaksin) {
            menu();
            int pilih = userPilih();

            switch (pilih) {
                case 1:
                    int queueNumber = nomorAntri();
                    String nama = namaPengguna();
                    dll.addFirst(nama, queueNumber);
                    System.out.println(nama + " telah ditambahkan ke antrian dengan nomor " + queueNumber + ".");
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 2:
                    String removedName = dll.remove();
                    if (removedName != null) {
                        System.out.println(removedName + " telah selesai divaksinasi.");
                    } else {
                        System.out.println("Antrian sudah kosong.");
                    }
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    vaksin = false;
                    break;
                default:
                    System.out.println("Format ketikan salah, silahkan ketik ulang.");
            }
        }
    }

}