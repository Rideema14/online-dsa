import java.util.ArrayList;
import java.util.LinkedList;
 public class list{
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(3);
         ll.add(2);
        al.add("a");
        al.add("b");
        al.add("c");
        al.addAll(1,ll);
         System.out.println(al.get(0));
           System.out.println("before"+al);
           al.remove("b");
             System.out.println("after"+al);
    }
    
    }
 