package tugas;
import java.util.Scanner;
public class stackMain19 {
    public static void main(String[] args) {
        Scanner naswa = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String word = naswa.nextLine();

        stack19 tgs1 = new stack19(word.length());
        tgs1.inputReverseWord(word);
        System.out.print("Hasil\t: ");
        tgs1.printReverseWord();
    }
   
    
}
