package tugas2;

public class listMain2 {
    public static void main(String[] args) {
        singleListlink2 singLL = new singleListlink2();
        singLL.print();
        singLL.addFirst('a');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
        singLL.insertAfter('a', 'b');
        singLL.print();
        singLL.insertBefore('e', 'd');
        singLL.print();
        singLL.insertAt(2, 'c');
        singLL.print();
    
        System.out.println("\nData pada index ke-1=" + singLL.getData(1));
        System.out.println("Data 3 berada pada index ke-" + singLL.indexOf('c')+"\n");
    
        singLL.remove('c');
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
      }
}
