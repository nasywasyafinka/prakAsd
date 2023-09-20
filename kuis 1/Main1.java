import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        Transaction1 transaction = new Transaction1();

        while (true) {
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("|                          Menu Customer                         |");
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("| [1] Tambah Item                                                |");
        System.out.println("| [2] Update Item                                                |");
        System.out.println("| [3] Hapus Item                                                 |");
        System.out.println("| [4] Lihat Item                                                 |");
        System.out.println("| [5] Hitung Total Belanja                                       |");
        System.out.println("| [6] Keluar                                                     |");
        System.out.println("+----------------------------------------------------------------+");
        System.out.print("Pilih Menu (1-6)\t: ");

            int menu = naswa.nextInt();
            naswa.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("==================================================================");
                    System.out.print("Masukkan Nama Item\t: ");
                    String itemName = naswa.nextLine();
                    System.out.print("Masukkan Jumlah Item\t: ");
                    int jml = naswa.nextInt();
                    System.out.print("Masukkan Harga Item\t: Rp ");
                    double harga = naswa.nextDouble();
                    transaction.addItem(itemName, jml, harga);
                    break;
                case 2:
                    System.out.print("Masukkan id item yang ingin diupdate\t: ");
                    int indexToUpdate = naswa.nextInt();
                    naswa.nextLine(); // Consume the newline character
                    System.out.print("Masukkan Update Nama Item\t\t: ");
                    String newItemName = naswa.nextLine();
                    System.out.print("Masukkan Update Jumlah Item\t\t: ");
                    int newJml = naswa.nextInt();
                    System.out.print("Masukkan Update Harga Item\t\t: Rp");
                    double newHarga = naswa.nextDouble();
                    transaction.updateItem(indexToUpdate - 1, newItemName, newJml, newHarga);
                    break;
                case 3:
                    System.out.print("Masukkan Id Item yang ingin dihapus\t: ");
                    int indexToRemove = naswa.nextInt();
                    transaction.removeItem(indexToRemove - 1);
                    break;
                case 4:
                    transaction.viewItems();
                    break;
                case 5:
                    transaction.checkOut();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu Tidak Valid. Silakan Pilih Ulang.");
            }
        }
    }
}