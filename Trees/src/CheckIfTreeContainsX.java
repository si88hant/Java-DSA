
public class CheckIfTreeContainsX {

	// check if a generic tree contains element x
	
	public boolean checkX(TreeNode<Integer> root, int x) {
		
		if(root == null) {
			return false;
		}
		
		if(root.data == x) {
			return true;
		}
		
		for(int i=0; i<root.children.size(); i++) {
			if(checkX(root.children.get(i), x)) {
				return true;
			}
		}
		return false;
	}
	
}
