package Tree;

public class TreeToLinkedList {
    public static void makeFlat(Node root){
        if(root == null){
            return ;
        }

        makeFlat(root.left);

        if(root.left != null){
            Node right = root.right;
            Node left = root.left;
            root.right = left;

            while(left.right != null){
                left = left.right;
            }

            left.right = right;
        }

        makeFlat(root.right);

        return;
    }
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3,4,5,6,7};
        Node root = Tree.makeTree(arr);
        makeFlat(root);
        Tree.inOrder(root);
    }
}
