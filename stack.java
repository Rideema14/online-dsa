import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push('a');
            s.push('b');
                s.push('c');
                System.out.println(s.empty());
                System.out.println(s);
                s.pop();
                System.out.println(s.search('b'));
                s.peek();
                System.out.println(s);

    }
}
