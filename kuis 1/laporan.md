# Laporan Kuis 1
Nama : Nasywa Syafinka Widyamara

Kelas : SIB 2B

NIM : 22241760002

1. Flowchart



2. Penjelasan Program dan Hasil Program
## Kelas TransactionItem1
Sebuah kelas yang digunakan untuk merepresentasikan item atau barang dalam transaksi. Fungsi utama dari kelas ini adalah untuk menyimpan data terkait item, seperti nama item, jumlah item, dan harga barang, serta memberikan metode untuk mengakses dan mengubah data tersebut.

Penjelasan tiap kode program:

*private String itemName;, private int jml;, private double harga;: Ini adalah deklarasi variabel instance dalam kelas TransactionItem untuk menyimpan nama item, jumlah item, dan harga item.

*Konstruktor public TransactionItem(String itemName, int jml, double harga): Konstruktor yang digunakan untuk membuat objek TransactionItem dengan menginisialisasi nilai-nilai awal dari variabel instance itemName, jml, dan harga berdasarkan nilai-nilai yang diberikan sebagai argumen saat objek dibuat.

*Metode getter (getItemName(), getJml(), getHarga()): Untuk mengambil nilai-nilai dari variabel instance. Misalnya, getItemName() digunakan untuk mengambil nama item dari objek.

*Metode setter (setItemName(), setJml(), setHarga()): Untuk mengatur nilai-nilai dari variabel instance. Misalnya, setItemName() digunakan untuk mengatur atau mengubah nama item dalam objek.

*public double calculateSubtotal():Metode yang digunakan untuk menghitung subtotal dari item. Subtotal dihitung dengan mengalikan jumlah item (jml) dengan harga item (harga).

## Kelas Transaction1
Kelas ini digunakan untuk melakukan sebuah transaksi. Fungsi utama dari kelas ini adalah untuk mengelola item-item dalam transaksi, menghitung total belanja, dan memberikan fungsi-fungsi untuk mengelola item-item tersebut.

Penjelasan tiap kode program:

*private TransactionItem[] items;: Ini adalah array yang digunakan untuk menyimpan objek-objek TransactionItem, yang mewakili item-item dalam transaksi.

*private int itemCount;: Ini adalah variabel yang digunakan untuk melacak jumlah item dalam transaksi.

*private double total;: Ini adalah variabel yang digunakan untuk melacak total belanja dalam transaksi.

*private boolean hasError;: Ini adalah variabel boolean yang digunakan untuk menunjukkan jika terdapat kesalahan dalam transaksi.

*Konstruktor public Transaction(): Konstruktor ini digunakan untuk membuat objek Transaction. Pada konstruktor, array items diinisialisasi dengan kapasitas maksimum 100, itemCount diatur ke 0, total diatur ke 0, dan hasError diatur ke false.

*Metode addItem(String itemName, int jml, double harga): Metode ini digunakan untuk menambahkan item baru ke dalam transaksi. Jika masih tersedia ruang dalam array items, maka objek TransactionItem baru akan dibuat dan ditambahkan ke dalam array.

*Metode removeItem(int index): Metode ini digunakan untuk menghapus item dari transaksi berdasarkan indeks. Jika indeks valid, objek pada indeks tersebut akan dihapus.

*Metode checkTransaction(): Metode ini digunakan untuk mengecek dan menampilkan transaksi

## Kelas Main1
Di dalam kelas Main, program utama akan dijalankan. Fungsi utama kelas ini adalah untuk menginisialisasi objek-objek yang diperlukan dan mengatur alur program. 

Penjelasan tiap bagian kode:

*public class Main: Ini adalah deklarasi kelas Main.

*public static void main(String[] args): Ini adalah metode main, yang merupakan metode utama yang akan dieksekusi saat program dijalankan. Di dalam metode ini, Anda dapat membuat objek, menjalankan logika program, dan menampilkan hasilnya.

*Transaction transaction = new Transaction();: Ini adalah langkah pertama dalam program. Objek Transaction dibuat sebagai transaksi baru.

*transaction.addItem("Barang A", 2, 100000); dan transaction.addItem("Barang B", 3, 75000);: Dalam contoh ini, dua item ditambahkan ke transaksi dengan menggunakan metode addItem pada objek transaction. Ini menambahkan item ke dalam transaksi dengan nama, jumlah, dan harga tertentu.

*transaction.calculateTotal();: Ini adalah langkah untuk menghitung total belanja dalam transaksi.

*transaction.checkTransaction();: Ini adalah langkah untuk menampilkan rincian transaksi, termasuk nama item, jumlah, harga, subtotal, dan total belanja. Jika ada kesalahan dalam transaksi, pesan kesalahan akan ditampilkan.

*double totalWithDiscount = transaction.getTotalWithDiscount();: Ini adalah langkah untuk mendapatkan total belanja dengan diskon. Diskon akan dihitung berdasarkan jumlah total belanja dalam transaksi.

*System.out.println("Total Belanja dengan Diskon: " + totalWithDiscount);: Ini adalah langkah untuk mencetak total belanja dengan diskon ke layar.

## Hasil Kode Program/Output Program
Menu 1 : Menambahkan Item, Jumlah Item, dan Harga Item

<img src=menu1.png>

Menu 2 : Update Item

<img src=menu2.png>

Menu 3 :Hapus Item

<img src=menu3.png>

Menu 4 : Lihat Item

<img src=menu4.png>

Menu 5 : Menghitung Total Belanja

<img src=menu5.png>