import java.util.Scanner;

public class armstrong {
     static int digits(int n){
        int count =0;
        while (n>0){
       int dig = n%10;
               count++;
           n=n/10;
           
        
        }
        return count;  
   }
   static int sum(int n){
          int sum =0;
          int c=digits(n);
        while (n>0){
       int dig = n%10;
     sum=sum +(int)Math.pow(dig,c) ;  
           n=n/10;

   }
return sum;}
static boolean check(int n){
    if(n==sum(n))
    return true;
    return false;
}
   public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    if(check(n)){
        System.out.println("armstrong number");
    }
    else
    System.out.println("not");
   }
}

