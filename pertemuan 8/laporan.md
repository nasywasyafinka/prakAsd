# LAPORAN PRAKTIKUM PERTEMUAN 9

LINKED LIST

Nama = Nasywa Syafinka Widyamara

Kelas = SIB 2B

NIM = 2241760002

## Praktikum 1

Hasil Praktikum

### Pertanyaan

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
2. Pada step 10, jelaskan kegunaan kode berikut
   
   <img src=ss1.2.png>

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut
   <img src=ss1.3.png>

Jawab :
1. Karena pada saat membuat instance dari singleLinkedList19, head dan tail diatur dnegan nilai null sehingga linked list awalnya kosong. Kemudian oleh method print() mengatur kondissi isEmpty() benar menjadi (true) karena head bernilai nulll sehingga pesan "Linked list kosong" tercetak.
   
2. Potngan kode tersebut memiliki fungsi untuk menyisipkan node baru yang bernama (ndInput) setelah node yang memilki data yang sesuai dengan key. 
   * ndInput.next = temp.next; =  Mengatur ndInput.next (yang awalnya null) menjadi node berikutnya dari temp. ndInput akan menunjuk ke node yang sebelumnya ditunjuk oleh temp, sehingga ndInput sekarang terhubung dengan node berikutnya dari temp.
   * temp.next = ndInput; = Setelah mengatur ndInput untuk menunjuk ke node berikutnya dari temp, langkah ini mengubah node berikutnya dari temp untuk menunjuk ke ndInput. Dengan kata lain, temp sekarang "menyambungkan" dirinya ke ndInput, sehingga ndInput telah disisipkan di antara temp dan node yang sebelumnya menjadi tetangga node temp
  
3. Memastikan bahwa variabel tail selalu menunjuk ke elemen terakhir dalam linked list. Ini diperlukan agar Anda dapat dengan mudah menambahkan elemen baru di belakang linked list (menggunakan addLast) tanpa perlu melakukan iterasi melalui seluruh linked list untuk menemukan elemen terakhir setiap kali. Sebagai gantinya, dengan mengubah referensi tail, Anda dapat langsung menambahkan elemen baru ke elemen terakhir yang ada dalam waktu konstan. 
   * temp.next.next == null: Kondisi ini memeriksa apakah elemen yang di-insert (elemen yang baru) akan menjadi elemen terakhir dalam linked list. Untuk melakukan ini, kita memeriksa apakah node berikutnya (temp.next) adalah node terakhir, yaitu, apakah node tersebut menunjuk ke null (temp.next.next == null).
   * tail = temp.next;: Jika kondisi di atas terpenuhi (artinya elemen baru akan menjadi elemen terakhir), maka kita memperbarui variabel tail untuk menunjuk ke elemen baru tersebut (temp.next). Dengan demikian, tail menunjuk ke elemen terakhir yang sesuai dengan elemen terakhir dalam linked list.

   

## Praktikum 2

Hasil Praktikum

<img src=prak2.png>

### Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
2. Jelaskan kegunaan kode dibawah pada method remove
   <img src=ss2.2.png>

3. Apa saja nilai kembalian yang dapat dikembalikan pada method indexOf? Jelaskan maksud masing-masing kembalian tersebut!
   
Jawab :
1. Untuk menghentikan iterasi melalui linked list setelah berhasil menyisipkan elemen baru. Saat elemen baru berhasil disisipkan setelah elemen dengan key yang sesuai, tidak ada lagi alasan untuk melanjutkan iterasi. Oleh karena itu, break digunakan untuk keluar dari loop do-while dan menghindari iterasi berlebihan yang tidak diperlukan.

2. Bagian else if (temp.next.data == key) dalam metode remove digunakan untuk menemukan elemen yang ingin dihapus. Jika elemen yang perlu dihapus ada di node yang berada tepat setelah temp, maka langkah ini mengubah referensi temp.next untuk mengarah langsung ke node yang berada dua langkah setelahnya (temp.next.next). 

3. Metode indexOf biasanya mengembalikan nilai indeks dari elemen pertama dalam linked list yang memiliki nilai data yang sesuai dengan nilai yang diberikan. Dalam kasus yang umum, nilai kembaliannya dapat berupa:

   - Indeks (tipe data integer): Ini adalah indeks elemen pertama yang sesuai yang ditemukan dalam linked list. Indeks dimulai dari 0 untuk elemen pertama.

   - Nilai kembalian negatif (biasanya -1): Ini adalah nilai yang sering digunakan jika elemen yang sesuai tidak ditemukan dalam linked list. Ini menandakan bahwa elemen yang dicari tidak ada dalam linked list.

   Nilai kembalian ini membantu untuk mengetahui posisi elemen dalam linked list atau jika elemen tidak ditemukan dalam linked list.


   ## Tugas 
   1. 