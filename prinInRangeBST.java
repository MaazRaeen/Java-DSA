public class prinInRangeBST {
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
    public static void range(Node root, int X, int Y){
        if(root == null) return;

        if(root.data>=X && root.data<=Y){
            range(root.left, X, Y);
            System.out.print(root.data+" ");
            range(root.right, X, Y);
        }else if(root.data<=X){
            range(root.right, X, Y);
        }else{
            range(root.left, X, Y);
        }
    }

    public static void main(String[] args) {
        int values[]={5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root=insertValues(root, values[i]);
        }
        inorder(root);
        System.out.println();
        range(root, 2, 5);
        // inorder(root);
        
    }
}
