import java.util.Scanner;

public class negative {
  static int count(int [] arr){
    int c=0;
    for (int index = 0; index < arr.length; index++) {
      if(arr[index]<0){
        c++;
      }
    }
     return c;
  }
    public static int[] negative(int [] arr){
        int [] arr1=new int[arr.length];
        int negcount=count(arr);
        int j=0;
        int k=negcount;
        for(int i=0;i<arr.length;i++){
          if(arr[i]<0){
            arr1[j]=arr[i];
            j++;
          }
          else{
            arr1[k]=arr[i];
            k++;
          }}
          return arr1;
  //       int [] arr2=new int[arr.length];
  //       int k=0;
  //       int j=0;
  // for(int i=0;i<arr.length;i++){
  //     if(arr[i]<0){
  //       arr1[k]=arr[i];
  //       k++;
  //     }
  //     if(arr[i]>0){
  //       arr2[j]=arr[i];
  //       j++;
  //     }}
  //    for(int i=0;i<j;i++){
  //           arr1[k]=arr2[i];
  //           k++;
  //   }
  //   return arr1;

    }
  public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.println("enter the array length");
    int n=sc.nextInt();
    int [] arr=new int[n];
  
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
        int[] result = negative(arr);
        System.out.println("Output array (negatives first):");
        for (int val : result) {
            System.out.print(val + " ");
  }
  }}
