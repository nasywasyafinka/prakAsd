package prak1;
import java.util.Scanner;

public class queueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Position");
        System.out.println("6. Cek index");
        System.out.println("7. Clear");
        System.out.println("---------------------------------------");
        System.out.print("Pilih menu: ");
    }
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = naswa.nextInt();
        queue q = new queue(n);
        int pilih;
        do{
            menu();
            pilih = naswa.nextInt();
            switch(pilih){
                case 1:
                System.out.print("Masukkan data baru: ");
                int datamasuk = naswa.nextInt();
                q.enqueue(datamasuk);
                break;
                case 2:
                int datakeluar = q.dequeue();
                if (datakeluar != 0){
                    System.out.println("Data yang keluar: "+datakeluar);
                    break;
                }
                case 3:
                q.print();
                break;
                case 4:
                q.peek();
                break;
                case 5:
                q.peekPosition();
                break;
                case 6:
                q.peekAt();
                break;
                case 7:
                q.clear();
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 );
    }
}

