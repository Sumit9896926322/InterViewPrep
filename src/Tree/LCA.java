package Tree;

public class LCA {
    public static Node LCA (Node root,int n1,int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node left = LCA(root.left,n1,n2);
        Node right = LCA(root.right,n1,n2);

        if(right == null){
            return left;
        }else if(left == null){
            return right;
        }else{
            return root;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n1 = 6;
        int n2 = 7;
        Node root = Tree.makeTree(arr);
        Node lca = LCA(root,n1,n2);
        System.out.println(lca == null? -1:lca.data);
    }
}
