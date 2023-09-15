# Laporan Praktikum ASD
Nama : Nasywa Syafinka Widyamara

Kelas : SIB 2B

NIM : 22241760002

## Percobaan 1 
Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

Hasil percobaan
<img src=4.2.2.png>

### 4.2.3 Pertanyaan
1. Jelaskan mengenai base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial!
2. Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3 tahapan 
divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program!
3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for?Buktikan!
4. Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut!
5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?

Jawaban :

1. Algoritma Divide and Conquer adalah teknik pemecahan masalah yang terdiri dari tiga langkah utama: divide, conquer, dan combine. Namun, algoritma faktorial tidak biasanya diimplementasikan dengan metode Divide and Conquer, karena ada cara yang lebih sederhana dan efisien untuk menghitung faktorial. Faktorial dapat dihitung dengan mudah menggunakan perulangan atau rekursi sederhana. Algoritma Divide and Conquer umumnya digunakan untuk masalah pemecahan yang memerlukan pemisahan masalah menjadi submasalah yang lebih kecil, penyelesaian submasalah tersebut secara rekursif, dan penggabungan solusi dari submasalah tersebut.
2. Algoritma faktorial sederhana tidak memerlukan konsep Divide and Conquer, sehingga tidak ada tahap divide, conquer, atau combine dalam implementasinya. Tahap-tahap dalam kode ini adalah:

Divide: Tidak ada tahap divide yang jelas dalam implementasi ini. Yang terjadi adalah pemanggilan rekursif yang mengurangi nilai n hingga mencapai 0.

Conquer: Tahap conquer terjadi saat setiap pemanggilan rekursif mengembalikan hasil faktorial dari nilai yang lebih kecil (yaitu n - 1) dan mengalikannya dengan n.

Combine: Tidak ada tahap combine yang jelas dalam implementasi ini. Dalam metode faktorialBF(), biasanya menggunakan perulangan for untuk menghitung faktorial. Namun, dapat menggantinya dengan rekursi. Kemudian program dapat memanggil fungsi ini dengan faktorial_recursive(n) untuk menghitung faktorial.

3. Pada method faktorialBF(), penggunaan perulangan for adalah cara yang paling sederhana dan efisien untuk menghitung faktorial. Alternatif lain, seperti menggunakan perulangan while, akan memerlukan kode tambahan yang lebih kompleks untuk mengelola perulangan. Perulangan for pada method ini sangat cocok untuk tujuan perhitungan faktorial. 
4. menambahkan pengecekan waktu eksekusi menggunakan System.currentTimeMillis() sebelum dan setelah menjalankan kedua jenis metode faktorial. 

<img src=awal.png>

5. Untuk nilai n yang besar, algoritma faktorialBF() (Brute Force) akan menjadi sangat lambat karena kompleksitas waktu nya adalah O(n). Sebaliknya, algoritma faktorialDC() (Divide and Conquer) memiliki kompleksitas waktu yang lebih baik, yaitu O(log n), karena mengurangi masalah menjadi submasalah yang lebih kecil.


## Percobaan 2
Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

Hasil Percobaan:
<img src=4.3.2.png>


### Pertanyaan 4.3.3
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
2. Pada method PangkatDC() terdapat potongan program sebagai berikut:
Jelaskan arti potongan kode tersebut
3. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
4. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor.
5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan!

Jawaban :

1. Perbedaan antara PangkatBF() dan PangkatDC():

-pangkatBF(int a, int n): Metode ini menggunakan pendekatan brute force atau kasar. Itu menggunakan loop for untuk mengalikan nilai a sebanyak n kali. Ini adalah pendekatan yang sederhana dan langsung ke depan untuk menghitung pangkat.

-pangkatDC(int a, int n): Metode ini menggunakan pendekatan Divide and Conquer atau Pembagian dan Penaklukan. Ini memecah masalah menghitung pangkat a^n menjadi masalah yang lebih kecil dengan membagi eksponen n menjadi dua bagian yang lebih kecil, yaitu n/2. Kemudian, ia memanggil dirinya sendiri dua kali untuk menghitung pangkat a^(n/2) dan kemudian menggabungkan hasilnya secara rekursif. Jika eksponen n adalah bilangan ganjil, maka ada satu tambahan a dalam perhitungan.

2. Potongan kode ini digunakan untuk mengimplementasikan metode Divide and Conquer. Jika eksponen n adalah bilangan ganjil, maka potongan kode ini memanggil dirinya sendiri dua kali untuk menghitung pangkat a^(n/2) dan kemudian mengalikan hasilnya dengan a. Jika eksponen n adalah bilangan genap, maka potongan kode ini juga memanggil dirinya sendiri dua kali untuk menghitung pangkat a^(n/2), tetapi tanpa perkalian tambahan.
3. Tahap Combine atau penggabungan terjadi dalam potongan kode berikut:

