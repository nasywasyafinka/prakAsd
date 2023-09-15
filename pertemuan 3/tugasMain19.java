public class tugasMain19 {
    public static void main(String[] args) {
        String[] ppArray = new String[8];

        for (int i = 0; i < 8; i++){
            ppArray[i] = new tugas().nilaiArray[i];
            System.out.println("Nilai indeks ke- "+ i);
            System.out.println("Nama\t\t: " + ppArray[i]);
            System.out.println("==========================================");
        }
        
        tugas19 hasil = new tugas19();
        tugas mM = new tugas();
        mM.mayo(ppArray, 0, 7, hasil);
        
        System.out.println("==========================================");
        System.out.println("Divide Conquer");
        System.out.println("==========================================");
        System.out.print("Mayoritas\t: " + hasil.mayoritas );
    }
}
