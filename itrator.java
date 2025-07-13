import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class itrator {
      public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        for(int i=0;i<10;i++){
            al.add(i);
        }
        System.out.println(al);
        Iterator e =al.iterator();
        while(e.hasNext()){
            Integer i=(Integer)e.next();
            if(i%2==0){
                // System.out.println(i);
            }
            else e.remove();
        }
        System.out.println(al);
    }
}
