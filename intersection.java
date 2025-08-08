import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class intersection {
    public  static ArrayList<Integer> inter(int[] arr1,int[] arr2) {
     ArrayList<Integer> al=new ArrayList<>(); 
       HashSet<Integer> hs1=new HashSet<>();
     HashSet<Integer> hs2=new HashSet<>();
     for(int i=0;i<arr1.length;i++){
        hs1.add(arr1[i]);
     }
      for(int i=0;i<arr2.length;i++){
        hs2.add(arr2[i]);
     }
     for(int i:hs1){
        if(hs2.contains(i)){
  al.add(i);
        }
      
     }

     return al; 
    }
    
    public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.println("enter the array length");
    int n=sc.nextInt();
    int [] arr1=new int[n];
    for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
    }
    System.out.println("enter the 2nd array length");
    int k=sc.nextInt();
    int [] arr2=new int[k];
    for(int i=0;i<k;i++){
        arr2[i]=sc.nextInt();}
     

        ArrayList<Integer> result = inter(arr1 ,arr2);
        System.out.println("Output array:");
        for (int val : result) {
            System.out.print(val + " ");
  }
  }
    }
