public class DeleteNode {
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
    public static Node delete(Node root, int val){
        if(root.data>val){
            root.left = delete(root.left, val);
        }else if(root.data<val){
            root.right= delete(root.right, val);
        }
        else{ //👆 searching part | down👇 delte part
            //case 1
            if(root.left == null && root.right==null) return null;
            //case 2
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            //case 3
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
         
    } 
    public static Node inOrderSuccessor(Node root){ //for case 3
        while(root.left !=null){
            root=root.left;

        }
        return root;
    }

    public static void main(String[] args) {
        int values[]={5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root=insertValues(root, values[i]);
        }
        inorder(root);
        System.out.println();
        delete(root, 2);

    }
}
