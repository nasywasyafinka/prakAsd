package praktikum;

public class BinaryTreeArray {
    int[] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
    }

    public void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
}
