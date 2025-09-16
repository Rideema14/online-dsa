public class overflow {
    static void disp(int n){
        if(n>0){
              disp(n-1);
              System.out.println(n);
        }
    }
    public static void main(String[] args) {
        disp(5);
    }
}
