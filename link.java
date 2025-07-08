import java.util.LinkedList;

public class link {
    public static void main(String[] args) {
           LinkedList ll=new LinkedList();
           ll.add(10);
           ll.addFirst("java");
           ll.addLast('a');
           System.out.println(ll.getLast());
           ll.add(13);
           System.out.println(ll.remove(1));
           System.out.println(ll);


    }
}
