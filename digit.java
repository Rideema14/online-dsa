import java.util.Scanner;
public class digit{
    static void digits(int n){
        int count =0;
        while (n>0){
       int dig = n%10;
       System.out.println(dig);
           n=n/10;
           count++;
           
        } 
        System.out.println("number of digits -" +count);
   }
   public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    digits(n);
   }
}