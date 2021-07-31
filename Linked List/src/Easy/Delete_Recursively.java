package Easy;

public class Delete_Recursively {
	

	public static LinkedList<Integer> deleteNodeRec(LinkedList<Integer> head, int pos){
		
		if(head == null) {
			return head;
		}
		
		if(pos == 0) {
			return head.next;
		}
		
		LinkedList<Integer> resurcive_head = deleteNodeRec(head.next, pos-1);
		
		head.next = resurcive_head;
		
		return head;
	}
}
