public class sllMainPrak2 {
    public static void main(String[] args) {
        singleLLPrak2 singLL = new singleLLPrak2();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3,833);
        singLL.print();

        System.out.println("\nData pada index ke -1 = "+singLL.getData(1));
        System.out.println("Data ke -3 berada pada indeks ke -"+singLL.indexOf(760)+"\n");

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}
