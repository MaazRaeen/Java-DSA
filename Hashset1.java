import java.util.*;
// import java.util.Iterator;
public class Hashset1 {
    public static void main(String[] args) {

        // set do  not save the element in sort order

        //creating 
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);

        //iterator   in hashset
        Iterator it = set.iterator();
        // 2 method - next() / hasNext();

        while(it.hasNext()){
            System.out.println(it.next());
        }


        // size of the set
        System.out.println("the size of the set is :"+ set.size()); 
        //search - contains
        if(set.contains(1)){
            System.out.println(" yes true");
        }
        if(!set.contains(6)){
            System.out.println("do not conatins");
        }

        // delete 

        set.remove(1);
        if(!set.contains(1)){
            System.out.println("1 is deleted");
        }
        System.out.println(set) ;
    }
}
