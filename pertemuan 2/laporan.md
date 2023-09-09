# Laporan Praktikum Pertemuan 2
NAMA    : NASYWA SYAFINKA WIDYAMARA

ABSEN   : 19

NIM     : 2241760002



## Percobaan 1 
Hasil Percobaan

<img src=2.2.1.png>
Ket: Program tidak dapat berjalan karena tidak memiliki kelas main untuk mengoperasikan atribut serta method yang terdapat di dalam kelas film19.

### Pertanyaan 2.2.3
1. a.) Encapsulation (Pembungkusan)
Suatu konsep yang mengacu pada pembungkusan data (atribut) dan metode yang beroperasi pada data tersebut menjadi satu kesatuan. Membantu menjaga integritas data.
b.) Inheritance (Pewarisan)
konsep di mana sebuah kelas (kelas turunan atau subclass) dapat mewarisi atribut dan metode dari kelas lain (kelas induk atau super class).
2. Kata kunci "class" digunakan untuk mendefinisikan class baru dalam Java. Selain itu, kita juga dapat menggunakan kata kunci "public" atau kata kunci lain untuk mengatur tingkat akses dari class tersebut.
3. Terdapat 5 atribut, yaitu : judul, genre, rate, hargaTiket, dan jmlTiket.
4. Terdapat 3 method, yaitu : tampilFilm(), tambahTiket(), dan kurangTiket().
5. Dengan cara menambahkan if else pada method kurangTiket.
   
   <img src=2.2.3-5.png>
6. Agar dapat digunakan pada saat totalRevenue dijalankan. 
7. Karena method yang ada berisi tentang perhitungan jumlah total tiket yang mengharuskan menggunakan tipe data integer agar hasil dari perhitungan tiket dapat muncul dan kita juga dapat mengakses operatornya.
8. Karena metode void mudah diakses oleh kelas lain dan tidak memerlukan akses khusus seperti metode private.

Hasil akhir percobaan setelah kelas main dibuat
<img src=2.3.2.png>


## Percobaan 2
Hasil Percobaan
<img src=2.4.2.png>

### Pertanyaan 2.4.3
1. Proses deklarasi konstruktor berparameter terjadi pada line code 17-18.
  <img src=2.4.3-2.png> 
2. Melakukan instansiasi objek dari film2 dimana terdapat kata kunci berupa kode “new” dan konstruktor kelas film dipanggil dengan argument dalam tanda kurung dan isi dari tanda kurung tersebut adalah objek kedua yang ingin ditampilkan. 
3. Pertama buatlah kelas baru terlebih dahulu dengan namna kelas barang dan deklarasikan nama barang dan harga barangnya. Lalu pada kelas filmMain19 tambahkan konstruktor berparameter agar dapat menyimpan objek baru
   <img src=2.4.3-3.png>

## Percobaan 3
Hasil Percobaan
<img src=2.5.1-6.png>

### Pertanyaan
1. Ya, sebuah kelas yang akan digunakan untuk sebuah array of object harus memiliki atribut dan method karena atribut sebagai tempat menyimpan data dimana atribut dalam kelas digunakan untuk menyimpan data atau informasi yang berkaitan dengan objek tersebut. Misalnya, dalam kelas "Mobil," atribut dapat mencakup data seperti merek, model, tahun pembuatan, dan sebagainya. Dan metode untuk mendefinisikan perilaku yang artinya metode dalam kelas mendefinisikan perilaku atau tindakan yang dapat dilakukan oleh objek. Misalnya, dalam kelas "Mobil," metode dapat mencakup tindakan seperti menghidupkan mesin, mematikan mesin, atau mengganti kecepatan.
2. Pada kelas PersegiPanjang tidak memiliki konstruktor. Potongan kode ppArray[1] = new Persegi(); adalah contoh pembuatan objek dari kelas Persegi dan menyimpannya di dalam sebuah array dengan nama ppArray. Ini adalah contoh inisialisasi array dengan objek yang berasal dari kelas yang telah didefinisikan sebelumnya.
3. Berikut penjelasannya :

-PersegiPanjang19[]: Ini adalah tipe data dari array yang akan deklarasikan. Mendefinisikan bahwa ppArray adalah sebuah array yang dapat menyimpan objek dari tipe PersegiPanjang19.

-ppArray:Nama variabel yang berikan kepada array tersebut.

-new PersegiPanjang19[3];:Bagian di mana array sebenarnya dibuat dan diinisialisasi. Dalam kasus ini, membuat array dari ppArray yang dapat menyimpan tiga objek PersegiPanjang19.Dimana array ini memiliki tiga elemen yang dapat digunakan untuk menyimpan tiga objek PersegiPanjang19.

4. Berikut penjelasannya:

-ppArray[1] = new PersegiPanjang19(); : Pernyataan pertama membuat objek baru dari kelas PersegiPanjang19 dan menempatkannya di dalam elemen kedua (indeks 1) dari array ppArray. Dengan kata lain, elemen kedua dari array sekarang berisi objek PersegiPanjang19 yang baru dibuat.

-ppArray[1].pjg = 80; : Pernyataan kedua mengatur nilai atribut pjg (panjang) dari objek yang berada di elemen kedua dari array ppArray menjadi 80. Ini mengubah panjang dari objek PersegiPanjang19 yang ada dalam array.

-ppArray[1].lebar = 40; : Pernyataan ketiga mengatur nilai atribut lebar dari objek yang berada di elemen kedua dari array ppArray menjadi 40. Ini mengubah lebar dari objek PersegiPanjang19 yang ada dalam array.

5. Pemisahan kelas main dan kelas bisa adalah praktik desain yang direkomendasikan karena dapat memungkinkan untuk menjadikan kode yang lebih enak dilihat, terorganisir, dan mudah diurus.
   
 ## Perecobaan 4
 Hasil Percobaan
 <img src=2.6.2.png>

 ## Percobaan 5
 Hasil Percobaan
 <img src=2.7.2.png>


## Tugas
Alur Program :

-nasabah akan membuat akun baru jika belum memiliki akun dan nomor rekening akan keluar secara acak.

-saldo akan ditambahkan melalui menu menabung.

-nasabah dapat melakukan tarik tunai apabila jumlah saldo yang ada pada rekening mencukupi, begitu pula dengan hutang.

-setelah segala aktivitas dilakukan maka nasabah dapat memilih menu cek saldo untuk mengetahui hasil akhir dari saldo yangtersisa.

-jika nasabah menutup rekening maka seluruh aktivitas yang terdapat di menu tidak akan bisa dijalankan.

<img src=bukarek.png>

<img src=menabung.png>

<img src=tarik.png>

<img src=hutang.png>

<img src=ceksaldo.png>

<img src=tutuprek.png>

<img src=buktitutup.png>