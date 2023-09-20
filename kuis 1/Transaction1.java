class Transaction1 {
    private TransactionItem1[] items;//array milik objek-objek dari kelas TransactionItem1
    private int itemCount;
    private static final int MAX_ITEMS = 100;//menginisialisasi variabel dengan nama MAX_ITEMS sebagai variabel konstan (final) dengan nilai 100

    // Konstruktor untuk membuat objek Transaction
    public Transaction1() {
        items = new TransactionItem1[MAX_ITEMS];
        itemCount = 0;//awalnya belum ada item dalam transaksi
    }
    // Metode untuk menambahkan item ke dalam transaksi
    public void addItem(String itemName, int jml, double harga) {
        if (itemCount < MAX_ITEMS) {
            items[itemCount] = new TransactionItem1(itemName, jml, harga);
            itemCount++;//membuat objek baru dari kelas TransactionItem1 dengan nilai tertentu, 
            //kemudian menyimpan objek tersebut dalam array items di indeks yang sesuai, dan akhirnya menambah itemCount
        } else {
            System.out.println("Transaksi penuh. Tidak dapat menambahkan item.");
        }
    }
    // Metode untuk menghapus item dari transaksi
    public void updateItem(int index, String newName, int newJml, double newHarga) {
        if (index >= 0 && index < itemCount) {//memeriksa apakah nilai index berada dalam rentang yang valid untuk indeks array items
            items[index].setItemName(newName);//untuk mengubah atribut-atribut objek dalam array items pada indeks yang telah ditentukan 
            items[index].setJml(newJml);//dengan nilai-nilai baru yang disediakan oleh newName, newJml, dan newHarga
            items[index].setHarga(newHarga);
        } else {
            System.out.println("Item tidak valid");
        }
    }
    // Metode untuk mengupdate item dari transaksi
    public void removeItem(int index) {
        if (index >= 0 && index < itemCount) {
            for (int i = index; i < itemCount - 1; i++) {
                items[i] = items[i + 1];
            }
            items[itemCount - 1] = null;//untuk mengakses item terakhir dalam array items
            itemCount--;//untuk mengurangkan nilai dari variabel 
        } else {
            System.out.println("Item tidak valid");
        }
    }

    // Metode untuk mengecek dan menampilkan transaksi
    public void viewItems() {
        for (int i = 0; i < itemCount; i++) {
            String table = "| %-7d | %-16s | %-11d | %-19s | %n";
    System.out.println("+----------------------------------------------------------------+");
    System.out.println("|                      DATA PESANAN CUSTOMER                     |");
    System.out.println("+---------+------------------+-------------+---------------------+");
    System.out.println("| ID Item |    Nama Item     | Jumlah Item |      Harga Item     |");
    System.out.println("+---------+------------------+-------------+---------------------+");
    System.out.format(table, (i + 1), items[i].getItemName(),items[i].getJml(),items[i].getHarga());
        }
    }

    // Metode untuk mengcheck out belanja
    public void checkOut() {
        double total = totalCost();
        if (total < 0) {
            System.out.println("Terdapat error saat memasukkan pesanan");
        } else {
            System.out.println("Transaksi Berhasil !!");
            System.out.println("Total Pesanan: Rp " + total);
        }
    }

    // Metode untuk menghitung total belanja beserta diskonnya
    public double totalCost() {
        double total = 0;//deklarasi variabel untuk menghitung jumlah total dalam bentuk angka desimal 
        boolean hasError = false;//untuk melacak apakah ada kesalahan dalam proses 

        for (int i = 0; i < itemCount; i++) {//loopingn untuk menghitung total dari subtotal dari setiap item dalam array items
            double subtotal = items[i].calculateSubtotal();//digunakan untuk menghitung subtotal dari item yang sedang diiterasi
            if (subtotal < 0) {//memeriksa apakah subtotal sat ini kurang dari 0
                hasError = true;//akan berubah menjadi true untuk menandakan bahwa ada kesalahan
                break;//perulangan akan dihentikan menggunakan pernyataan break
            }
            total += subtotal;//untuk menghitung total dari semua subtotal item dalam array
        }

        if (hasError) {//untuk memeriksa apakah variabel hasError memiliki nilai true atau false
            return -1;
        }

        double diskon = 0;
        if (total > 500000) {
            diskon = 0.10;// Diskon 10% untuk total belanja di atas Rp500.000
        } else if (total > 300000) {
            diskon = 0.08;// Diskon 8% untuk total belanja di atas Rp300.000
        } else if (total > 200000) {
            diskon = 0.05;// Diskon 5% untuk total belanja di atas Rp200.000
        }

        return total - (total * diskon);
    }
}