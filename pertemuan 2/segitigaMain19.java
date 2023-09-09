import java.util.Scanner;

public class segitigaMain19 {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        segitiga19 [] sgArray =new segitiga19 [4];
        sgArray[0]=new segitiga19(10, 4);
        sgArray[1]=new segitiga19(20, 10);
        sgArray[2]=new segitiga19(15, 6);
        sgArray[3]=new segitiga19(25, 10);
        for(int i=0;i<4;i++){
            System.out.println("segitiga ke-"+i);
            System.out.println("Alas\t\t: "+sgArray[i].alas);
            System.out.println("Tinggi\t\t: "+sgArray[i].tinggi);
            System.out.println("Luas\t\t: "+sgArray[i].hitungluas());
            System.out.println("Keliling\t: "+sgArray[i].hitungkel());
            System.out.println();
        }
    }
}
