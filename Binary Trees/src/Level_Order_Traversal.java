import java.util.*;
public class Level_Order_Traversal {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//CB
        LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> rv = queue.removeFirst();
            System.out.print(rv.data+" ");
			
            if(rv.left != null){
                queue.add(rv.left);
            }
            
            if(rv.right != null){
                queue.add(rv.right);
            }
            System.out.println();

        }
	}	
	
	
}
