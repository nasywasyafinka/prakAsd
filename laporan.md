# LAPORAN PRAKTIKUM PERTEMUAN 10
# DOUBLE LINKED LIST
NAMA = NASYWA SYAFINKA WIDYAMARA

KELAS = SIB 2B

NIM = 2241760002

## Praktikum 1
Hasil Percobaan

<img src=prak1.png>

### Pertanyaan
1.  Jelaskan perbedaan antara single linked list dengan doubly linked lists!
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut
tersebut?
3. Perhatikan konstruktor pada class DoublyLinkedList. Apa kegunaan inisialisasi atribut head dan size?
4. Pada method addFirst(), mengapa dalam pembuatan objek dari konstruktor class Node prev dianggap sama dengan null?
   
   head = new Node(null, data, null);

5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode?
6. Perhatikan isi method addLast(), apa arti dari pembuatan objek Node dengan mengisikan parameter prev dengan current, dan next dengan null
   
   Node newNode = new Node(current, data, null);

7. Pada method add(), terdapat potongan kode program sebagai berikut
   if (current.prev == null) {
    Node newNode = new Node(null, data, current);
    current.prev = newNode;
    head = newNode;
}

### Jawaban
1. - **Single Linked List**: node dalam single linked list memiliki referensi hanya ke node berikutnya (next node). Hanya dapat mengakses elemen dari depan ke belakang, dan untuk mengakses elemen sebelumnya, harus mengunjungi node dari awal kembali.
   - **Doubly Linked List**: nodenya apunya dua referensi, yaitu ke node berikutnya (next node) dan ke node sebelumnya (previous node). Dapat mengakses elemen dari depan ke belakang dan sebaliknya jadinya sdkiti lebih efisien karena memiliki akses ke node sebelumnya.

2. Untuk menunjukkan referensi ke node berikutnya (next node) dan node sebelumnya (previous node) dalam linked list. 
   
3. Konstruktor dalam class DoublyLinkedList digunakan untuk menginisialisasi atribut head dan size dari linked list:
   - head=menunjukkan node pertama dalam linked list (biasanya node pertama adalah node awal).
   - size=melacak jumlah elemen dalam linked list. Ketika linked list baru dibuat (kosong),size diatur menjadi 0.

4. Node yang baru dibuat memiliki prev yang diatur ke null karena itu adalah elemen pertama dalam linked list. Dalam linked list ganda, prev dari elemen pertama selalu harus null.

5. Maksdnya adalah prev dari node sebelumnya (sebelum menambahkan elemen baru ke depan) adalah node yang baru dimana menghubungkan elemen baru ke elemen sebelumnya dalam double linked list.

6. Dalam method addLast(), pembuatan objek `Node` dengan `prev` yang diatur sebagai `current` digunakan untuk menghubungkan elemen baru ke elemen yang sebelumnya adalah elemen terakhir dalam linked list. 

7. Dalam method `add()`, potongan kode programnyyaa digunnakan untuk menangani kasus ketika elemen ditambahkan di posisi tengah atau di depan dari linked list ganda. Jika `current.prev == null`, itu berarti elemen baru akan menjadi elemen pertama, dan `head` diubah menjadi elemen baru. Ini terjadi ketika elemen ditambahkan di posisi indeks 0. Jika elemen ditambahkan di posisi lain (indeks lebih dari 0), maka dua node (elemen sebelumnya dan elemen baru) dihubungkan dengan benar melalui atribut `prev` dan `next`, sehingga elemen baru masuk ke dalam linked list di posisi yang benar. 


## Praktikum 2
Hasil Percobaan

<img src=prak2.png>

### Pertanyaan
1. Apakah maksud statement berikut pada method removeFirst()?
   
   head = head.next;
   head.prev = null;
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
   
3. Jelaskan alasan mengapa potongan kode program di bawah ini tidak cocok untuk perintah remove!

Node tmp = head.next;
head.next = tmp.next;
tmp.next.prev = head;

4. Jelaskan fungsi kode program berikut ini pada fungsi remove!

