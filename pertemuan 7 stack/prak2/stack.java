package prak2;

public class stack {
    int size, top;
    buku data[];

    public stack(int size) {
        this.size = size;
        data = new buku[size];
        top = -1;
    }
    public boolean IsEmpty (){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull (){
        if (top == size -1){
            return true;
        } else {
            return false;
        }
    }
    public void push(buku bk){
        if (!IsFull()){
            top++;
            data[top] = bk;
        } else {
            System.out.println("Isi stack penuh");
        }
    }
    public void pop(){
        if (!IsEmpty()){
            buku x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.judul + " "+ x.namaPengarang
            + " "+x.tahunTerbit+" "+x.jmlHalaman+" "+x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen teratas: " + data[top].judul+" "+
        data[top].namaPengarang+" "+data[top].tahunTerbit+" "+
        data[top].jmlHalaman+" "+data[top].harga);
    }
    public void print() {
        System.out.println("============================================================================");
        System.out.println("|  Judul           |   Nama Pengarang   |   Tahun Terbit  |   Jml Halaman  |  Harga  |");
        System.out.println("============================================================================");
        for (int i = top; i >= 0; i--) {
            System.out.printf("|  %-15s |  %-15s   |  %-12d |  %-10d   |  %-6d |\n",
                    data[i].judul, data[i].namaPengarang, data[i].tahunTerbit, data[i].jmlHalaman, data[i].harga);
        }
        System.out.println("============================================================================\n");
    }    
    public void clear(){
        if (!IsEmpty()){
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongan!");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}

