package Tree;

public class IsSymmetric
{
    public static boolean isMirror(Node left,Node right){

        if(left == null && right == null){
            return true;
        }
        if(left == null && right !=null || right == null && left!=null)
            return false;

        if(left != null && right != null && left.data != right.data)
            return false;


        Boolean leftSymmetry = isMirror(left.left,right.right);
        Boolean rightSymmetry = isMirror(right.left,left.right);

        return leftSymmetry && rightSymmetry;

    }

    public static void main(String[] args) {
        int arr[] = {5,1,-1,-1,1,2,-1,-1,2};
        Node root = Tree.makeTree(arr);

        System.out.println(root == null || isMirror(root.left,root.right));
    }
}
