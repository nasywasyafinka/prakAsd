# UTS PRAKTIKUM ALGORITMA STRUKTUR DATA
NAMA = NASYWA SYAFINKA WIDYAMARA

KELAS = SIB 2B

ABSEN = 19

NIM = 2241760002

## Penjelasan Kode Program
### Kelas Pembeli19
- Kelas ini digunakan untuk merepresentasikan informasi pelanggan (pembeli).
- Memiliki dua atribut: namaPembeli untuk nama pelanggan dan noHP untuk nomor telepon pelanggan.
- Memiliki satu constructor untuk menginisialisasi atribut-atribut kelas ini saat objek dibuat.


### Kelas Pesanan19
- Digunakan untuk merepresentasikan pesanan yang dibuat oleh pelanggan.
- Mempunyai tiga atribut: kodePesanan untuk nomor urut pesanan, namaPesanan untuk nama pesanan, dan harga untuk harga pesanan.
- Mempunyai satu constructor untuk menginisialisasi atribut-atribut kelas ini saat objek pesanan dibuat.


### Kelas MainQueue
- Kelas utama yang berisi metode main yang merupakan titik masuk eksekusi program.
- Kemudian, program memasuki loop utama yang memungkinkan pengguna memilih berbagai opsi menu untuk mengelola antrian dan pesanan di restoran.
- Beberapa pilihan menu termasuk menambahkan pelanggan ke antrian, mencetak daftar pelanggan, menghapus pesanan dari antrian, mencetak pesanan berdasarkan nama pelanggan, mencetak total pendapatan, dan keluar dari program.
- Program menggunakan kelas Queue untuk mengelola antrian pelanggan dan kelas List untuk mengelola pesanan.
- Terdapat variabel kodePesananCounter yang digunakan untuk memberikan nomor urut pada setiap pesanan.
- Program menghitung total pendapatan restoran saat pesanan diproses.
- Program akan terus berjalan hingga pengguna memilih untuk keluar (pilihan menu "6").


Penjelasan tiap kode program

1. public static void main(String[] args): Metode utama yang digunakan sebagai titik masuk eksekusi program.

2. public MainQueue19(): konstruktor untuk kelas MainQueue19. Dalam kode program yang diberikan, kontruktor ini tidak didefinisikan. Kode program yang diberikan hanya mengandung metode main, dan biasanya konstruktor digunakan untuk menginisialisasi objek kelas. Karena Anda tidak menggunakan objek kelas MainQueue19 di program, konstruktor ini tidak dibutuhkan.

3. Menambahkan pelanggan ke antrian (case 1):
   - Membuat objek Pembeli19 dengan informasi pelanggan yang dimasukkan.
   - Menambahkan objek Pembeli19 ke dalam antrian menggunakan metode add() dari kelas Queue.
   - Mengganti nomor pesanan dan mencetak konfirmasi penambahan pelanggan ke antrian.

4. Mencetak daftar pelanggan (case 2):
   - Program mencetak daftar pelanggan yang ada dalam antrian bersama dengan nomor urut dan informasi pelanggan.

5. Digunakan untuk menghapus pesanan dari antrian (case 3):
   - Program memeriksa apakah antrian tidak kosong.
   - Jika antrian tidak kosong, program meminta nomor pesanan.
   - Program mencetak pesanan pertama dalam antrian yang siap untuk dipesan.
   - Program meminta nama pesanan dan harganya.
   - Membuat objek Pesanan19 dengan informasi pesanan yang dimasukkan.
   - Menambahkan objek Pesanan19 ke dalam list pesanan.
   - Menambahkan harga pesanan ke total pendapatan.
   - Mencetak pesanan yang baru dibuat.
   - Menghapus elemen pertama dari antrian menggunakan poll() karena pesanan telah dipesan.

6. Untuk mencetak daftar pesanan berdasarkan nama pelanggan (case 4):
   - Program memeriksa apakah list pesanan tidak kosong.
   - Jika list pesanan tidak kosong, program mengurutkan list pesanan berdasarkan nama pesanan.
   - Program mencetak daftar pesanan yang telah diurutkan bersama dengan nomor urut dan informasi pesanan.

7. Mencetak total pendapatan (case 5):
   - Program mencetak total pendapatan yang dihitung selama operasi program.

8. Keluar dari program (case 6):
   - Program mencetak pesan penutup dan keluar dari loop utama.

9. Default case (saat pilihan tidak sesuai dengan menu yang ada):
   - Program mencetak pesan kesalahan jika pengguna memasukkan pilihan yang tidak valid.



### Link kode Youtube