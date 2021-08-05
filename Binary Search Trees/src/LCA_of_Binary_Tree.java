
public class LCA_of_Binary_Tree {
	

	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
  
        if(root == null){
            return -1;
        }
     
        if(a == root.data || b == root.data){
            return root.data;
        }
        
        int leftLCA = getLCA(root.left, a, b);
        int rightLCA = getLCA(root.right, a, b);
        
        if(leftLCA != -1 && rightLCA == -1){
            return leftLCA;
        }
        else if(leftLCA == -1 && rightLCA != -1){
            return rightLCA;
        }
        else if(leftLCA == -1 && rightLCA == -1){
            return -1;
        }
        else {
            return root.data;
        }
	}
        
}
