# LAPORAN PRAKTIKUM PERTEMUAN 11
# TREE AND BINARY TREE
NAMA = NASYWA SYAFINKA WIDYAMARA

KELAS = SIB 2B

NIM = 2241760002

## Praktikum 1
Hasil Percobaan
<img src=prak1.png>

### Pertanyaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
2. Apa fungsi atribut left dan right pada class Node?
3. Simak pertanyaan berikut,
   
a. Apa kegunaan dari atribut root di dalam class BinaryTree?

b. Ketika objek tree pertama kali dibuat, apa nilai dari root?

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?

if(data < current.data) {
    if(current.left != null) {
        current = current.left;
    } else {
        current.left = new Node(data);
        break;
    }
}

Jawab :
1. Karrena BST(Binary Search Tree) memiliki struktur yang terorganisir dengan aturan tertentu. Dalam BST, setiap node memiliki dua anak, yaitu anak kiri dan anak kanan. Aturan utama BST adalah bahwa semua nilai di anak kiri harus kurang dari nilai pada node tersebut, dan semua nilai di anak kanan harus lebih besar dari nilai pada node tersebut. Karena aturan ini, pencarian data dalam BST dapat dilakukan dengan cepat.

2. Atribut "left" dan "right" dalam class Node pada pohon binary digunakan untuk menghubungkan node ke anak kiri dan anak kanan.

3. a. Atribut "root" dalam class BinaryTree digunakan untuk menunjukkan node pertama atau akar dari pohon dimana ini merupakan node utama dari pohon dan menjadi titik awal untuk melakukan operasi lainnya pada pohon tersebut.

   b. Ketika objek tree pertama kali dibuat, nilai dari atribut "root" biasanya akan diatur sebagai `null` karena pohon masih kosong. Saat pertama kali membuat pohon, belum ada node yang ada di dalamnya.

4. Ketika pohon masih kosong dan akan ditambahkan sebuah node baru, proses yang akan terjadi adalah:

   - Node baru akan dibuat dengan nilai yang akan dimasukkan.
   - Node baru ini akan menjadi akar (root) dari pohon karena tidak ada node lain di dalamnya. Atribut "root" akan menunjuk ke node baru ini.

5. 
   - `if(data < current.data)`: memeriksa apakah data yang ingin ditambahkan lebih kecil daripada data pada node "current". Jika iya, maka data harus ditempatkan di anak kiri node "current".

   - `if(current.left != null)`: apakah anak kiri dari "current" sudah ada. Jika sudah ada, maka kita akan pindah ke anak kiri ini untuk melanjutkan pencarian atau penambahan data lebih lanjut.

   - `current = current.left;`: jika anak kiri dari "current" sudah ada, maka "current" akan diubah menjadi anak kiri tersebut sehingga pencarian atau penambahan data akan berlanjut pada subtree kiri.

   - `current.left = new Node(data);`: apabilla anak kiri dari "current" belum ada (yaitu `current.left == null`), maka node baru dengan nilai "data" akan dibuat dan diatur sebagai anak kiri dari "current".

   - `break;`: untuk mengakhiri loop atau iterasi pencarian atau penambahan data. Setelah menambahkan node, tidak perlu melanjutkan pencarian atau penambahan lagi, jadi loop dihentikan.
   - 
## Praktikum 2
Hasil Percobaan
<img src=prak2.png>

### Pertanyaaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
2. Apakah kegunaan dari method populateData()?
3. Apakah kegunaan dari method traverseInOrder()?
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?

jawab :
1. Menyimpan nilai yang terkait dengan tiap node dalam pohon biner yang diwakili sebagai array. Atribut "idxLast" digunakan untuk menyimpan indeks terakhir (tertinggi) di array yang berisi node-node dalam pohon. 
   
2. Method "populateData()" berfungsi untuk mengisi data ke dalam array yang digunakan untuk mendskripsikhan pohon biner. 

3. Method "traverseInOrder()" digunakan untuk melakukan penelusuran atau traversal pohon biner secara urut (in-order traversal). Dalam in-order traversal, kita mengunjungi node-node dalam urutan berikut:

   - Mengunjungi anak kiri.
   - Mengunjungi node saat ini.
   - Mengunjungi anak kanan.

   Ini digunakan untuk mencetak atau mengakses data dalam urutan terurut dalam pohon biner.

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka indeks left child (anak kiri) akan menjadi 2 * 2 + 1 = 5, dan indeks right child (anak kanan) akan menjadi 2 * 2 + 2 = 6. Ini mengikuti aturan indeks array untuk representasi pohon biner, di mana indeks parent node "p" memiliki indeks anak kiri "2p + 1" dan indeks anak kanan "2p + 2."

5. Statement `int idxLast = 6` pada praktikum 2 percobaan nomor 4 digunakan untuk menginisialisasi atau mengatur nilai dari variabel "idxLast" menjadi 6. Ini mungkin dilakukan untuk menunjukkan bahwa ada 6 elemen atau node dalam array yang digunakan untuk merepresentasikan pohon biner dalam kasus tersebut. 


### Tugas 
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara rekursif.
2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree.
3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf.
4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada di dalam tree.
5. Modifikasi class BinaryTreeArray, dan tambahkan : 
method add(int data) untuk memasukan data ke dalam tree 
method traversePreOrder() dan traversePostOrder().