
public class Remove_Leaf_Nodes {

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
		
		if(root == null) {
			return root;
		}
		
		if(root.left ==null && root.right==null) {
			root = null;
			return root;
		}
		BinaryTreeNode<Integer> updated_left = removeAllLeaves(root.left);
		BinaryTreeNode<Integer> updated_right = removeAllLeaves(root.right);
		
		root.left = updated_left;
		root.right = updated_right;
		
		return root;
		
	}
	
}
