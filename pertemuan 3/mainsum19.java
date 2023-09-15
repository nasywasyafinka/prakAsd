import java.util.Scanner;

public class mainsum19 {
    public static void main(String[] args) {
        Scanner naswa=new Scanner(System.in);
        System.out.println("==========================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan juta, misal 5.9)");
        System.out.printf("Masukkan jumlah bulan\t: ");
        int elm = naswa.nextInt();

        sum19 sm = new sum19(elm);
        System.out.println("==========================================================");
        for (int i=0; i<sm.elemen ;i++){
            System.out.print("Masukkan keuntungan bulan ke-"+(i+1)+"\t: ");
            sm.keuntungan[i]=naswa.nextDouble();
        }
        System.out.println("==========================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah\t: "+sm.totalBF(sm.keuntungan));
        System.out.println("==========================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.print("Total hubungan perusahaan selma "+sm.elemen+" bulan adalah\t: "+sm.totalDC(sm.keuntungan,0,sm.elemen-1));
    }
}
