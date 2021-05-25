
public class DiameterOfBinaryTree {

	
	public Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){
		
		if(root == null) {
			Pair<Integer,Integer> output = new Pair<>();
			output.first = 0;
			output.second = 0;
			return output;
		}
		
		Pair<Integer,Integer> left_output = heightDiameter(root.left);
		Pair<Integer,Integer> right_output = heightDiameter(root.right);
		
		int height = 1 + Math.max(left_output.first, right_output.first);
		
		int option1 = left_output.first + right_output.first;
		int option2 = left_output.second;
		int option3 = right_output.second;
		
		int diameter = Math.max(option1, Math.max(option2, option3));
		
		Pair<Integer, Integer> output = new Pair<>();
		output.first = height;
		output.second = diameter;
		
		return output;
		
	}
}
