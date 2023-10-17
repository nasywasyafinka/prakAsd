package tugas;

public class buku19Main {
    public static void main(String[] args) {
        buku19 array[] = new buku19[4];
        array[0] = new buku19("Algoritma Pemrograman", 1292, 2.5);
        array[1] = new buku19("Basis Data", 400, 29.7);
        array[2] = new buku19("Dasar Pemrograman", 294, 50);
        array[3] = new buku19("Rekayasa Perangkat Lunak", 824, 70.7);

            pengurutan19 b = new pengurutan19();
            System.out.println("============================================");
            System.out.println("|                 DATA BUKU                |");
            System.out.println("============================================");
            b.tampil19(array);

            System.out.println("============================================");
            System.out.println("|        PENGURUTAN JUMLAH HALAMAN         |");
            System.out.println("============================================");
            b.halaman(array);
            b.tampil19(array);

            System.out.println("============================================");
            System.out.println("|          PENGURUTAN TINGGI BUKU          |");
            System.out.println("============================================");
            b.ukuran(array);
            b.tampil19(array);
    }
}
