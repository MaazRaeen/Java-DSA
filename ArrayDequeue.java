import java.util.*;
public class ArrayDequeue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(3);
        q.add(2);
        q.add(4);
        q.add(9);
        q.add(1);
        q.add(0);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}
