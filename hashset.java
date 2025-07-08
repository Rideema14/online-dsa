import java.util.HashSet;
public class hashset {

 static Object[] duplicate(int[]arr){
    HashSet<Integer> hs=new HashSet<Integer>();
    for(int x:arr){
        hs.add(x);
    }
    Object[] o=hs.toArray();
    return o;
}
public static void main(String args[]){
 int [] arr={1,2,3,4,5,6,2,3};
 duplicate(arr);
    //  System.out.println("Unique elements:");
    //     for (Object val : result) {
    //         System.out.print(val + " ");
}
}