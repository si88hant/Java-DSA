
public class Create_and_Insert_Duplicate_Node {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		
		BinaryTreeNode<Integer> root_clone = new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> save = root.left;
		
		root.left = root_clone;
		root_clone.left = save;
		
		insertDuplicateNode(save);
		insertDuplicateNode(root.right);
	}
	
}
