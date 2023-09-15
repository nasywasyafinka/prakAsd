import java.util.Scanner;
public class mainFaktorial19 {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        System.out.println("==========================================================");
        System.out.printf("Masukkan jumlah yang akan dihitung\t: ");
        int elemen = naswa.nextInt();

        Faktorial19[] fk = new Faktorial19[elemen];
        for (int i=0; i<elemen ;i++){
            fk[i]=new Faktorial19();
            System.out.print("Masukkan nilai data ke-"+(i+1)+"\t: ");
            fk[i].nilai=naswa.nextInt();
        }

        System.out.println("===========================================================");
        System.out.println("Hasil faktorial dengan Brute Force");
        for(int i=0; i<elemen ;i++){
            System.out.println("Hasil faktorial dari nilai "+fk[i].nilai+" adalah\t: "+fk[i].faktorialBF(fk[i].nilai));
         }
        System.out.println("===========================================================");
        System.out.println("Hasil faktorial dengan nilai Divide and Conquer");
        for(int i=0; i<elemen ;i++){
            System.out.println("Hasil faktorial dari nilai "+fk[i].nilai+" adalah\t: "+fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("===========================================================");
    }    
}
