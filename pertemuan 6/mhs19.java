public class mhs19 {
    String nama;
    int thnMasuk,umur;
    double ipk;

    mhs19 (String n, int t, int u, double i){
        nama=n;
        thnMasuk=t;
        umur=u;
        ipk=i;
    }
    public void tampil(){
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Tahun Masuk\t: "+thnMasuk);
        System.out.println("Umur\t\t: "+umur);
        System.out.println("IPK\t\t: "+ipk);
    }
}
