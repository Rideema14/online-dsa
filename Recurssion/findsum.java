public class findsum {
    int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        findsum fr =new findsum();
        System.out.println(fr.sum(5));

    }
}
