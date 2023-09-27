import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        String[][] dataMahasiswa = {
            {"Alfi", "Safira", "Tiara", "Arif", "Erdi"},
            {"Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"},
            {"Dewa", "Ana", "Abdul", "Dani", "Ammar"}
        };

        boolean found = false;
        int kelompok = -1;
        int urutan = -1;

        
        // Menampilkan tabel daftar kelompok
        System.out.println("Daftar Kelompok:");
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.print("Kelompok " + (i + 1) + ": ");
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                System.out.print(dataMahasiswa[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nMasukkan nama mahasiswa yang ingin dicari: ");
        String namaMahasiswa = naswa.nextLine();

        // Mencari nama mahasiswa dalam array dua dimensi
        for (int i = 0; i < dataMahasiswa.length; i++) {
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                if (dataMahasiswa[i][j].equalsIgnoreCase(namaMahasiswa)) {
                    found = true;
                    kelompok = i + 1; // Kelompok dimulai dari 1
                    urutan = j + 1;   // Urutan dimulai dari 1
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("\nNama Mahasiswa\t: "+namaMahasiswa);
            System.out.println("Kelompok\t: "+kelompok);
            System.out.println("Urutan\t\t: "+urutan+"\n");
        } else {
            System.out.println("\nNama mahasiswa tidak ditemukan.");
        }
    }
}
