package tugas;

public class stack19 {
    int size, top;
    char[] reverse;

    public stack19(int length) {
        size=length;
        reverse=new char[size];
        top=-1;
    }

    public void inputReverseWord(String word) {
        for (int i=0; i < size; i++) {
            reverse[i] = word.charAt(i);
            top++;
        }
    }

    public void printReverseWord() {
        for (int i=top; i >= 0; i--) {
            System.out.print(reverse[i]);
        }
    }
}
