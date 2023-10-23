package prak2;
import java.util.Scanner;

public class stackMain {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        // buku st = new buku(null, null, 0, 0, 0);
        stack st = new stack(5);
        char pilih;
        do {
            System.out.println("=========== MENU ============");
            System.out.println("1. Push (tambah data ke stack)");
            System.out.println("2. Pop (hapus elemen teratas stack)");
            System.out.println("3. Peek (lihat elemen teratas stack)");
            System.out.println("4. Print (tampilkan isi stack)");
            System.out.println("5. Keluar");
            System.out.println("=============================");
            System.out.print("Pilihan: ");
            pilih = naswa.next().charAt(0);
            naswa.nextLine();

            switch (pilih) {
                case '1':
                    do{
                        System.out.print("Judul\t\t: ");
                        String judul = naswa.nextLine();
                        System.out.print("Nama pengarang\t: ");
                        String nama = naswa.nextLine();
                        System.out.print("Tahun terbit\t: ");
                        int th = naswa.nextInt();
                        System.out.print("Jumlah halaman\t: ");
                        int jml = naswa.nextInt();
                        System.out.print("Harga\t\t: ");
                        int harga = naswa.nextInt();

                        buku bk = new buku(judul, nama, th, jml, harga);
                        System.out.print("Apakah anda akan menambahkan data baru ke stack(y/n) : ");
                        pilih = naswa.next().charAt(0);
                        naswa.nextLine();
                        st.push(bk);
                    } while (pilih =='y');
                        break;
                case '2':
                    st.pop();
                    break;
                case '3':
                    st.peek();
                    break;
                case '4':
                    st.print();
                    break;
                case '5':
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != '5');
    }
}
