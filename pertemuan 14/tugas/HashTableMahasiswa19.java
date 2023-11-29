package tugas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTableMahasiswa19 {
    private Map<String, HashTable19> mahasiswaMap;

    public HashTableMahasiswa19() {
        this.mahasiswaMap = new HashMap<>();
    }

    public void tambahMahasiswa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================================");
        System.out.print("Masukkan NIM Mahasiswa\t\t\t: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama Lengkap Mahasiswa\t\t: ");
        String namaLengkap = sc.nextLine();
        System.out.print("Masukkan Jurusan Mahasiswa\t\t: ");
        String jurusan = sc.nextLine();
        System.out.print("Masukkan Program Studi Mahasiswa\t: ");
        String programStudi = sc.nextLine();

        HashTable19 mahasiswa = new HashTable19(nim, namaLengkap, jurusan, programStudi);
        mahasiswaMap.put(nim, mahasiswa);
        System.out.println("\nMahasiswa ditambahkan dengan NIM " + nim);
    }

    public void cariMahasiswa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa yang dicari\t: ");
        String nim = sc.next();

        HashTable19 mahasiswa = mahasiswaMap.get(nim);
        if (mahasiswa != null) {
            System.out.println("Mahasiswa ditemukan\n" + mahasiswa);
        } else {
            System.out.println("\nMahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public void hapusMahasiswa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus\t: ");
        String nim = sc.next();

        HashTable19 mahasiswa = mahasiswaMap.remove(nim);
        if (mahasiswa != null) {
            System.out.println("\nMahasiswa dengan NIM " + nim + " telah dihapus.");
        } else {
            System.out.println("\nMahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public void tampilkanNIMMahasiswa() {
        System.out.println("================================");
        System.out.println("| NIM Mahasiswa yang tersimpan |");
        System.out.println("================================");
        for (String nim : mahasiswaMap.keySet()) {
            System.out.println('|' + nim + '|');
        }
        System.out.println("===============================");
    }
}
