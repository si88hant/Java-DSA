
public class TreeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode<Integer> root = new TreeNode<>(5);
		TreeNode<Integer> node1 = new TreeNode<>(1);
		TreeNode<Integer> node2 = new TreeNode<>(2);
		TreeNode<Integer> node3 = new TreeNode<>(3);
		TreeNode<Integer> node4 = new TreeNode<>(7);
		TreeNode<Integer> node5 = new TreeNode<>(8);
		
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node3.children.add(node4);
		node3.children.add(node5);
		
		
//		      5
//		    / | \
//		   1  2  3
//		        / \ 
//		       7   8
		
		int numOfNodes = numNodes(root);
		System.out.println(numOfNodes);
		
		int sum = sumOfAllNode(root);
		System.out.println(sum);
		
		int largestNode = largest(root);
		System.out.println(largestNode);
		
		preOrder(root);
		System.out.println();
		postOrder(root);
		
	}
	
	public static int numNodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		int count = 1;
		for(int i=0; i<root.children.size(); i++) {
			count = count + numNodes(root.children.get(i));
		}
		return count;
	}
	
	public static int sumOfAllNode(TreeNode<Integer> root){
		
        if(root == null){
            return 0;
        }
        
        int sum = root.data;
        
        for(int i=0; i<root.children.size(); i++){
            sum = sum + sumOfAllNode(root.children.get(i));
        }
        
        return sum;
        
	}
	
	public static int largest(TreeNode<Integer> root) {
		
		if(root == null) {
			return Integer.MIN_VALUE;  //return negative infinity
		}
		
		int largestNode = root.data;
		
		for(int i=0; i<root.children.size(); i++) {
			int largestChild = largest(root.children.get(i));
			
			if(largestChild>largestNode) {
				largestNode = largestChild;
			}
		}
		return largestNode;
	}
	
	public static int getHeight(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int maxHeight = 0;
		
		for(int i=0; i<root.children.size(); i++) {
			int max = getHeight(root.children.get(i));
			
			if(max>maxHeight) {
				maxHeight = max;
			}
		}
		
		return maxHeight;
	}
	
	public static void printNodeAtDepthK(TreeNode<Integer> root, int k) {
		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		for(int i=0; i<root.children.size(); i++) {
			printNodeAtDepthK(root.children.get(i), k-1);
		}
		
	}
	
	public static int countLeafNodes(TreeNode<Integer> root){

		
        if(root == null){
            return 0;
        }
        
        if(root.children.size() == 0){
            return 1;
        }
        
        int count = 0;
        for(int i=0; i<root.children.size(); i++){
            count += countLeafNodes(root.children.get(i));
        }
            
        return count;

	}
	
	public static void preOrder(TreeNode<Integer> root) {
		
		if(root==null) {
			return;
		}
		
		System.out.print(root.data + " ");
		
		for(int i=0; i<root.children.size(); i++) {
			preOrder(root.children.get(i));
		}

	}
	
	public static void postOrder(TreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		
		for(int i=0; i<root.children.size(); i++) {
			postOrder(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}
	

}
