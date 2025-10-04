import java.util.*;
public class subsetOfNNaturalNo {
    public static void print(ArrayList<Integer>subset){
        for(int i=0;i<subset.size();i++){
            System.out.println(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void printSubSet(int n, ArrayList<Integer> subset){
        if(n==0){
            print(subset);
            return;
        }
        // if adds
        subset.add(n);
        printSubSet(n-1, subset);
        // if don't add 
        subset.remove(subset.size()-1);
        printSubSet(n-1, subset);
        return;

    }
    public static void main(String[] args) {
        int n=2;
        ArrayList <Integer> subset=new ArrayList<>(); 
        printSubSet(n, subset);
    }
}
