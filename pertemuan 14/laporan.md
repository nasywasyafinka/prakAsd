# LAPORAN JOBSHEET 14 : HASH TABLE 
Nama : Nasywa Syafinka Widyamara

NIM : 2241760002

Kelas : SIB-2B

## Praktikum 1 
Hasil Percobaan

Sebelum penambahan method

<img src=prak1.png>

Sesudah penambahan method

<img src=prak1.1.png>

### Pertanyaan
1. Apa keunggulan penanganan collision menggunakan metode separate chaining dibandingkan dengan motode linear probing?

    Jawab: 
        
    Memiliki keunggulan sprti bisa melakukan pengelolaann kapasitas dalam Separate Chaining tabel hash yang tidak bisa penuh karena dapat menambahkan elemen baru pada linkedlist yang sudah ada, sedangkan pada Linear Probing adalah bisa terjadi clustering saat collision sehingga dapat memengaruhi pengerjaannya.

2. Apa maksud dari potongan kode berikut pada method hash()?
   
```java
int hash = 0;
for (int i = 0; i < key.length(); i++) {
    hash = (hash + key.charAt(i) * i) % this.dataMap.length;
}
```

    Jawab: 

    Menghasilkan nilai hash berdasarkan (key), int hash = 0 akan menyimpan nilai hash akhir, di perulangan for yaitu iterasi melalui setiap karakter dalam (key), lalu pada hash = (hash + key.charAt(i) * i) % this.dataMap.length; itu melibatkan perhitungan ASCII pada karakter (key.chartAt(i)) dan dikalikan sama (i), kemudian dijumlah dengan nilai hash yang ada, dan kemudian di modulo dengan panjang array dataMap.

3. Apa maksud dari potongan kode berikut pada method set()?
   
```java
else {
    Node current = this.dataMap[hash];
    if(current.key == key) {
        current.value += value;
        return;
    }
    while (current.next != null) {
        current = current.next;
        if(current.key == key) {
            current.value += value;
            return;
        }
    }
    current.next = newNode;
}
```

    Jawab:

    Untuk mengataasi hash collison, bila key cocok dengan key baru lalu node tersebut akan diperbarui, namun apabila tidak cocok akan mencari node berikutnya dalam linked list. Kemudain jika key yang sama ditemukan maka akan diperbarui, dan jika tidak node akan ditambahkan sebagai node terahir dalam linked list pada indeks tersebut. 

4. Buatlah method remove() untuk menghapus data berdasarkan key.

    Jawaban: 
    Penambahan kode pada kelas HashTable
        
    <img src=prak4.1.png>

    Penambahan kode pada kelas HashTableMain

    <img src=prak4.2.png>

    Hasil percobaan:
    
    <img src=prak4.png>



### Tugas 
1. Implementasikan kasus berikut dengan menggunakan hash table. Buatlah objek Mahasiswa dengan atribut sebagai berikut,

        NIM
        Nama Lengkap
        Jurusan
        Program Studi
2. Buatlah kelas HashTable yang dapat menyimpan objek Mahasiswa dengan spesifikasi,

        Key --> NIM mahasiswa
        Value --> Objek Mahasiswa
        Dapat menambahkan data mahasiswa dengan menggunakan inputan.
        Dapat mencari mahasiswa berdasarkan NIM.
        Dapat menghapus mahasiswa.
        Dapat menampilkan seluruh NIM mahasiswa yang telah tersimpan. 


Hasil tugas
<img src="T1.jpg">