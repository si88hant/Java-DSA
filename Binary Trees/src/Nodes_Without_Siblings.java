import java.util.ArrayList;

public class Nodes_Without_Siblings {
		
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return;
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		if(root.left == null && root.right != null) {
			arr.add(root.right.data);
		}
		if(root.left != null && root.right == null) {
			arr.add(root.left.data);
		}
		
		// now all the elements without siblings are stored in the arraylist
		
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		
		// all elements inside arraylist are printed
		
		//now using the recursion 
		
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}
	
}
