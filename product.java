import java.util.Scanner;
public class product{
public static int  productofnumber(int N){
  // return (N*(N+1))/2;
        int product= 1;
        for(int i= 1;i<=N;i++){
            product = product*i;//product of natural number = int product =product *i;//
        }
        return product;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please inter your number where  to you print ");
    int N = sc.nextInt();
    System.out.println(productofnumber(N));}
}