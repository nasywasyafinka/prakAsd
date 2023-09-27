# LAPORAN JOBSHEET IV
# SEARCHING

NAMA : NASYWA SYAFINKA WIDYAMARA

NIM  : 2241760002

KELAS : SIB 2B


## PRAKTIKUM 1

<img src=prak1.png>

### Pertanyaan 
1. Perhatikan class MahasiswaMain, jelaskan fungsi kode program berikut ini!
     if (cari.equalsIgnoreCase (mhs[i].namaMhs))

jawab : 
kode program tersebut digunakan untuk memeriksa apakah nama mahasiswa yang ada dalam objek Mahasiswa pada indeks ke-i dalam array mhs sama dengan nama yang ada dalam variabel cari. Jika ya, maka blok kode di dalam if akan dijalankan, dan ini menunjukkan bahwa mahasiswa dengan nama yang dicari telah ditemukan dalam array tersebut dengan memperhatikan perbedaan huruf besar-kecil yang bersifat case-insensitive atau tidak terlalu sensitif.

2. Lakukan modifikasi pada program tersebut, sehingga jika data yang dicari tidak ditemukan, maka 
akan menampilkan “Data tidak ditemukan”!
jawab :

Pada pemrograman ini saya menggunakan boolean untuk menambahkan variabel dataDitemukan yang awalnya diatur sebagai false. Jika data ditemukan dalam loop, maka variabel ini akan diubah menjadi true. Setelah loop selesai, kami memeriksa variabel ini dan jika masih false, kami menampilkan pesan "Data tidak ditemukan!".

<img src=prak1-2.png>

3. Lakukan modifikasi pada program tersebut agar pencarian dilakukan bukan berdasarkan nama 
mahasiswa, melainkan berdasarkan IPK!
jawab :
Disini saya mengganti scanner pencariaan dari nama mahasiswa yang memiliki tipe data string lalu menggantinya menjadi pencarian berdasarkan ipk yang memiliki tipe datadouble. Kemudian, iterasi dilakukan melalui array mahasiswa dan membandingkan nilai IPK yang diinputkan dengan nilai IPK dari setiap objek mahasiswa. Jika ada kesesuaian, data mahasiswa yang sesuai akan ditampilkan. Jika tidak ada kesesuaian, program akan mencetak "Data tidak ditemukan!" setelah loop selesai.

<img src=prak1-3.png>


### Praktikum 2

<img src=prak2.png>

### 3 Pertanyaan
1. Perhatikan class PencarianMain, jelaskan fungsi dari kode kode program berikut ini!
   orderedSearch19 os= new orderedSearch19(data);

jawab :
Blok kode tersebut merupakan sebuah instansiasi dari suatu objek dari kelas orderesSearch dan proses ini merupakan proses terpenting karena bila tidak ada maka sebuah objek tidak akan daapat dibuat atau diwujudkan. 

orderedSearch19 os: Suatu deklarasi dan inisialisasi objek os dari kelas orderedSearch19. Dengan demikian, objek os yang akan digunakan untuk melakukan pencarian dalam array data.

new orderedSearch19(data): Ini adalah penggunaan konstruktor dari kelas orderedSearch19 untuk membuat objek os. Ketika objek os dibuat, konstruktor orderedSearch19 akan dijalankan, dan array data yang telah didefinisikan sebelumnya akan disalin ke dalam array arr di objek os.

2. Perhatikan class Pencarian, pada method Cari terdapat dua kali break. Jelaskan fungsi masing-masing break tersebut pada kode program tersebut!
jawab :
Pernyataan break pertama untuk menghentikan pencarian saat elemen yang dicari ditemukan, dan pernyataan break kedua menghentikan pencarian jika keyword lebih kecil dari elemen saat ini dalam array. Kedua pernyataan ini membantu mengoptimalkan pencarian dalam array yang diurutkan.
Pernyataan break kedua terletak dalam blok else. Fungsinya adalah untuk menghentikan loop pencarian jika keyword lebih kecil daripada elemen saat ini dalam array arr. Jika keyword yang dicari lebih kecil dari elemen saat ini, ini menunjukkan bahwa nilai keyword tidak akan ditemukan dalam array karena elemen-elemen setelah elemen saat ini juga pasti lebih besar. Jadi, tidak perlu melanjutkan pencarian, dan pernyataan break ini menghentikan loop.

3. Lakukan modifikasi pada program tersebut sehingga data array dapat bersifat dinamis (dapat diinputkan oleh pengguna)!
jawab :

<img src=prak2-3.png>



## Tugas
1. Menururt saya jenis sequential yang cocok adalah jenis ordered sequential karena data yang disediakan sudah disusun secara berurutan yang berakibat pada proses pencarian data akan menjadi lebih cepat dan efisien sehingga tidak memakan banyak waktu dalam proses pencariannya.
   
   <img src=tugas1.png>

2. 
   <img src=tugas2.png>

3. 
   <img src=tugas3.png>
   

4. <img src=prak2-3.png>


