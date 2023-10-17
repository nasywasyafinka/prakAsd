public class sort19 {
    public int [] data;
    public int jumData;

    public sort19(int Data[], int jmlData){
        jumData = jmlData;
        data = new int[jmlData];
        for  (int i=0; i<jumData; i++){
            data[i]=Data[i]; 
        }
    }

    //ascending
    void bubbleSort(){
        int temp=0;
        for (int i=0; i<jumData-1; i++){
            for (int j=1; j<(jumData-i); j++){
                if (data[j-1] > data[j]) {
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }

            }
        }
        for (int i = 0; i<jumData; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }


    //descending
    void selectionSort() {
        for (int i=0; i<jumData-1; i++){
            int min=i;
            for (int j = i+1; j<jumData; j++){
                if (data[j] < data[min]){
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data [min];
            data [min] = temp;
        }
        for (int i=0; i<jumData; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }

    public void tampilData() {
        for(int i=0; i<jumData; i++){
            System.out.println(data[i]+" ");
        }
        System.out.println();
    }

    
}