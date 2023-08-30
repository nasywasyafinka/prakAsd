import java.util.Scanner;
public class tugas4_19 {
    static Scanner ww=new Scanner(System.in);
    static Scanner wawa=new Scanner(System.in);
    static int lebar,alas,tinggi,pjg,sisi,jarijari,menu;

    static void menu19(){
        System.out.println("*********MENU*********"+"\n1.\tMenghitung Luas Segitiga"
            +"\n2.\tMenghitung Luas Persegi Panjang"+"\n3.\tMenghitung Luas Lingkaran");
        System.out.print("Silahkan Pilih Menu (1,2,3)\t: ");
        menu=ww.nextInt();
    }
    static int luasSegitiga19(int alas, int tinggi) {
        System.out.println("Masukkan Alas\t: ");
        alas=ww.nextInt();
        System.out.println("Masukkan Tinggi\t: ");
        tinggi=ww.nextInt();
            int luas=(alas*tinggi)/2;
            System.out.println("Luas Segitiga adalah\t: "+luas);
            return luas;
    }
    static int luasPersegiPjg19(int sisi) {
        System.out.println("Masukkan Panjang\t: ");
        pjg=wawa.nextInt();
        System.out.println("Masukkan Lebar\t: ");
        lebar=wawa.nextInt();
            int luas=pjg*lebar;
            System.out.println("Luas Persegi Panjang adalah\t: "+luas);
            return luas;
    }
    static double lingkaran19(int jarijari){
        System.out.println("Masukkan Jari Jari\t: ");
        jarijari=wawa.nextInt();
            double luas=3.14*jarijari*jarijari;
            System.out.println("Luas PLingkaran adalah\t: "+luas);
            return luas;
    }public static void main(String[] args) {
        char code = 'y';
        char code1 = 'y';
        while (code==code1) {
            menu19();
        switch(menu){
            case 1:
                luasSegitiga19(alas,tinggi);
                break;
            case 2:
                luasPersegiPjg19(sisi);
                break;
            case 3:
                lingkaran19(jarijari);
                break;
            default:
            System.out.println("Pilihan Menu yang di pilih salah");
            break;

        }
        System.out.println("\nKembali ke menu? (y/n)");
        code1=ww.next().charAt(0);
        }
    }

}
