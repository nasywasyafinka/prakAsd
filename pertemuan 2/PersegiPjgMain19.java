import java.util.Scanner;
public class PersegiPjgMain19 {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        PersegiPanjang19[] ppArray = new PersegiPanjang19[3];

        ppArray[0] =  new PersegiPanjang19();
        ppArray[0].pjg = 110;
        ppArray[0].lebar = 30;

        ppArray[1] =  new PersegiPanjang19();
        ppArray[1].pjg =80;
        ppArray[1].lebar = 40;

        ppArray[2] =  new PersegiPanjang19();
        ppArray[2].pjg = 100;
        ppArray[2].lebar = 20;

        for (int i=0; i<3; i++){
            ppArray[i]= new PersegiPanjang19();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan Panjang: ");
            ppArray[i].pjg=naswa.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar=naswa.nextInt();
            }
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].pjg + ", lebar: " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].pjg + ", lebar: " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].pjg + ", lebar: " + ppArray[2].lebar);
    }

}
