public class tugas1_19{
    public static void main(String[] args) {
        int berat[]={4,15,6,11};
        int total=0;
        double totAkhir=0;
            for(int i=0; i<berat.length ;i++) {
                total += berat[i] * 4500;
                if (berat[i]>10) {
                    totAkhir = total - (total*0.5);
                }
            }
            System.out.println("Pemasukan\t: Rp "+totAkhir);
    }
}