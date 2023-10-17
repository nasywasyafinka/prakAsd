package tugas;

public class anggotaPaskibraka19 {
    paskibraka19[] list = new paskibraka19[5];
    int id;

void tambah19(paskibraka19 n) {
    if(id< list.length) {
        list[id]=n;
        id++;

    } else {
        System.out.println("Data sudah terisi");
    }
}

void tampil19() {
    for(paskibraka19 n : list){
        n.tampil19();
        System.out.println("--------------------------------");
    }
}

void selection19() {
    for(int i=0; i<list.length-1 ;i++) {
        int max=i;
        for(int j=0; j<list.length ;j++){
            if(list[j].tinggi > list[max].tinggi){
                max=j;
            }
        }
    }
}

void pilih19(){
    boolean status=false;
    for(int i=0; i<list.length ;i++){
        if(list[i].tinggi >170){
            System.out.println("Nama\t: "+list[i].nama);
            System.out.println("Kelas\t: "+list[i].kelas);
            System.out.println("Tinggi\t: "+list[i].tinggi);
            System.out.println("---------------------------------");
            status=true;
        } else if (status=false){
            System.out.println("Tidak lolos");
        }
    }
}
}
