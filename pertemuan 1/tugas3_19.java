import java.util.Scanner;
public class tugas3_19 {
    public static void main(String[] args) {
        Scanner ww=new Scanner(System.in);
        System.out.printf("Masukkan Nilai n\t: ");
        int n =ww.nextInt();
            for(int i=2; i<n*4 ;i++) {
                if(i%2 == 0){
                    if(i%4 == 0){
                        continue;
                    }
                    System.out.println(i);
                }
            }
        }
}
