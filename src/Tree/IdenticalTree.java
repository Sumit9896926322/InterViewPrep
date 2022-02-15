package Tree;

public class IdenticalTree {
    public static boolean isTreeSame(Node root1,Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null && root2!= null){
            return false;
        }
        if(root2 == null && root1!= null){
            return false;
        }
        if(root1.data != root2.data){
            return false;
        }

        return isTreeSame(root1.left,root2.left) && isTreeSame(root1.right,root2.right);
    }
    public static void main(String[] args) {


    }
}
