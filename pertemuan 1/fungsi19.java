public class fungsi19 {
 public static void main(String[] args) {
    int[]aglonema = {10, 6, 2, 5};
    int[]keladi = {5, 11, 10, 7};
    int[]alocasia = {15, 9, 10, 12};
    int[]mawar = {7, 12, 5, 9};
    int total_1= 0, total_2 = 0, total_3 = 0, total_4 = 0;
        System.out.println("***********************");
        System.out.println("Jumlah Stock Bunga");
        System.out.println("***********************");
        for (int i = 0; i < mawar.length; i++) {
        total_1 += aglonema[i];
        total_2 += keladi[i];
        total_3 += alocasia[i];
        total_4 += mawar[i];
        }
        System.out.println("Jumlah Aglonema\t: "+ total_1);
        System.out.println("Jumlah Keladi\t: "+ total_2);
        System.out.println("Jumlah Alocasia\t: "+ total_3);
        System.out.println("Jumlah Mawar\t: "+ total_4);
        System.out.println("-----------------------");
        System.out.print("Total Penjualan Toko Royal Garden 1 = ");
            for (int i = 0; i < mawar.length; i++) {
            if(i==0){
            aglonema[i] -= 1;
            total_1 = aglonema[i]*75000;
            keladi[i] -= 2;
            total_2 = keladi[i]*50000;
            alocasia[i] -=0;
            total_3 = alocasia[i]*60000;
            mawar[i] -= 5;
            total_4 = mawar[i]*10000;
        }
    }
        System.out.println((total_1+total_2+total_3+total_4));
 }
}
