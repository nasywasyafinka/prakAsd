import java.util.Scanner;
public class pemilihan19{
    public static void main(String[] args) {
        Scanner wawa=new Scanner(System.in);
        double tugas,uts,uas,tot_nilai,nilai_tugas,nilai_uas,nilai_uts;
        System.out.println("Program menghitung nilai akhir");
        System.out.println("==============================");
        System.out.printf("Masukkan nilai tugas\t: ");
        tugas=wawa.nextDouble();
        System.out.printf("Masukkan nilai UTS\t: ");
        uts=wawa.nextDouble();
        System.out.printf("Masukkan nilai UAS\t: ");
        uas=wawa.nextDouble();
        System.out.println("==============================");
            nilai_tugas=tugas*0.2;
            nilai_uts=uts*0.35;
            nilai_uas=uas*0.45;
            tot_nilai=nilai_tugas+nilai_uas+nilai_uts;
            System.out.println("Nilai Akhir\t: "+tot_nilai);
        if(tot_nilai>80 && tot_nilai<=100) {
            System.out.println("Nilai Huruf\t: A");
            System.out.println("==============================");
            System.out.println("LULUS");
        }else if(tot_nilai>73 && tot_nilai<=80) {
            System.out.println("Nilai Huruf\t: B+");
            System.out.println("==============================");
            System.out.println("LULUS");
        }else if(tot_nilai>65 && tot_nilai<=73) {
            System.out.println("Nilai Huruf\t: B");
            System.out.println("==============================");
            System.out.println("LULUS");
        }else if(tot_nilai>60 && tot_nilai<=65) {
            System.out.println("Nilai Huruf\t: C+");
            System.out.println("==============================");
            System.out.println("LULUS");
        }else if(tot_nilai>50 && tot_nilai<=60) {
            System.out.println("Nilai Huruf\t: C");
            System.out.println("==============================");
            System.out.println("LULUS");
        }else if(tot_nilai>39 && tot_nilai<=50) {
            System.out.println("Nilai Huruf\t: D");
            System.out.println("==============================");
            System.out.println("TIDAK LULUS");
        }else if(tot_nilai<39) {
            System.out.println("Nilai Huruf\t: E");
            System.out.println("==============================");
            System.out.println("TIDAK LULUS");
        }else {System.out.println();}

    }
}