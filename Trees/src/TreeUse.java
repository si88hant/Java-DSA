
public class TreeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode<Integer> root = new TreeNode<>(5);
		TreeNode<Integer> node1 = new TreeNode<>(1);
		TreeNode<Integer> node2 = new TreeNode<>(2);
		TreeNode<Integer> node3 = new TreeNode<>(3);
		TreeNode<Integer> node4 = new TreeNode<>(7);
		TreeNode<Integer> node5 = new TreeNode<>(8);
		
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node3.children.add(node4);
		node3.children.add(node5);
		
		
//		      5
//		    / | \
//		   1  2  3
//		        / \ 
//		       7   8
		
	}

}
