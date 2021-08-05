import java.util.ArrayList;

public class Root_to_node_path {

	public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root, int data){
		
		if(root == null) { //base case 1
			return null;
		}
		if(root.data == data) { //base case 2
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> left_output = getRootToNodePath(root.left, data);
		if(left_output != null) {
			left_output.add(root.data);
			return left_output;
		}
		
		ArrayList<Integer> right_output = getRootToNodePath(root.right, data);
		if(right_output != null) {
			right_output.add(root.data);
			return right_output;
		}
		else {
			return null; //na left se mila, na right se mila
		}
		
	}
	
}
