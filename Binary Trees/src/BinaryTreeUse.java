
public class BinaryTreeUse {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(10);
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(15);
		
		root.left = node1;
		root.right = node2;
		
//		      5
//		     / \
//                 10   15
		 
		
		int numOfNodes = countNodes(root);
		System.out.println(numOfNodes);
	}
	
	public static int countNodes(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return 0;
		}
		
		int totalNodes = 1;
		
		totalNodes = totalNodes + countNodes(root.left);
		totalNodes = totalNodes + countNodes(root.right);
		
		return totalNodes;
		
	}
}
