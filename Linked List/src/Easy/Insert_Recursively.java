package Easy;

public class Insert_Recursively {
	
	public static Node<Integer> insertRec(Node<Integer> head, int pos, int elem){
 		
		if(head == null) {
			return head;
		}
		
		//base case
		if(pos == 0) {
			Node<Integer> newHead = new Node<>(elem);
			newHead.next = head;
			return newHead;
		}
		
		head.next = insertRec(head.next, pos-1, elem);
		
		return head;
	}

}
