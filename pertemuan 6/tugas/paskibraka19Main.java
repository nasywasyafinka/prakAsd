package tugas;

import java.util.Scanner;
public class paskibraka19Main {
    public static void main(String[] args) {
        Scanner wawa1 = new Scanner(System.in);
        Scanner wawa2 = new Scanner(System.in);
        anggotaPaskibraka19 data = new anggotaPaskibraka19();
        int jumlah = 5;
        for (int i=0; i<jumlah ;i++){
            System.out.println("Calon ke-"+(i+1));
            System.out.print("Masukkan Nama\t\t: ");
            String nama = wawa1.nextLine();
            System.out.print("Masukkan kelas\t\t: ");
            String kelas = wawa1.nextLine();
            System.out.print("Masukkan tinggi badan\t: ");
            int tinggi = wawa2.nextInt();
            paskibraka19 n = new paskibraka19(nama, kelas, tinggi);
            data.tambah19(n);
        }

            System.out.println("==================================");
            System.out.println("  DATA ANGGOTA CALON PASKIBRAKA");
            System.out.println("==================================");
            data.tampil19();
            System.out.println("==================================");
            System.out.println("==================================");
            System.out.println("Data tertinggi ke terendah: ");
            data.selection19();
            data.tampil19();
            System.out.println("==================================");
            System.out.println("       MAHASISWA YANG LOLOS");
            System.out.println("==================================");
            data.pilih19();

    }
}
