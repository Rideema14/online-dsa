import java.util.Scanner;
public class reverse_no{
    static int reverse(int n){
           int rev=0;
        while (n>0){
       int dig = n%10;
       rev=rev*10 + dig;
           n=n/10;
           
    }
    return rev;
}
 public static void main(String[] args){
    Scanner sc =new Scanner (System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    reverse(n);
   }
}
