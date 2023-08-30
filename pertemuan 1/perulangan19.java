import java.util.Scanner;

public class perulangan19 {
    public static void main(String[] args) {
        Scanner wawa=new Scanner(System.in);
        System.out.println("NIM MAHASISWA\t: 2241760002");
        System.out.printf("Input n\t\t: ");
        int n=wawa.nextInt();
        
        if(n<10){
            n+=10;
        }
        String[]hari={"senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
        for (int i=0; i<n ;i++){
            System.out.print(hari[i%7]+", ");

        }
        

    }
}
