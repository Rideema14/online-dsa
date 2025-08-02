import java.util.LinkedList;
import java.util.ListIterator;
public class list_itrator {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList<>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        System.out.println(ll);
         ListIterator itr =ll.listIterator();
         while(itr.hasNext()){
            String s=(String)itr.next();
            if(s.equals("c")){
                itr.remove();
            
            }
            // else(s.equals("d")){
         
            // }
         }
    }
}
