package tugas;

public class BinaryTreeTugasMain {
    public static void main(String[] args) {
        BinaryTreeTugas al = new BinaryTreeTugas();
        al.add(6);
        al.add(4);
        al.add(8);
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(10);
        al.add(15);

        al.traversePreOrder(al.root);
        System.out.println();
        al.traverseInOrder(al.root);
        System.out.println();
        al.traversePostOrder(al.root);
        System.out.println();
        System.out.println(al.find(5));
        al.delete(8);
        al.traversePreOrder(al.root);
        System.out.println();

        // Tugas no 1
        al.addRekursif(14);
        al.traversePreOrder(al.root);
        System.out.println();

        // Tugas no 2
        System.out.println("Nilai paling kecil\t: " + al.findMinimum());
        System.out.println("Nilai paling besar\t: " + al.findMaksimum());

        // Tugas no 3
        System.out.println("Data Leaf : ");
        al.printLeaf(al.root);

        // Tugas no 4
        System.out.println();
        System.out.print("Jumlah Leaf\t: " + al.countLeaf(al.root));


    }
}

