import java.util.*;

public class arrList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        // add element
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get element
        int el=list.get(2);
        System.out.println(el);

        //add element in between
        list.add(2, 5);
        System.out.println(list);

        // set element
        list.set(2, 2);
        System.out.println(list);
        
        //delete element
        list.remove(1);
        System.out.println(list);

        //ArrayList Size;
        int size=list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
