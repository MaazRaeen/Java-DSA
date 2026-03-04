import java.util.*;
public class Root2LeafBST {
    static class Node{
        int data;
        Node left;
        Node right;;
        Node (int data){
        this.data=data;
        }
    }

    static Node insertValues(Node root, int val){
        if(root ==null){
            return root= new Node(val);
            // return root;
        }
        if(root.data>val){ 
            root.left = insertValues(root.left, val);
        }else{
            root.right=insertValues(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean serch(Node root, int key){
        if (root==null) return false;
        if(root.data>key){ //left subtree
            return serch(root.left, key);
        }else if(root.data == key){
            return true;
        }else{
            return serch(root.right, key);
        }
        
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i =0;i<path.size();i++){
            System.out.print(path.get(i)+"-> ");
        }
        System.out.println();
    }
    public static void printR2L(Node root, ArrayList<Integer> path){
        if(root==null) return ;
        path.add(root.data);
        //leaf
        if(root.left==null && root.right == null){
            printPath(path);
        }else{//non leaf
            printR2L(root.left, path);
            printR2L(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values[]={5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root=insertValues(root, values[i]);
        }
        inorder(root);
        System.out.println();
        printR2L(root, new ArrayList<>());
        
    }
}
