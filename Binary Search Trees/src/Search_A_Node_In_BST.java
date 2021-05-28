
public class Search_A_Node_In_BST {

	// Find if the integer k is present in given BST or not.
	
	public boolean search(BinaryTreeNode<Integer> root , int k) {
		
		if(root == null) {
			return false;
		}
		
		if(root.data == k) {
			return true;
		}
		
		else if(root.data > k) {
			return search(root.left , k);
		}
		
		else {
			return search(root.right , k);
		}
		
	}
	
}
