# LAPORAN PRAKTIKUM PERTEMUAN 6 

SEARCHING DAN SORTING

## Percobaan 1
Sorting - Bubble Sort

Hasil percobaan

<img src=prak1.1.png>

Sorting - Selection Sort

<img src=prak1.2.png>

Pertanyaan
1. Jelaskan maksud dari kode berikut
   
   sort19 urut=new sort19(a,a.length);
   
2. Jelaskan fungsi kode program berikut
   
   temp=data[j];

   data[j]=data[j-1];

   data[j-1]=temp;

3. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada
selection sort!
4. Kerjakan kembali program pengurutan menggunakan algoritma bublle sort dan 
SelectionSort di atas dengan pengurutan secara DESC!

Jawab :

1. * Bublesort19 = nama variabel untuk menyimpan objek baru yang akan dibuat.
   
   * urut = variabel yang digunakan untuk merujuk objek yang dibuat
   
   * new = kata kunci untuk membuat objek baru dari kelas.
   
   * sort19 = kelas untuk membuat objek baru.
   
   * a = parameter pertama yang digunakan untuk menginisialisasi objek dari kelas sort19. 

   * a.length =  parameter kedua yang berfungsi untuk menginisialisasi objek dari kelas sort19. Ini mengacu pada panjang atau ukuran array a.
   
   Dengan demikian, kode tersebut membuat sebuah objek dari kelas sort19 yang  digunakan untuk melakukan pengurutan array a menggunakan algoritma Bubble Sort.

2. Kode tersebuet merupakan potongan kode berupa algoritma Bubble Sort atau pertukaran (swap) dua elemen dalam array. Fungsi dari kode program tersebut adalah menukar posisi dua elemen dalam array, yang digunakan untuk mengurutkan elemen-elemen array dengan cara membandingkan elemen-elemen secara berpasangan dan menukarnya jika diperlukan.
3.  Berikutu adaalah penjelasan kode program beserta screenshootnya
   
   <img src=prak1.2.3.png>

   * Loop pertama (iterasi luar) berjalan melalui elemen-elemen dari indeks 0 hingga jumData - 1. Ini mengatur elemen pertama sebagai elemen terkecil yang dianggap sementara.
   * Loop kedua (iterasi dalam) digunakan untuk mencari elemen terkecil dalam sisa array yang belum diurutkan, dimulai dari indeks berikutnya (i + 1) hingga indeks terakhir (jumData - 1). Jika elemen yang lebih kecil ditemukan, indeks minimum (min) diperbarui.
   * Setelah mencari elemen terkecil dalam sisa array, elemen terkecil tersebut ditukar dengan elemen pertama dalam sisa array yang belum diurutkan. Ini dilakukan dengan menggunakan variabel sementara (temp) untuk menyimpan nilai sementara selama pertukaran.
   * Setelah loop luar selesai, seluruh array dianggap sudah terurut. Kode kemudian menampilkan array yang telah diurutkan.
   * Hasilnya adalah bahwa elemen-elemen dalam array akan diurutkan dari yang terkecil hingga yang terbesar setelah metode selectionSort selesai dijalankan.

   


## Praktikum 2
Menggunakan array of object

Hasil Percobaan 

<img src=prak2.1.png>

<img src=prak2.2.png>

<img src=prak2.3.png>


 Menambahkan Proses Selection Sort di dalam Clas DaftarMahasiswaBerprestasi

 Hasil Percobaan
 <img src=prak2.3.1.png>

 <img src=prak2.3.2.png>

 <img src=prak2.3.3.png>

 <img src=prak2.3.4.png>



Pertanyaan
1. Tunjukkan proses pencarian nilai minimum pada algoritma Selection Sort yang telah 
dipraktikkan pada pertemuan ini (bukti screen shoot kode program dan penjelasan)!
  
2. Jelaskan perbedaan proses swap yang terjadi pada Bubble Sort dengan Selection 
Sort!

3. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
   <img src=ss2.3.png>
   
   Jelaskan tujuan dari baris program tersebut

4. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
   
   <img src=ss2.3.png>

a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j? 

b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?

c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?

d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i 
akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?

5. Di dalam method selection sort, terdapat baris program seperti di bawah ini:
<img src=ss2.5.png>
Untuk apakah proses tersebut?


Jawab :


1. Berikut kode programnya beserta dengan penjelasan di bawahnya.

<img src=jwb2.1.png>

* Loop pertama (iterasi luar) berjalan melalui elemen-elemen dari indeks 0 hingga listMhs.length - 1. Pada awalnya, elemen di indeks saat ini dianggap sebagai elemen terkecil.
* Loop kedua (iterasi dalam) digunakan untuk mencari elemen dengan IPK terendah dalam sisa array yang belum diurutkan, dimulai dari indeks berikutnya (i + 1) hingga indeks terakhir (listMhs.length - 1). Jika IPK yang lebih rendah ditemukan, indeks minimum (idxMin) diperbarui.
* Setelah mencari elemen dengan IPK terendah dalam sisa array, elemen tersebut ditukar dengan elemen pada indeks saat ini. Ini dilakukan dengan menggunakan variabel sementara (tmp) untuk menyimpan objek mahasiswa sementara selama pertukaran.
* Setelah loop luar selesai, seluruh array dianggap sudah terurut berdasarkan nilai IPK, dengan mahasiswa yang memiliki IPK terendah berada di indeks terdepan.
  
