
public class tugas {
    public String[] nilaiArray = {"Haris","Dian","Haris","Rani","Bisma","Haris","Haris","Haris"};
    
    public static void mayo(String[] arr, int indeks_awal, int indeks_akhir, tugas19 hasil){
        int n = arr.length/2; //majority harus lebih besar dari n
        int indeks_tengah;
        tugas19 hasil1 = new tugas19();
        tugas19 hasil2 = new tugas19 ();
        
        if(indeks_awal == indeks_akhir){
            hasil.mayoritas =  arr[indeks_awal];
        } else if (indeks_akhir - indeks_awal == 1){
            if(!arr[indeks_awal].equals(arr[indeks_akhir]) ){
                hasil.mayoritas = "nm";
            }
            else{
                hasil.mayoritas = arr[indeks_awal];
                
            }
        }
        
        else{
            indeks_tengah = (indeks_awal + indeks_akhir) / 2;
            mayo(arr, indeks_awal, indeks_tengah, hasil1);
            mayo(arr, indeks_tengah + 1, indeks_akhir, hasil2);
            System.out.println("hasil1"+hasil1.mayoritas);
            System.out.println("hasil2"+hasil2.mayoritas);
            
            if(!hasil1.mayoritas.equals(hasil2.mayoritas))
            {   
                //kasus 2
                if(hasil1.mayoritas.equals("nm")){
                    System.out.println("kasus 2");
                    int totalHasil2=0;
                    
                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i]==hasil2.mayoritas)
                            totalHasil2++;
                                                
                        if (totalHasil2>n) hasil.mayoritas=hasil2.mayoritas;//cek majority
                        else  hasil.mayoritas="nm";//kasus 2 asli
                    }
                }
                //kasus 3
                else if(hasil2.mayoritas.equals("nm")){
                    System.out.println("kasus 3");
                    int totalHasil1=0;
                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i]==hasil1.mayoritas)
                            totalHasil1++;
                                                
                        if (totalHasil1>n) hasil.mayoritas=hasil1.mayoritas;//cek majority
                        else  hasil.mayoritas="nm";//kasus 3 asli
                    }
                }      
            }
            else
            {   //kasus 1  
                System.out.println("kasus 1");             
                hasil.mayoritas=hasil1.mayoritas;
            }           
            
        }
    }
}
