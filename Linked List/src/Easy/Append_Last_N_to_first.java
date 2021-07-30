package Easy;


public class Append_Last_N_to_first {
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		
        
        if(head == null || n==0){
            return head;
        }
        
        LinkedListNode<Integer> fast = head;
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> initialHead = head;
        
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        LinkedListNode<Integer> temp = slow.next;
        
        slow.next = null;
        fast.next = initialHead;
        head = temp;
        
        return head;
	}
}
