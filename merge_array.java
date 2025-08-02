import java.util.Scanner;
public class merge_array{
     static int[] merge(int[] arr1,int[] arr2){
        int[] arr3 =new int[arr1.length+arr2.length];
        int k=0;
           for(int i=0;i<arr3.length;i++){
            if(k<arr1.length){
                arr3[k]=arr1[i];
                k++;
            }
            else if(k>=arr1.length){
                arr3[k]=arr2[i];
                k++;
            }
            return arr3;
           }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter arr1");
        int size1=sc.nextInt();
        int []arr1=new int[size1];
          System.out.println("enter arr2");
        int size2=sc.nextInt();
        int []arr2=new int[size2];
        for(int j=0;j<arr2.length;j++){

        }
        for(x:merge())
    
    }
}