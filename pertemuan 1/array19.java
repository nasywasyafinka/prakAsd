import java.util.Scanner;
public class array19 {
    public static void main(String[] args) {
        Scanner wawa=new Scanner(System.in);
        int total=0;
        int bunga[][]={{10,5,15,7}, {6,11,9,12},
        {2,10,10,5},{5,7,12,9}};
        String tipeBunga[]={"Aglonema","Keladi\t","Alocia\t","Mawar\t"};
        String toko[]={"Royal Garden 1","Royal Garden 2","Royal Garden 3","Royal Garden 4"};
        System.out.println("=====================================================================================");
        System.out.println("\t\t"+bunga[0][0]+"\t\t"+bunga[0][1]+"\t\t"+bunga[0][2]+"\t\t"+bunga[0][3]+"\n"+toko[1]+
        "\t\t"+bunga[1][0]+"\t\t"+bunga[1][1]+"\t\t"+bunga[1][2]+"\t\t"+bunga[1][3]+"\n"+toko[2]+"\t\t"+bunga[2][0]+
        "\t\t"+bunga[2][1]+"\t\t"+bunga[2][2]+"\t\t"+bunga[2][3]+"\n"+toko[3]+"\t\t"+bunga[3][0]+"\t\t"+bunga[3][1]+"\t\t"+bunga[3][2]+"\t\t"+bunga[3][3]);
        System.out.println("=====================================================================================");
        System.out.println("\n\n=====================================================================================");
        System.out.println("\t\tJumlah stock berdasarkan jenis bunga di setiap cabang");
        System.out.println("===================================================================================");

        for(int i=0; i<bunga.length ;i++){
            total = 0;
            for(int j=0; j<bunga.length ;j++){
                total += bunga[j][i];
            }
            System.out.println("Bunga "+tipeBunga[i]+"\t\t"+total);
        }
        int minusBunga[] = {1,2,0,5};
        int harga[] = {75000,50000,60000,10000};
        int totalPendapatan=0;
        System.out.println("\n=========================================================================================");
        System.out.println("\t\t\tRoyal Garden 1");
        System.out.println("=========================================================================================");

        for (int i=1; i<2 ;i++) {
            for (int j=0; j<bunga[0].length; j++) {
                bunga[0][j] -= minusBunga[j] ;
                System.out.println(tipeBunga[j]+"\t\t"+"-"+minusBunga[j]+"="+bunga[0][j]);
                totalPendapatan += (bunga[0][j] * harga[j]);
            }
            System.out.println("=====================================================================================");
            System.out.println("Total semua bunga terjual pada Royal Garden 1 = Rp"+ totalPendapatan);
            System.out.println("=====================================================================================");
        }
    }
}
