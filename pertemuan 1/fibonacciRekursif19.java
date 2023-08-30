import java.util.Scanner;
public class fibonacciRekursif19 {
    public static int rekrusif(int angka){
        if(angka == 0) {
            return 0;
        } if(angka ==1) {
            return 1;
        }
        return rekrusif(angka-1) +rekrusif(angka-2);
    }
    public static void main(String[] args) {
        Scanner wawa=new Scanner(System.in);
        System.out.printf("Masukkan Batas Angka\t: ");
        int batas=wawa.nextInt();
        System.out.println("***********rekrusif***********");
            for(int i=0; i<batas ;i++) {
                int hasil=rekrusif(i);
                System.out.print(hasil+", ");
            }

        System.out.println("\n**********perulangan**********");
        int bilAkhir=0, bil_1=0, bil_2=1;
        int a=0;
        while (a<batas) {
            System.out.print(bilAkhir+", ");
            bilAkhir=bil_1+bil_2;
            bil_2=bil_1;
            bil_1=bilAkhir;
            a++;
        } System.out.println("\n");
    }
}
