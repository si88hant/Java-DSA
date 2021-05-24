
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
		
		int numOfNodes = numNodes(root);
		System.out.println(numOfNodes);
		
	}
	
	public static int numNodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		int count = 1;
		for(int i=0; i<root.children.size(); i++) {
			count = count + numNodes(root.children.get(i));
		}
		return count;
	}

}
