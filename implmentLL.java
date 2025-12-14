import java.util.LinkedList;

public class implmentLL {
    public static void main(String[] args) {
        LinkedList <Integer> el =new LinkedList<>();
        el.addFirst(9);
        el.addFirst(8);
        el.add(10);
        el.addLast(11);
        el.remove();
        el.removeLast();
        System.out.println(el);
        for(int i=0;i<el.size();i++){
            System.out.print(el.get(i)+" -> ");
        }
        System.out.println("null");
    }
}
