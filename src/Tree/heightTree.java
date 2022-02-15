package Tree;

public class heightTree {
    public static int treeHeight(Node root){
        if(root == null){
            return 0;
        }

        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);

        return 1+Math.max(lh,rh);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Node root = Tree.makeTree(arr);
        System.out.println(treeHeight(root));

    }
}