Jika eksponen n adalah ganjil, maka hasil dari pangkatDC(a, n/2) * pangkatDC(a, n/2) * a menggabungkan dua pangkat a^(n/2) dan mengalikannya dengan a.
Jika eksponen n adalah genap, maka hasil dari pangkatDC(a, n/2) * pangkatDC(a, n/2) menggabungkan dua pangkat a^(n/2) tanpa perkalian tambahan.

4. penambahan konstruktor terjadi pada line 5-8
   <img src=4.3.3-4.png>
   sedangkan pada kelas main diganti menjadi seperti ini
   <img src=4.3.3-4.2.png>

5. Kita dapat menambahkan sebuah menu untuk memilih metode yang akan dijalankan. Berikut adalah contoh kode dengan menu pemilihan brute force dan divide conquer

Pemilihan menu pertama menggunakan brute force
 <img src=4.3.3bf.png>

 Pemilihan menu kedua menggunakan divide conquer
 <img src=4.3.3dc.png>
   

## Percobaaan 3
Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

Hasil Percobaan:
 <img src=4.4.2.png>
   


### Pertanyaan 4.4.3
1. Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun 
TotalDC()
2. Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di 
belakang koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk 
kedua jenis algoritma tersebut.
3. Mengapa terdapat formulasi return value berikut?Jelaskan!
4. Kenapa dibutuhkan variable mid pada method TotalDC()?
5. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. 
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa 
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan 
dengan program!

Jawaban :

1. Misalkan begini, saya memiliki data keuntungan harian sebuah perusahaan selama beberapa hari. Anda ingin menghitung total keuntungan perusahaan menggunakan dua metode berbeda, yaitu TotalBF() (Brute Force) dan TotalDC() (Divide and Conquer):

TotalBF() akan menghitung total keuntungan dengan menambahkan semua keuntungan harian satu per satu dalam sebuah loop.

TotalDC() akan membagi data keuntungan menjadi dua bagian yang lebih kecil, menghitung total untuk setiap bagian secara rekursif, dan kemudian menggabungkan kedua total tersebut.

Ilustrasinya seperti ini:

Data Keuntungan: [100, 200, 300, 400, 500]

TotalBF() akan menghitung:
Total = 100 + 200 + 300 + 400 + 500 = 1500

TotalDC() akan membagi data menjadi dua bagian: [100, 200] dan [300, 400, 500], kemudian menghitung total untuk setiap bagian dan menggabungkannya:
Total Bagian 1 = 100 + 200 = 300
Total Bagian 2 = 300 + 400 + 500 = 1200
Total = Total Bagian 1 + Total Bagian 2 = 300 + 1200 = 1500

Hasil akhirnya sama, yaitu 1500, tetapi cara perhitungannya berbeda.
2. Saya dapat membatasi output desimal (di belakang koma) menjadi standar dengan menggunakan format angka desimal yaitu float.
3. Formulasi return value pada TotalDC() menggabungkan total dari dua bagian yang lebih kecil. Ini dilakukan dengan mengembalikan jumlah total dari dua rekursi yang menghitung total untuk setiap bagian. Formulasi tersebut mencerminkan pemecahan masalah menjadi masalah yang lebih kecil dan penggabungan hasilnya, yang merupakan karakteristik dari metode Divide and Conquer.
4. Variabel mid digunakan untuk menentukan titik tengah saat membagi data keuntungan menjadi dua bagian yang lebih kecil. Ini penting karena perlu mengetahui data dan membagi data secara merata menjadi dua bagian agar metode Divide and Conquer dapat berfungsi dengan benar. mid mengidentifikasi indeks di mana kita akan membagi data menjadi dua bagian.
5. Untuk menghitung keuntungan bagi beberapa perusahaan yang mungkin memiliki jumlah bulan yang berbeda-beda, dapat menggunakan struktur data yang sesuai, seperti array 2D. Setiap baris dalam array mewakili satu perusahaan, dan setiap kolom mewakili bulan keuntungan. 
 <img src=4.3.3-5.png>
   


## Praktikum
1. Suatu Perguruan Tinggi di kota Malang sedang mengadakan pemilihan suara untuk memilih ketua 
BEM tahun 2022. Jika jumlah suara yang terkumpul diumpamakan selalu genap. Maka dengan 
inputan kandidat terpilih, carilah mayoritas jumlah suara untuk masing-masing kandidat. (Jumlah 
elemen array dan hasil pemilhan suara merupakan inputan user)

Jawaban :

 <img src=tugas.png>





