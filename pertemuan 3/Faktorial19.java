public class Faktorial19 {
    public int nilai;

    long startTime = System.currentTimeMillis();
    public int faktorialBF(int n){
        int fakto = 1;
        for (int i=1; i<=n ;i++){
            fakto=fakto * i;
        }
        return fakto;
    }
    public int faktorialDC(int n){
        if(n == 1){
            return 1;
        } else {
            int fakto=n * faktorialDC(n-1);
            return fakto;
        }
    }
    long endTime = System.currentTimeMillis();
long executionTime = endTime - startTime;
System.out.println("Waktu eksekusi: " + executionTime + " milidetik");
}
