class segitiga19{
    public int alas;
    public int tinggi;
    public segitiga19(int a,int t){
        alas=a;
        tinggi=t;
    }
    public double hitungluas(){
        return 0.5*alas*tinggi;
    }
    public int hitungkel(){
        int sisiMiring=(alas*alas)+(tinggi*tinggi);
        int keliling=alas+tinggi+sisiMiring;
        return keliling;
    }

}