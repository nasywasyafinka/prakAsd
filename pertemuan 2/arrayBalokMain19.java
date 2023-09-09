public class arrayBalokMain19{
    public static void main(String[] args) {
        arrayBalok19[]balArray=new arrayBalok19[3];
        balArray[0]=new arrayBalok19(100,30,12);
        balArray[1]=new arrayBalok19(120,40,15);
        balArray[2]=new arrayBalok19(210,50,25);
        for(int i=0;i<3;i++){
            System.out.println("Volume balok ke "+i+":"+balArray[i].hitungvol());
        }System.out.println("===========================================");
        
        
    } 
    }