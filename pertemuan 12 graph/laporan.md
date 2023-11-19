# LAPORAN PRAKTIKUM PERTEMUAN 12
# GRAPH
NAMA = NASYWA SYAFINKA WIDYAMARA

KELAS = SIB 2B

NIM = 2241760002

## Praktikum 1
Hasil Percobaan

<img src=prak1.png>

langkah 13

<img src=prak1.1.png>

### Pertanyaaan
1. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah 
kegunaan algoritma-algoritma tersebut?
2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan 
pembuatan variabel tersebut ? 
3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add 
jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph?
4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge 
pada graph ?
5. Kenapa pada praktikum 12.2 langkah ke-12 untuk menghapus path yang bukan merupakan 
lintasan pertama kali menghasilkan output yang salah ? Bagaimana solusinya ?

<img src=prak1.5.png>


###  Jawab :
1. - Undirected Graph Pada undirected graph, simpulnya terhubung dengan edge yang sifatnya dua arah.
   - Directed Graph pada graph ini simpulnya terhubung oleh edge yang hanya bisa melakukan jelajah satu arah pada simpul yang ditunjuk.
   - Weighted Graph yang cabangnya diberi label bobot berupa bilangan numerik. Digunakan untuk memudahkan algoritma dalam menyelesaikan masalah.
2. Representasi graf disimpan menggunakan struktur data linked list dengan merepresentasikan dari suatu vertex dalam graf.
3. Untuk memastikan node baru ditambahkan di awal linked list, sehingga representasi node dalam graf bisa terhubung edge dari suatu vertex ke vertex lainnya.
4. Menambahkan kode berikut
   
   <img src=prak1.4.png>

5. Menambahkan graf pembaruan setelah menghapus lintasan, dan dapat memanggil method printGraph() setelah pemanggilan removeEdge(1, 2) untuk memastikan perubahan dengan benar.
   

## Praktikum 2
Hasil Percobaan 
<img src=prak2.png>

### Pertanyaan 
1. Apakah perbedaan degree/derajat pada directed dan undirected graph?
2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus 
ditambahkan dengan 1 pada indeks array berikut?

<img src=2.4.png>

3. Apakah kegunaan method getEdge() ?
4. Termasuk jenis graph apakah uji coba pada praktikum 12.3 ?
5. Mengapa pada method main harus menggunakan try-catch Exception ?


### Jawab :
1.  - Undirected Graph: 
   Derajat simpul adalah jumlah elemen non-nol di baris atau kolom yang sesuai dengan simpul tersebut di matriks adjacency.
    - Directed Graph: 
   Derajat suatu simpul pada directed graph dibagi menjadi in-degree dan out-degree. 
   In-degree adalah jumlah tepi yang menuju simpul tersebut.
   Out-degree adalah jumlah tepi yang keluar dari simpul tersebut.

2. Pada java konsepp array dimulai dari indeks 0, jadi ditambahkan 1 biar di hitung dari indeks 1.
3. Unutk memperoleh nilai edge antara dua vertex pada graf. Graf diibaratkan sebagai array dua dimensi (twoD_array).
4. Memakai matriks dua dimensi (2D array), lalu jenis graf yang dihasilkan adalah graf berarah.
5. Karena digunakan untuk menangani adanya error atau exception selama eksekusi program.
   

### Tugas 
1. Ubahlah lintasan pada praktikum 12.2 menjadi inputan!
2. Tambahkan method graphType dengan tipe boolean yang akan membedakan graph termasuk 
directed atau undirected graph. Kemudian update seluruh method yang berelasi dengan method 
graphType tersebut (hanya menjalankan statement sesuai dengan jenis graph) pada praktikum 
12.2
3. Modifikasi method removeEdge() pada praktikum 12.2 agar tidak menghasilkan output yang 
salah untuk path selain path pertama kali!
4. Ubahlah tipe data vertex pada seluruh graph pada praktikum 12.2 dan 12.3 dari Integer menjadi tipe generic agar dapat menerima semua tipe data dasar Java! Misalnya setiap vertex yang awalnya berupa angka 0,1,2,3, dst. selanjutnya ubah menjadi suatu nama daerah seperti Malang,Surabaya, Gresik, Bandung, dst.

### Jawaban
2. 
   <img src=tugas2.png>

3. 
   <img src=tugas3.png>

4. 
   <img src=tugas4.png>

