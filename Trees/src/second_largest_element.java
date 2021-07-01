
public class second_largest_element {
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){

        TreeNode<Integer> largest_node = largest(root);
        
        if(root == largest_node){
            root.data = Integer.MIN_VALUE;
        }
        
        for(int i=0; i<root.children.size(); i++){
            if(root.children.get(i) == largest_node){
                root.children.get(i).data = Integer.MIN_VALUE;
            }
        }
		
        //now again finding the largest element, but this time the largest element will be 2nd largest
       TreeNode<Integer> second_largest = largest(root);
       return second_largest;
        

	}
    
    public static TreeNode<Integer> largest(TreeNode<Integer> root){
       if(root == null){
            return root;
        }
        
        TreeNode<Integer> ans = root;
        
        for(int i=0; i<root.children.size(); i++){
            
            TreeNode<Integer> childLargest = largest(root.children.get(i));
            
            if(childLargest.data > ans.data){
                ans = childLargest;
            }
            
        }
        return ans;
    }
}
