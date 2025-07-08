public class selectionsort {
    
    static int [] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min)
                min=arr[j];
            }
            int temp =arr[i];
            arr[i]=min;
            min=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={5,2,3,7,1};
        sort(arr);
    }
}