2. Perbedaan utama adalah cara kedua algoritma ini mencari elemen yang akan ditukar dan bagaimana pertukaran dilakukan. Bubble Sort memindahkan elemen terbesar ke posisi terakhir, sedangkan Selection Sort mencari elemen minimum dan langsung menukarkannya dengan elemen yang sedang diurutkan. Selection Sort lebih efisien dalam hal jumlah pertukaran karena hanya melakukan satu pertukaran dalam setiap iterasi, sedangkan Bubble Sort dapat melibatkan banyak pertukaran dalam satu iterasi.
3. Maksud dari potongan baris-baris kode tersebut melakukan pertukaran (swap) elemen antara elemen yang sedang diurutkan dan elemen dengan nilai IPK terendah yang ditemukan dalam sisa array yang belum diurutkan.
   * mhs19 tmp = listMhs[idxMin]; = Nilai dari elemen pada indeks idxMin (elemen dengan IPK terendah yang ditemukan dalam pencarian nilai minimum) disalin ke dalam variabel sementara (tmp). Ini dilakukan untuk menyimpan sementara nilai dari elemen yang akan dipindahkan.
   * listMhs[idxMin] = listMhs[i]; = Nilai dari elemen pada indeks i (elemen yang sedang diurutkan) ditukar dengan nilai dari elemen minimum yang disalin ke dalam tmp. Elemen dengan nilai IPK terendah ditempatkan pada posisi yang benar (urutan pengurutan).
   * listMhs[i] = tmp; = Nilai yang disalin ke dalam tmp (nilai dari elemen minimum) ditukar dengan nilai dari elemen yang sebelumnya berada di indeks i. Pada langkah ini, elemen yang sebelumnya berada di indeks i (elemen yang sedang diurutkan) dipindahkan ke posisi indeks minimum.
4. 
a. 
   * Perulangan i digunakan untuk mengontrol berapa kali iterasi besar dari algoritma Bubble Sort akan dijalankan. Setiap iterasi i mengurangi jumlah elemen yang harus diurutkan.
   * Perulangan j digunakan untuk membandingkan pasangan elemen dalam setiap iterasi. Setiap iterasi j berjalan melalui elemen-elemen yang belum terurut pada saat iterasi tersebut.
  
b. Syarat perulangan i adalah i < listMhs.length - 1:

* Alasan syarat ini adalah karena algoritma Bubble Sort memerlukan (n - 1) iterasi untuk mengurutkan n elemen dalam array. Ini karena elemen terbesar akan naik ke posisi yang benar setelah (n - 1) iterasi. Jika kita tidak membatasi iterasi i hingga i < listMhs.length - 1, maka akan ada iterasi berlebihan yang tidak diperlukan.
  
c. Syarat perulangan j adalah j < listMhs.length - i:
* Syarat ini mengontrol sejauh mana perulangan j harus berjalan pada setiap iterasi i. Pada setiap iterasi i, elemen-elemen terbesar yang telah diurutkan akan berada di ujung array, dan kita tidak perlu membandingkannya lagi. Oleh karena itu, iterasi j hanya pada elemen-elemen yang belum terurut (yaitu, listMhs.length - i elemen yang tersisa).
  
d. Jumlah iterasi i dan tahap Bubble Sort:
* Jika banyak data dalam listMhs adalah 50, maka perulangan i akan berlangsung sebanyak 49 kali, yaitu mulai dari 0 hingga 48 (i mulai dari 0 dan berakhir di 48, mengingat syarat i < listMhs.length - 1).

5. Untuk mencari indeks elemen minimum dalam array objek mahasiswa (listMhs). 



## Tugas

 1. Berikut adalah hasil dari kdoe program dari tugas 1
   
   <img src=tugas1.1.png>

   <img src=tugas1.2.png>

   <img src=tugas1.3.png>

   <img src=tugas1.4.png>

   
 2. Agar program dapat menyeleksi tinggi badan siswa yang diterima sebagai anggota paskibraka dengan ketentuan siswa yang lolos seleksi adalah tinggi badannya minimal 170 cm, saya menambahkan if else dalam fungsi pilih19() pada kelas anggotaPaskibraka19() seperti berikut.
   
   Dan inilah hasil dari kode program yang telah ditambahkan sintaks if else. Calon anggota yang memeiliki tinggi badan di bawah 170 akan otomatis tidak lolos dan hanya pemilik tinggi badan di atas 170 lah yang lolos dalam proses pemilihan. 

   <img src=code2.2.png>

   Berikut adalah hasil setelah penambahan kode.

   <img src=tugas2.1.png>

   <img src=tugas2.2.png>

   <img src=tugas2.3.png>

   <img src=tugas2.4.png>


3. Berikut ini adalah hasil dari ketentuan yang telah ditetapkan.
   
   <img src=tugas3.1.png>

   <img src=tugas3.2.png>

   <img src=tugas3.3.png>

