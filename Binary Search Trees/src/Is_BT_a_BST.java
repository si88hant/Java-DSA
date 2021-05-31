
public class Is_BT_a_BST {

	
	
  /* 1. Do inorder traversal and store all values in 
	 an ArrayList. If you get a sorted array then the BT 
	 is a BST */
	
 //  2. compare leftMax with root and rightMin with Node
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
    
        if(root == null){
            return true;
        }
        
        int leftMax = maximum(root.left);
        int rightMin = minimum(root.right);
        
        if(root.data <= leftMax){
            return false;
        }
        if(root.data > rightMin){
            return false;
        }
        
        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);
        
        if(isLeftBST && isRightBST){
            return true;
        }else{
            return false;
        }
	}
    
    public static int maximum(BinaryTreeNode<Integer> root){
        
        if(root == null){
            return Integer.MIN_VALUE;
        }
        
        return Math.max(root.data , Math.max(maximum(root.left) , maximum(root.right)));
    }
    
    public static int minimum(BinaryTreeNode<Integer> root){
        
        if(root == null){
            return Integer.MAX_VALUE;
        }
        
        return Math.min(root.data , Math.max(minimum(root.left) , minimum(root.right)));
    }
	
	
}
