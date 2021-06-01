import java.util.ArrayList;
public class Find_path_in_BST {

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        
        if(root == null){
            return null;  //base case 1
        }
        
        if(root.data == data){  // base case 2
            ArrayList<Integer> output = new ArrayList<>();
            output.add(data);
            return output;
        }
        
        ArrayList<Integer> left_output = getPath(root.left , data);
        if(left_output != null){
            left_output.add(root.data);
            return left_output;
        }	
        
        ArrayList<Integer> right_output = getPath(root.right , data);
        if(right_output != null){
            right_output.add(root.data);
            return right_output;
        }
        else{
            return null;   //na left se mila, na right se mila
        }
        
	}	
	
}
