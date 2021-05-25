
public class BinaryTreeUse {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(10);
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(15);
		
		root.left = node1;
		root.right = node2;
		
//		      5
//		     / \
//         10   15
		 
	}

}
