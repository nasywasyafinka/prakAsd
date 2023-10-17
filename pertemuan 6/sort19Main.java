public class sort19Main {
    public static void main(String[] args) {
        int a[]={15,10,7,22,5};
        sort19 urut=new sort19(a,a.length);

        System.out.println("\n==========================================");
        System.out.println("             Data sebelum urut : ");
        System.out.println("==========================================");
        urut.tampilData();

        System.out.println("\n==========================================");
        System.out.println("    Data sesudah urut Bubble Sort (ASC): ");
        System.out.println("==========================================");
        urut.bubbleSort();

        System.out.println("\n==========================================");
        System.out.println(" Data sesudah urut Selection Sort (DSC): ");
        System.out.println("==========================================");
        urut.selectionSort();
    }
}
