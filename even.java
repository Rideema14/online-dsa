   import java.util.Scanner;
   public class even {
static void disp(int x,int y ){
        for(int i=x;i<=y;i++){
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int m = sc.nextInt();
        disp(n, m);
        sc.close();
     }
    }

    // static void disp(int x,int y ){
    // boolean isEven =false;
    //     for(int i=x;i<=y;i++){
    //         if(i%2==0){
    //             isEven=true;
    //         }
            
    //     }
    // }
    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the range");
    //     int n = sc.nextInt();
    //     int m = sc.nextInt();
    //     for(int i=n;i<=m;i++){
    //         if(isEven(i)){
    //             System.out.println(i);
    //         }
    //     }
    //     disp(n, m);
    //     sc.close();
    //  }
    