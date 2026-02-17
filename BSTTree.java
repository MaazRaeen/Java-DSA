public class BSTTree {
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
        System.out.println(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[]={5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root=insertValues(root, values[i]);
        }
        inorder(root);
        System.out.println();
    }
}
