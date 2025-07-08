public class secmax{
    public static int main(int[] arr){
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                sec_max=max;
                max=arr[i];
            }
            else if(sec_max<arr[i]&&max!=arr[i]){
                sec_max=arr[i];
            }
        }
        return sec_max;
    }
}