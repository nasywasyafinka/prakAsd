import java.util.Scanner;

public class tugas4main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah penduduk: ");
        int jumlahPenduduk = input.nextInt();

        tugas4[] pendudukArray = new tugas4[jumlahPenduduk];

        for (int i = 0; i < jumlahPenduduk; i++) {
            input.nextLine();
            System.out.println("Penduduk ke-" + (i + 1));
            System.out.print("NIK\t\t: ");
            String NIK = input.nextLine();
            System.out.print("Nama\t\t: ");
            String nama = input.nextLine();
            System.out.print("Alamat\t\t: ");
            String alamat = input.nextLine();
            System.out.print("Jenis Kelamin\t: ");
            String jenisKelamin = input.nextLine();
            pendudukArray[i] = new tugas4(NIK, nama, alamat, jenisKelamin);
        }

        System.out.println("------------------------------ DATA PENDUDUK -----------------------------");
        System.out.println("| No\t|      NIK\t|     Nama\t|   Alamat\t|    Jenis Kelamin |");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < jumlahPenduduk; i++) {
            System.out.printf("|%2d\t|%13s\t|%12s\t|  %6s\t| %13s\t   |\n",
                    i + 1, pendudukArray[i].getNIK(), pendudukArray[i].getNama(),
                    pendudukArray[i].getAlamat(), pendudukArray[i].getJenisKelamin());
        }
        System.out.println("==========================================================================");

        System.out.println("\n--------------------------- CARI DATA PENDUDUK -------------------------");
        System.out.print("\nMasukkan NIK yang akan dicari: ");
        String NIKCari = input.next();

        boolean ditemukan = false;
        for (int i = 0; i < jumlahPenduduk; i++) {
            if (pendudukArray[i].getNIK().equals(NIKCari)) {
                System.out.printf("|%d\t|   %s\t|  %s\t| %s\t|  %s\t|", i + 1, pendudukArray[i].getNIK(),
                        pendudukArray[i].getNama(), pendudukArray[i].getAlamat(),
                        pendudukArray[i].getJenisKelamin());
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan NIK " + NIKCari + " tidak ditemukan.");
        }
    }
}