package prak3;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        String p, q;
        System.out.print("Masukkan ekspressi matematika (infix)\t: ");
        q = naswa.nextLine();
        q = q.trim();
        q = q + ")";
        int total = q.length();
        postfix post = new postfix(total);
        p = post.konversi(q);
        System.out.println("Postfix\t: "+p);
    }
}

