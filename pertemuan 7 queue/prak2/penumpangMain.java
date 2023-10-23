package prak2;
import java.util.Scanner;
public class penumpangMain {
    public static void menu(){
        System.out.println("=============== MENU============= ");
        System.out.println("| 1. Antrian baru                |");
        System.out.println("| 2. Antrian keluar              |");          
        System.out.println("| 3. Cek antrian terdepan        |");
        System.out.println("| 4. Cek semua antrian           |");
        System.out.println("----------------------------------");
        System.out.print("Pilih menu: ");
    }
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jml = naswa.nextInt();
        queue antri = new queue(jml);
        int pilih;
        do {
            menu();
            pilih = naswa.nextInt();
            naswa.nextLine();
            switch (pilih){
                case 1:
                System.out.print("Nama\t\t: ");
                String nama = naswa.nextLine();
                System.out.print("Kota asal\t: ");
                String asal = naswa.nextLine();
                System.out.print("Kota tujuan\t: ");
                String tujuan = naswa.nextLine();
                System.out.print("Jumlah tiket\t: ");
                int tiket = naswa.nextInt();
                System.out.print("Harga\t\t: ");
                int harga = naswa.nextInt();
                penumpang p = new penumpang(nama, asal, tujuan, tiket, harga);
                naswa.nextLine();
                antri.enqueue(p);
                break;
                case 2:
                penumpang data = antri.dequeue();
                if (!"".equals(data.nama)&& !"".equals(data.kotaAsal)&& !"".equals(data.kotaTujuan)
                && data.jumlahTiket != 0 && data.harga != 0){
                    System.out.println("Antrian yang keluar: "+data.nama+" "+data.kotaAsal+" "+data.kotaTujuan+" "+data.jumlahTiket+" "+data.harga);
                    break;
                }
                case 3:
                antri.peek();
                break;
                case 4:
                antri.print();
                break;
                case 5:
                antri.peekRear();
                break;
            }
        } while (pilih==1 || pilih==2 || pilih==3 || pilih==4);
    }
}
