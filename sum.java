import java.util.Scanner;
public class sum{
static int sumodnaturalmunbers(int n){
    int sum = 0;
    for(int i=0;i<n;i++){
        sum=sum+i;
    }
    return sum;
}
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the number");
    int n= sc.nextInt();
    System.out.println(sumodnaturalmunbers(n));
}
}