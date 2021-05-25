
public class BinaryTreeTraversals {

	//inorder
    public void inorder(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return;
    	}
    	inorder(root.left);
    	System.out.print(root.data+" ");
    	inorder(root.right);
    }
    
    //preorder
    public void preorder(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return;
    	}
    	System.out.print(root.data + " ");
    	preorder(root.left);
    	preorder(root.right);
    }
	
    //postorder
    public void postorder(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return;
    	}
    	postorder(root.left);
    	postorder(root.right);
    	System.out.print(root.data+" ");
    }
}
