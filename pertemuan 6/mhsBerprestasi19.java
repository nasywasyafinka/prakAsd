public class mhsBerprestasi19 {
    mhs19 listMhs[] = new mhs19[5];
    int idx;

    void tambah(mhs19 m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for(mhs19 m : listMhs){
            m.tampil();
            System.out.println("_______________________________________________");
        }
    }

    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk>listMhs[j-1].ipk){

                    mhs19 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;// Inisialisasi indeks minimum sebagai indeks saat ini
            for(int j=i+1; j<listMhs.length; j++){
            // Membandingkan IPK mahasiswa pada indeks ke-j dengan IPK 
            // mahasiswa pada indeks minimum
                if(listMhs[j].ipk<listMhs[idxMin].ipk){
                    idxMin = j;
                    // Memperbarui indeks minimum jika IPK yang lebih rendah ditemukan
                }
            }

            // Menukar elemen dengan indeks minimum dengan elemen pada indeks saat ini
            mhs19 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    

}
