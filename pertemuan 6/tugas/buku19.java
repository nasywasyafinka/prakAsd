package tugas;

public class buku19 {
    String judul;
    int halaman;
    double tinggi;
    public buku19(String nama,int hal,double ukuran){
        this.judul = nama;
        this.halaman = hal;
        this.tinggi = ukuran;
    }

    void output19() {
        System.out.println("Judul Buku\t: "+judul);
        System.out.println("Halaman Buku\t: "+halaman);
        System.out.println("Ukuran Buku\t: "+tinggi);
    }
}
