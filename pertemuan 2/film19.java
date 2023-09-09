public class film19{
    String judul,genre,rate;
    int jmltiket,harga;
    
    film19(String jd,String gr,String rt,int jt,int ht){
        judul=jd;
        genre=gr;
        rate=rt;
        jmltiket=jt;
        harga=ht;
    }
    void tampilfilm(){
        System.out.println("Judul: "+judul);
        System.out.println("Genre: "+genre);
        System.out.println("Rate: "+rate);
        System.out.println("Jumlah tiket: "+jmltiket);
        System.out.println("Haarga tiket: "+harga);
    }
    void tambahTiket(int n){
        jmltiket +=n;
    }
    void kurangTiket(int n){
        jmltiket -=n;
    }
    int totRevenue(int jml){
        return jml*harga;
    }
}