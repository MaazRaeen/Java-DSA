public class InOrderBtraversal {
    public static class Node{
        int data;
        Node right;
        Node left;
        Node (int data){
            this.data=data;
            this.left =null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int []nodes){
            idx++;
            if(nodes[idx]==-1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;

        }
    }
    public static void InOrdertraversal(Node root){
        if(root==null) return;
        InOrdertraversal(root.left);
        System.out.println(root.data+" ");
        InOrdertraversal(root.right);

    }
    public static void main(String[] args) {
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root= tree.BuildTree(nodes);
        InOrdertraversal(root);
        System.out.println(root.data);

    }
}
