import java.util.ArrayList;
import java.util.Arrays;

public class Is_BT_a_BST {

    static ArrayList<Integer> al = new ArrayList<>();
    
	public static boolean isBST(BinaryTreeNode<Integer> root) {

        if(root == null){
            return true;
        }
        
        inorder(root);
        
        for(int i=0; i<al.size()-1; i++) {
        	if(al.get(i) > al.get(i+1)) {
        		return false;
        	}
        }
        return true;
	}
    
    public static void inorder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        inorder(root.left);
        al.add(root.data);
        inorder(root.right);
    }

}