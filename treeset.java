import java.util.*;
import java.util.Comparator;
class MyComparator1 implements Comparator{
public int compare(Object obj1);
}

class treeset{
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator1());
        t.add(10);
     t.add(11);
         t.add(12);
          t.add(13);
          t.add(5);
    }
}