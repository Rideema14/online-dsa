
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class any_position {
    Node head;
    public boolean isEmpty() {
        return (head == null);
    }
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    public void insertLast(int data) {
        Node newNode = new Node(data);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        newNode.data = data;
        curr.next = newNode;
    }
    public void disp() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }
      public static void main(String[] args) {

        any_position ll = new any_position();
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertLast(30);
        ll.insertLast(40);
        ll.disp();

    }
   }
  
