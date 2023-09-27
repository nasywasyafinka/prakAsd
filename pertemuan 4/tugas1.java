public class tugas1 {
    public static void main(String[] args) {
        int data[]={17,20,26,33,37,41,53,65,73,83};
        int xa=41;
        int xb=50;

        int hasilA = ordered19(data,xa);
        if (hasilA  != -1){
            System.out.println("Nilai "+xa+" ditemukan pada indeks "+hasilA);
        }else {System.out.println("Nilai "+xa+" tidak ditemukan dalam data");}

        int hasilB = ordered19(data,xb);
        if (hasilB  != -1){
            System.out.println("Nilai "+xb+" ditemukan pada indeks "+hasilB);
            }else {System.out.println("Nilai "+xb+" tidak ditemukan dalam data");}
        }

        public static int ordered19(int[]data, int x) {
            for(int i=0; i<data.length ;i++){
                if(data[i] == x){
                    return i;
                } else if (data[i]>x){
                    return -1;
                }
            }
            return -1;
        }

}
