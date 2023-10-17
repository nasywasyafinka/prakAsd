package tugas;

public class pengurutan19 {
    int id;

    void tampil19(buku19[] array) {
        for(buku19 a : array) {
            a.output19();
            System.out.println("============================================");
        }
    }

    void halaman(buku19[] array) {
        for(int i=0; i<array.length-1 ;i++) {
            int max=i;
            for(int j=i+1; j<array.length ;j++) {
                if(array[j].halaman > array[max].halaman) {
                    max=j;
                }
            }
            buku19 tmp = array[max];
            array[max] = array[i];
            array[i] = tmp;
        }
    }

    void ukuran(buku19[] array) {
        for(int i=0; i<array.length-1 ;i++) {
            for(int j=1; j <= array.length-1 ;j++) {
                if(array[j].tinggi > array[j - 1].tinggi) {
                    buku19 tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }
}
