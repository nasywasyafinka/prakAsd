import java.util.Scanner;
public class mhsMain19 {
    public static void main(String[] args) {
        mhs19 [] mhs = new mhs19[10];
        mhs[0]=new mhs19("19970506001","Alfatih",3.9);
        mhs[1]=new mhs19("19910421002","Gitta",3.8);
        mhs[2]=new mhs19("19950322002","Amanda",3.75);
        mhs[3]=new mhs19("19980129001","Kevin",3.5);
        mhs[4]=new mhs19("19990200002", "Windy", 3.92); 
        mhs[5]=new mhs19("9970710001", "Belva", 3.6);
        mhs[6]=new mhs19("19920602001", "James",3.7);
        mhs[7]=new mhs19("19901106002", "Aruna", 3.3);
        mhs[8]=new mhs19("19981005002", "sabrina", 3.55);
        mhs[9]=new mhs19("19591201001", "Agus", 3.65);
            
            
        Scanner naswa=new Scanner(System.in);
        System.out.print("Masukkan IPK yang ingin dicari: ");
        double cariIPK = naswa.nextDouble();
        
        // Menambahkan variabel boolean untuk menandai apakah data ditemukan atau tidak
        boolean dataDitemukan = false;
        for (int i=0; i<mhs.length; i++){
           if (cariIPK == mhs[i].ipk) {
           System.out.println("Nama\t: " +mhs[i].namaMhs); 
           System.out.println("HIM\t: " +mhs[i].nim); 
           System.out.println("IPK\t: " +mhs[i].ipk);
           // Mengatur variabel dataDitemukan menjadi true
           dataDitemukan = true;
           break; // Keluar dari loop setelah menemukan data
       
           } 
    }if (!dataDitemukan) {
        System.out.println("Data tidak ditemukan!");
    }
}
}
