package tugas;
import java.util.Scanner;
public class main19 {
    public static void main(String[] args) {
        Scanner scs = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        Scanner scd = new Scanner(System.in);
        System.out.print("Masukkan jumlah data\t: ");
        int jumData = sci.nextInt();
        queue q = new queue(jumData);

        String nim, nama;
        int absen, pilih;
        double ipk;

        do {
            q.menu();
            pilih = sci.nextInt();
            // scs.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama\t: ");
                    nama = scs.nextLine();
                    System.out.print("Masukkan NIM\t: ");
                    nim = scs.nextLine();
                    System.out.print("Masukkan absen\t: ");
                    absen = sci.nextInt();
                    System.out.print("Masukkan IPK\t: ");
                    ipk = scd.nextDouble();
                    // System.out.print("Ingin menambahkan mahasiswa?(y/n): ");
                    // char tambah = scs.next().charAt(0);
                    mahasiswa19 mhs = new mahasiswa19(nama, nim, absen, ipk);
                    q.enqueue(mhs);
                    break;
                case 2:
                    int datakeluar = q.dequeue();
                    if (datakeluar != 0) {
                        System.out.println("NIM mahasiswa yang keluar: " + datakeluar);
                        break;
                    }
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.print();
                    break;
                case 5:
                    q.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nim\t: ");
                    String nimCari = scs.nextLine();
                    q.peekPosition(nimCari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi yang dicari\t: ");
                    int posisi = sci.nextInt();
                    q.peekAt(posisi);
                    break;
                case 8:
                    q.clear();
                    break;
                default:
                    System.out.println("Kode yang anda masukkan salah!");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