current.prev.next = current.next;
current.next.prev = current.prev;

### Jawaban
1. Beerfungsi untuk menggeser `head` ke elemen berikutnya dalam linked list, sehingga elemen yang pertama dihapus dari linked list. Kemudian, `head.prev` diatur ke `null` karena elemen pertama dalam linked list sekarang tidak memiliki elemen sebelumnya.

2. Pada method `removeLast()`, posisi data berada pada bagian akhir dengan mengiterasi melalui linked list sampai Anda mencapai elemen terakhir. Saat elemen terakhir ditemukan, `current.next` akan menjadi null.

3. Potongan kode program tersesbut tdk cocok diberikan untuk metthod remove karena mempertimbangkan padaa elemen yang akan dihapus adalah elemen terakhir dalam linked list. Jika elemen terakhir dihapus dengan cara ini, maka elemen sebelumnya tidak akan memiliki referensi ke elemen berikutnya, dan elemen terakhir tersebut akan menjadi "sampah" yang tidak terhubung dengan linked list. Maka dari ituu, perlu diperiksadulu apakah elemen yang akan dihapus adalah elemen terakhir sebelum menghapusnya.

4. Potongan kode program `current.prev.next = current.next;` dan `current.next.prev = current.prev;` dalam method `remove()` digunakan untuk menghapus elemen di posisi tertentu dalam linked list. Kode ini mengatur referensi `next` dari elemen sebelumnya untuk menunjuk ke elemen berikutnya setelah elemen yang dihapus, dan mengatur referensi `prev` dari elemen berikutnya untuk menunjuk ke elemen sebelumnya sebelum elemen yang dihapus. 
   

## Praktikum 3
Hasil Percobaan

<img src=prak3.1.png>

<img src=prak3.2.png>

### Pertanyaan
1. Jelaskan method size() pada class DoublyLinkedList
   
2. Jelaskan cara mengatur indeks pada doubly linked lists supaya dapat dimulai dari indeks ke-1!
   
3. Jelaskan perbedaan karakteristik fungsi Add pada doubly linked list dan single linked list!
   
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!
   
    Kode 1

    public boolean isEmpty() {
        if(size==0) {
            return true;
        } else {
          return false;
      }
    }

    Kode 2

    public boolean isEmpty() {
        return head == null;
    }

### Jawaban
1. Mengembalikan jumlah elemen (node) dalam linked list.
   
2. Mengatur indeks pada doubly linked list dimulai dari indeks ke-1, dengan cara mengubah cara indeks dihitung dan digunakan dalam operasi-operasi seperti add, remove, get.

3. Perbedaan fungsi add pada doubly linked list dan single linked list:
   - Doubly linked list memungkinkan adanya pengaksessan kode ke belakang (ke node sebelumnya) dan ke depan (ke node berikutnya) dari node tertentu, sementara single linked list hanya memungkinkan akses ke depan.
   - Pada doubly linked list, setiap node memiliki referensi ke node sebelumnya (prev) dan node berikutnya (next), sehingga operasi penghapusan atau penambahan dapat dilakukan dengan lebih efisien karena tidak perlu melakukan pengaksesan mundur dari awal.
   - Single linked list hanya memiliki referensi ke node berikutnya, sehingga untuk melakukan operasi seperti menghapus node tertentu, jdi perlu melacak node sebelumnya dengan melakukan pengaksesan dari awal.

4. Perbedaan logika antara kedua kode program di bawah ini adalah:
   - Kode 1: Menggunakan pengecekan langsung jika `size` adalah 0, dan jika benar, mengembalikan `true`. Jika tidak, mengembalikan `false`. 
   - Kode 2: Ini menggunakan pengecekan apakah `head` (kepala) linked list adalah `null` untuk menentukan apakah linked list kosong. Jika `head` adalah `null`, itu berarti linked list kosong, dan kode mengembalikan `true`. Jika `head` tidak `null`, itu berarti ada elemen dalam linked list, dan kode mengembalikan `false`.


## Tugas
1. 