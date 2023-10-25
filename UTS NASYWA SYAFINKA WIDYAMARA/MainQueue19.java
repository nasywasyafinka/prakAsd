import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class MainQueue19 {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);

        Queue<Pembeli19> antrian = new LinkedList<>(); // simpan objek pembeli
        List<Pesanan19> pesananList = new LinkedList<>(); // simpan objek pesanan
        
        System.out.println("============================================================");
        System.out.println("|                                                          |");
        System.out.println("|                     UJIAN TENGAH SEMESTER                |");
        System.out.println("|               PRAKTIKUM ALGORTIMA STRUKTUR DATA          |");
        System.out.println("|                                                          |");
        System.out.println("============================================================");
        System.out.println("|                         IDENTITAS                        |");
        System.out.println("============================================================");
        System.out.println("|     Dibuat Oleh = NASYWA SYAFINKA WIDYAMARA              |");
        System.out.println("|     NIM         = 2241760002                             |");
        System.out.println("|     Absen       = 19                                     |");
        System.out.println("============================================================");

        System.out.println("\n\n============================================================");
        System.out.println("|                                                          |");
        System.out.println("|                    **  QUEUE SYSTEM   **                 |");
        System.out.println("|                     ROYAL DELISH RESTO                   |");
        System.out.println("|                                                          |");
        System.out.println("============================================================");

        int pilihan; // menyimpan pilihan menu
        int kodePesananCounter = 1; // nomor urut mulai 1
        int totalPendapatan = 0; // menghitung jumalh pendapatan

        do {
            System.out.println("\n============================================================");
            System.out.println("|                     ROYAL DELISH MENU                    |");
            System.out.println("============================================================");
            System.out.println("|                                                          |");
            System.out.println("|                                                          |");
            System.out.println("|        [1.] ADD QUEUE       [4.] ORDER TODAY (BY NAME)   |");
            System.out.println("|        [2.] PRINT QUEUE     [5.] TOTAL INCOME            |");
            System.out.println("|        [3.] DELETE QUEUE    [6.] EXIT                    |");
            System.out.println("|                                                          |");
            System.out.println("|                                                          |");
            System.out.println("|                                                          |");
            System.out.println("============================================================");
            System.out.print("\tCHOOSE MENU\t= ");
            pilihan = naswa.nextInt();
            System.out.println("============================================================");
            naswa.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\nCUSTOMER NAME\t= ");
                    String namaPembeli = naswa.nextLine();
                    System.out.print("PHONE NUMBER\t= ");
                    String noHP = naswa.nextLine();

                    Pembeli19 pembeli = new Pembeli19(namaPembeli, noHP);
                    antrian.add(pembeli);
                    System.out.println("\n============================================================");
                    System.out.println("\n   ** CUSTOMER " + namaPembeli + " IS SUCCESSFULLY ADDED TO THE QUEUE **");
                    break;
                case 2:
                    System.out.println("=======================================================");
                    System.out.println("|                      CUSTOMER LIST                  |");
                    System.out.println("=======================================================");
                    int nomorAntrian = 1;
                    System.out.println("-------------------------------------------------------");
                    System.out.printf("| %-10s | %-20s | %-15s |\n", "NO ", "CUSTOMER NAME", "PHONE NUMBER");
                    System.out.println("-------------------------------------------------------");
                    for (Pembeli19 p : antrian) {
                        System.out.printf("| %-10d | %-20s | %-15s |\n", nomorAntrian, p.namaPembeli, p.noHP);
                        nomorAntrian++;
                        System.out.println("-------------------------------------------------------");
                    }
                    System.out.println();
                    break;
                case 3:
                    if (!antrian.isEmpty()) {
                        int nomorPesanan = 1; // Inisialisasi nomor pesanan {
                    // Jika ada pesanan sebelumnya, cari nomor pesanan terakhir dan tambahkan 1
                    if (!pesananList.isEmpty()) {
                    int lastIndex = pesananList.size() - 1;
                    nomorPesanan = pesananList.get(lastIndex).kodePesanan+1;
                    
                    }  else {};
                        System.out.println("\n### ORDER NO " + nomorPesanan+" ###");
                        System.out.println(antrian.peek().namaPembeli + " ORDER THE MENU");
                        System.out.println("============================================================");
                        System.out.println("|                 ORDER INPUT TRANSACTIONS                 |");
                        System.out.println("============================================================");
                        System.out.print("\tORDER\t= ");
                        String pesanan = naswa.nextLine();
                        System.out.print("\tPRICE\t= ");
                        int harga = naswa.nextInt();
                        System.out.println("============================================================");
                        naswa.nextLine();
                        Pesanan19 newPesanan = new Pesanan19(kodePesananCounter, pesanan, harga);
                        kodePesananCounter++;
                        pesananList.add(newPesanan);
                        totalPendapatan += harga;
                        
                        System.out.println("-------------------------------------------------------");
                        System.out.println("|             LIST ORDER ROYAL DELISH RESTO           |");
                        System.out.println("-------------------------------------------------------");
                        System.out.printf("| %-10s | %-20s | %-15s |\n", "NO", "ORDER NAME", "PRICE");
                        System.out.println("-------------------------------------------------------");
                        System.out.printf("| %-10d | %-20s | %-15d |\n", nomorPesanan, pesanan, harga);
                        
                        antrian.poll(); // Menghapus elemen dari antrian karena pesanan telah dicetak
                        
                        System.out.println("-------------------------------------------------------");
                        System.out.println("\n\t\t** ORDERS SUCCESSFULLY PRINTED **");
                    } else {
                        System.out.println("============================================================");
                        System.out.println("\n\t\t   ** QUEUE IS EMPTY **");
                    }
                    break;
                case 4:
                    if (!pesananList.isEmpty()) {
                        Collections.sort(pesananList, (p1, p2) -> p1.namaPesanan.compareTo(p2.namaPesanan));
                        System.out.println("-------------------------------------------------------");
                        System.out.println("|             LIST ORDERS ROYAL DELISH RESTO          |");
                        System.out.println("-------------------------------------------------------");
                        System.out.printf("| %-10s | %-20s | %-15s |\n", "NO", "ORDER NAME", "PRICE");
                        System.out.println("-------------------------------------------------------");
                        for (Pesanan19 p : pesananList) {
                            System.out.printf("| %-10d | %-20s | %-15d |\n", p.kodePesanan, p.namaPesanan, p.harga);
                        }
                        System.out.println("-------------------------------------------------------\n");
                        System.out.println("\t\t** ORDER SUCCESSFULLY PRINTED **");
                    } else {
                        System.out.println("============================================================");
                        System.out.println("\n\t\t   ** ORDER IS EMPTY **");
                    }
                    break;
                case 5:
                    
                    System.out.println("\nTOTAL INCOME\t= Rp." + totalPendapatan);
                    break;
                case 6:
                    System.out.println("============================================================");
                    System.out.println("\n\t\t~~ THANK YOU FOR YOUR ORDER ~~");
                    System.out.println("\n============================================================");
                    break;
                default:
                    System.out.println("============================================================");
                    System.out.println("\n\t\t  !! INVALID CHOICE. PLEASE TRY AGAIN !!");
            }
        } while (pilihan != 6);
        naswa.close();
    }
}
