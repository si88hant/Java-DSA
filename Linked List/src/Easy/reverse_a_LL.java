package Easy;


public class reverse_a_LL {
    Node reverseList(Node head)
    {
    	
    	//recursive solution
//        if(head==null || head.next==null){
//            return head;
//        }
//        
//        Node temp1 = head;
//        
//        Node newHead = reverseList(head.next);
//        
//        Node temp2 = newHead;
//        
//        while(temp2.next!=null){
//            temp2 = temp2.next;
//        }
//        temp2.next = temp1;
//        temp1.next = null;
//        
//        return newHead;
    	
    	
    	//Iterative solution
    	
        Node curr = head;
        Node prev = null;
        
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;    	
    	
    }	
}
