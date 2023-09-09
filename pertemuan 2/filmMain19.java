public class filmMain19{
    public static void main(String[] args) {
        film19 film1=new film19();
        film1.judul="Quantumania mancing";
        film1.genre="Action comedy";
        film1.rate="Remaja";
        film1.jmltiket=3000;
        film1.harga=40000;

        film1.tambahTiket(1);
        film1.kurangTiket(3);
        film1.tampilfilm();

        int income=film1.totRevenue(4);
        System.out.println("Total jual 4 tiket= "+income);
        System.out.println("========================\n");
        film19 film2= new film19("Maniquantum", "Horor", "Dewasa", 2000, 40000);
        film2.tampilfilm();

        barang film3=new barang("Paket 1 = Salted Pop Corn + Milo Ice",65000);
        System.out.println("Nama paket: "+film3.barang);
        System.out.println("Harga: "+film3.harga);
        film2.tampilfilm();

    }
}
