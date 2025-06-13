import java.util.Scanner;
public class palidrome {
     static String reverse(int n){
        String ans="";
           int rev=0; 
           int original=n;
        while (n>0){
       int dig = n%10;
       rev=rev*10 + dig;
           n=n/10;   
    }
    
    if(original==rev){
   ans="palidrome";}
   else{ans="not a plaidrome";}
   
return ans;

}
public static void main(String[] args){
    Scanner sc =new Scanner (System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    System.err.println(reverse(n)); 
   
    }
   }


