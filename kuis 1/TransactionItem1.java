class TransactionItem1 {
    private String itemName;//deklarasi variabel dengan modifier private karena hanya dapat diakses dari dalam kelas yang sama.
    private int jml;
    private double harga;

    public TransactionItem1(String itemName, int jml, double harga) {//deklarasi konstruktor dengan 3 parameter
        this.itemName = itemName;//inisialisasi untuk memanggil konstruktor lain dalam kelas yang sama
        this.jml = jml;
        this.harga = harga;
    }
    public String getItemName() {//metode yang digunakan untuk mengembalikan nilai dari variabel itemName
        return itemName;
    }
    public void setItemName(String itemName) {//metode ini menerima parameter itemName yang merupakan tipe data string        this.itemName = itemName;
    }
    public int getJml() {//getter
        return jml;
    }
    public void setJml(int jml) {//setter
        this.jml = jml;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double calculateSubtotal() {
        return jml * harga;
    }
}
