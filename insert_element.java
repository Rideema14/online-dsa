import java.util.Scanner;

public class insert_element {
    public static int [] insert(int[] arr ,int el ,int pos){
        int j=0;
        int[] arr1=new int[arr.length+1];
            for(int i=0;i<arr.length;i++){
              if(i==pos-1){
                arr1[i]=el;
              }
              else{
                arr1[i]=arr[i];
              }
            }
            return arr1;
    }
  public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.println("enter the array length");
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter element");
    int el=sc.nextInt();
        System.out.println("enter position");
    int pos=sc.nextInt();

        int[] result = insert(arr ,el,pos);
        System.out.println("Output array:");
        for (int val : result) {
            System.out.print(val + " ");
  }
  }}
  

