public class tugas3 {
    public static void main(String[] args) {
        int[] array = {12, 15, 6, 3, 70, 51, 83, 15, 3, 83};

        int maks = array[0]; // Inisialisasi nilai terbesar dengan elemen pertama
        int maksIndex = 0; // Inisialisasi indeks di mana nilai terbesar ditemukan

        // Mencari nilai terbesar dan indeks di mana nilai terbesar ditemukan
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maks) {
                maks = array[i]; // Perbarui nilai terbesar
                maksIndex = i; // Perbarui indeks nilai terbesar
            }
        }

        // Cetak nilai terbesar
        System.out.println("Nilai terbesar: " + maks);

        // Cetak indeks di mana nilai terbesar ditemukan
        System.out.println("Posisi di mana nilai terbesar ditemukan: " + maksIndex +"\n");
    }
}
