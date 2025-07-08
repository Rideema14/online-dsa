import java.util.Vector;
public class vector {
    public static void main(String[] args) {
        Vector v=new Vector();
        for (int index = 0; index < 13; index++) {
            v.addElement(index);
        }
         for (int index = 0; index < 21; index++) {
            v.addElement(index);
        }
System.out.println(v);
v.removeElement(10);
v.removeElementAt(3);
System.out.println(v);

    }
}
