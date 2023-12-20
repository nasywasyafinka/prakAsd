import java.util.Scanner;

public class GameOfStonesLinkedList {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("|                                                          |");
        System.out.println("|                     UJIAN AKHIR SEMESTER                 |");
        System.out.println("|               PRAKTIKUM ALGORTIMA STRUKTUR DATA          |"); 
        System.out.println("|                                                          |");
        System.out.println("============================================================");
        System.out.println("|                         IDENTITAS                        |");
        System.out.println("============================================================");
        System.out.println("|     Dibuat Oleh = NASYWA SYAFINKA WIDYAMARA              |");
        System.out.println("|     NIM         = 2241760002                             |");
        System.out.println("|     Absen       = 19                                     |");
        System.out.println("============================================================");
        System.out.println("============================================================");
        System.out.println("|                   TEMA 3  PERMAINAN BATU                 |");
        System.out.println("============================================================");
        

        // Membaca input N, K, dan M
        System.out.print("Masukkan nilai N\t: ");
        long N = naswa.nextLong();
        System.out.print("Masukkan nilai K\t: ");
        long K = naswa.nextLong();
        System.out.print("Masukkan nilai M\t: ");
        long M = naswa.nextLong();
        naswa.nextLine();

        System.out.println("============================================================");
        // Membaca nama pemain pertama
        System.out.print("Masukkan nama pemain pertama\t: ");
        String player1Name = naswa.next();

        // Membaca nama pemain kedua
        System.out.print("Masukkan nama pemain kedua\t: ");
        String player2Name = naswa.next();

        System.out.println("============================================================");
        // Inisialisasi linked list dengan batu pada petak K
        DoublyLinkedList linkedList = new DoublyLinkedList();
        for (int i = 0; i < K; i++) {
            linkedList.insertAtEnd(1);
        }

        System.out.println("============================================================");
        // Menambah data awal
        System.out.print("Masukkan data awal (petak)\t\t: ");
        int initialStones = naswa.nextInt();
        linkedList.insertAtStart(initialStones);

        // Menambah giliran melempar batu oleh pemain satu
        System.out.print("Pemain "+player1Name+" melempar batu (1-10)\t: ");
        int throwByPlayer1 = naswa.nextInt();
        for (int i = 0; i < throwByPlayer1; i++) {
            linkedList.insertAtEnd(1);
        }

        // Menambah giliran melempar batu oleh pemain dua
        System.out.print("Pemain "+player2Name+" melempar batu (1-10)\t: ");
        int throwByPlayer2 = naswa.nextInt();
        for (int i = 0; i < throwByPlayer2; i++) {
            linkedList.insertAtEnd(1);
        } 

        // Menentukan pemenang
        if (linkedList.getFirstNodeData() == 1 && linkedList.getLastNodeData() == 1) {
            System.out.println("Permainan berlanjut");
        } else {
            if (throwByPlayer1 == throwByPlayer2) {
                System.out.println("============================================================");
                System.out.println("\t\t    "+player2Name + " adalah pemenang");
                System.out.println("============================================================");
            } else {
                System.out.println("============================================================");
                System.out.println("\t\t    "+player1Name + " adalah pemenang");
                System.out.println("============================================================");
            }
        }

        naswa.close();
    }
}