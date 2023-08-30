
public class tugas2_19 {
    public static void main(String[] args) {
        int uang=1000000, bulan;
            for(bulan=0; uang <= 1500000; bulan++){
                uang += uang * 0.02;
            }
        System.out.println("Saldo mencapai Rp 1500000 di bulan ke-"+bulan);
    }
}
