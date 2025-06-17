import java.util.Scanner;
public class perfect {
    
     static void factors(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
                // System.out.println(sum);
            }
        }
        if(sum==n){
        System.out.println("perfect");}
        else{System.out.println("not prefect");}
    }
public static void main(){
        for(int i=0;i<=100;i++)
        if((i>2 &&i<28)||(i>30&&i<45))
          factors(i);

}
}


