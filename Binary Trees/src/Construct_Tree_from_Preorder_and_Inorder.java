
public class Construct_Tree_from_Preorder_and_Inorder {
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		
        return buildTree(preOrder, inOrder, 0, inOrder.length-1 , 0, preOrder.length-1);
        
	}
	
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder, int in_st, int in_end, int pre_st, int pre_end){
       
        if(in_st > in_end){
           return null;
        }
        
        int rootData = preOrder[pre_st];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);   //making root node 
        
        int rootInIndex = -1;
        
        for(int i = in_st; i<in_end; i++){
            if(inOrder[i] == rootData){
                rootInIndex = i;
                break;
            }
        }
        if(rootInIndex == -1){
            return null;
        }
        
        
        
        int left_in_st = in_st;
        int left_in_end = rootInIndex - 1;
        int left_pre_st = pre_st + 1;
        int left_pre_end = left_in_end - left_in_st + left_pre_st;
        
        int right_in_st = rootInIndex + 1;
        int right_in_end = in_end;
        int right_pre_st = left_pre_end + 1;
        int right_pre_end = pre_end;        
        
        
        root.left = buildTree(preOrder, inOrder, left_in_st, left_in_end, left_pre_st, left_pre_end);
		root.right = buildTree(preOrder, inOrder, right_in_st, right_in_end, right_pre_st, right_pre_end);
        
        return root;

    }	
}
