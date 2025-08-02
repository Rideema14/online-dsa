import java.util.*;
public class weakhashmap {
    public static void main(String[] args) throws InterruptedException {
        // Hashmap m =new HashMap();
        WeakHashMap m=new WeakHashMap();
        Temp t=new Temp();
        m.put(t,"Java");
        System.out.println(m);
    
        t=null;
        System.gc();
       Thread.sleep(5000);
       System.out.println(m);}
    
    }
    class Temp{
        public String toString(){
            return "temp";
        }
        public void finalize(){
            System.out.println("finalaise is called");
        }
    }

