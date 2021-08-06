import java.util.*;
public class Pair_Sum_in_Binary_Tree {
	
    static ArrayList<Integer> al = new ArrayList<>();
    
	static void pairSum(BinaryTreeNode<Integer> root, int sum) {
		
		//storing tree elements in an arraylist in pre-order form
        preOrder(root);
        
        //copying the arraylist elements into an array
        int arr[] = new int[al.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = al.get(i);
        }
        
        //now sorting the array
        Arrays.sort(arr);
        
        int i = 0, j = arr.length-1;  //using 2 pointers approach
        
        while(i<j){
            if(arr[i] + arr[j] == sum){
                System.out.println(arr[i] + " "+ arr[j]);
                i++;
                j--;
            }
            else if(arr[i] + arr[j] > sum){
                j--;
            }
            else{
                i++;
            }
        }
        
	}

    
    public static void preOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        al.add(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
	
}
