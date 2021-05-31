
class LinkedListNode<T>{
	public T data;
	public LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class BST_to_sorted_LinkedList {

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {

		/*
		 
		 My Solution : Throwing null pointer exception --> because you didn't consider other cases
		 
        if(root == null){
            return null;
        }
        
        LinkedListNode<Integer> midLL = new LinkedListNode<>(root.data);
        
        LinkedListNode<Integer> left_head = constructLinkedList(root.left);
        
        LinkedListNode<Integer> temp = left_head;   
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = midLL;
    
        LinkedListNode<Integer> right_head = constructLinkedList(root.right);
        midLL.next = right_head;
        
        return left_head;
        
        */
        
		if(root == null) {
			return null;
		}
		
		LinkedListNode<Integer> midLL = new LinkedListNode<>(root.data);
		
		if(root.left == null && root.right == null) {
			return midLL;
		}
		
		else if(root.left != null && root.right !=null) {
			LinkedListNode<Integer> left_head = constructLinkedList(root.left);
			LinkedListNode<Integer> temp = left_head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = midLL;
			
			LinkedListNode<Integer> right_head = constructLinkedList(root.right);
			midLL.next = right_head;
			
			return left_head;
		}
		
		else if(root.left != null) {
			LinkedListNode<Integer> left_head = constructLinkedList(root.left);
			LinkedListNode<Integer> temp = left_head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = midLL;
			
			return left_head;
		}
		else {
			LinkedListNode<Integer> right_head = constructLinkedList(root.right);
			midLL.next = right_head;
			
			return midLL; 

		}
		
	}	
	
}
