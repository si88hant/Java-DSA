
public class Mirror_A_BinaryTree {

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		
		if(root==null) {
			return;
		}
		
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		
		//now swapping the nodes
		
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		return;
	}
	
	
}
