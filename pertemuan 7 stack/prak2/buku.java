package prak2;

public class buku {
    public String judul, namaPengarang;
    public int tahunTerbit, jmlHalaman, harga;
    public buku(String jd, String nm, int thn, int hal, int hg) {
        this.judul = jd;
        this.namaPengarang = nm;
        this.tahunTerbit = thn;
        this.jmlHalaman = hal;
        this.harga = hg;
    }
}
