# LAPORAN PRAKTIKUM ASD 
# QUEUE
NAMA = NASYWA SYAFINKA WIDYAMARA

KELAS = SIB 2B

NIM = 2241760002

## Praktikum 1
Hasil Percobaan

<img src=prak1.png>

### Pertanyaan 
1. Pada method Create, mengapa atribut front dan rear diinisialisasi dengan nilai -1, tidak 0?
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
3. Perhatikan kembali method Enqueue, baris kode program manakah yang menunjukkan bahwa 
data baru disimpan pada posisi terakhir di dalam queue?
4. Perhatikan kembali method Dequeue, baris kode program manakah yang menunjukkan bahwa 
data yang dikeluarkan adalah data pada posisi paling depan di dalam queue?
5. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
6. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), 
melainkan int i=front?
7. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
   

Jawab :

1. Apabila diisi 0 maka akan merujuk ke data pada index ke 0, sedangkan jika -1, pada array tidak ada index ke -1, index pada array dimulai dari 0 jadi jika ditulis -1 berarti tidak merujuk pada index manapun.
2. Jika rear memiliki nilai max-1 maka elemen berikutnya akan dimasukkan di front yaitu pada index ke 0.
3. q[rear] = data;
4. data = q[front];
5. Saat front mempunyai nilai yang sama dengan nilai max-1, maka front akan diatur ulang ke 0 agar antrian berputar dan elemen selanjutnya dapat dikeluarkan dari awal antrian.
6. Karena pada front tidak selalu ada pada index 0, front adalah antrian yang berada di paling depan tapi tidak selalu di index 0.
7. Pada variabel i akan di update dengan i+1, lalu akan di modulo dengan max, modulo membuat i akan selalu ada di antara 0 - max.


## Praktikum 2
Hasil Percobaan

<img src=prak2.png>

### Pertanyaan 
1. Perhatikan class Queue, apa fungsi kode program berikut pada method Dequeue?
2. Pada soal nomor 1, apabila kode program tersebut diganti dengan kode berikut:
Penumpang data = new Penumpang()
Apakah yang terjadi? Mengapa demikian?
3. Tunjukkan kode program yang digunakan untuk menampilkan data yang dikeluarkan dari queue!
4. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class 
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula 
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!


Jawab =
1. Potongaan kode program tersebut memiliki fungsi untuk membuat objek baru dengan nama data dari penumpang yang memiliki parameter, kemudian terdapat parameter yang diisi dengan data kosong (string kosong(" "), int kosong (0)) yang nanti akan diinputkan datanya.
2. Bila kode tersebut diganti maka akn terjadi error sebab parameter tidak dimasukkan dalam kode tersebut padahal pada class penumpang terdapat parameter ddi dalamnya.
3. Terdapat pada kelas penumpangMain pada baris kode no 39-45
   
case 2:
                penumpang data = antri.dequeue();
                if (!"".equals(data.nama)&& !"".equals(data.kotaAsal)&& !"".equals(data.kotaTujuan)
                && data.jumlahTiket != 0 && data.harga != 0){
                    System.out.println("Antrian yang keluar: "+data.nama+" "+data.kotaAsal+" "+data.kotaTujuan+" "+data.jumlahTiket+" "+data.harga);
                    break;
                }

4. Berikut adalah hasilnya
   
<img src=prak2.4.png>

5. Berikut adalah hasil dari menu ke 5 yaitu cek antrian terakhir
   
<img src=prak2.5.png>

## Tugas
1. Hasil perubahan
a. Method peekPosition(data: int) : void
Berfungsi sebagai penampil posisi dari sebuah data di dalam queue, misalnya dengan mengirimkan data tertentu, akan diketahui posisi (indeks) data tersebut berada di urutan keberapa.

<img src=tugas1.1.png>

b. Method peekAt(position: int) : void
Untuk menampilkan data yang berada pada posisi (indeks) tertentu
Sesuaikan daftar menu yang terdapat pada class QueueMain sehingga kedua method tersebut dapat dipanggil!

<img src=tugas1.2.png>

2. Hasil percobaan
   
<img src=tugas2.1.png>
<img src=tugas2.2.png>
<img src=tugas2.3.png>
<img src=tugas2.4.png>
<img src=tugas2.5.png>