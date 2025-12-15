import java.util.LinkedList;


public class reverseLL { 
    public Node reverseRecursive(Node head){ // --> the main logic
    if(head==null || head.next==null) return head;
    Node newHead=reverseRecursive(head.next);
    head.next.next=head;
    head.next=null;
    return newHead;

}
    public static void main(String[] args) {
        LinkedList <Integer> list =new LinkedList<>();
        list.addFirst(9);
        list.addFirst(8);
        list.add(10);
        list.addLast(11);
        // list.reverseRecursive();
    }
}
