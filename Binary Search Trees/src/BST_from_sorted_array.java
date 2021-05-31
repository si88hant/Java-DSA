
public class BST_from_sorted_array {

/*	Given a sorted integer array A of size n, which contains
	all unique elements. You need to construct a balanced
	BST from this input array. Return the root of
	constructed BST.  */
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		return SortedArrayToBST(arr, 0, n-1);
	}

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int start, int end){
        
		
        if(start > end){
            return null;
        }  //base case
        
        int mid = (start + end)/2;
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        
        BinaryTreeNode<Integer> leftNode = SortedArrayToBST(arr, start, mid-1);
        root.left = leftNode;
        
        BinaryTreeNode<Integer> rightNode = SortedArrayToBST(arr, mid+1, end);
        root.right = rightNode;
        
        return root;
    }	
	
}
