package Easy;

public class Pairwise_swap_elements {

    public Node pairwiseSwap(Node head)
    {
        // DID IT ON MY OWN. NO HINTS SEEN. TOOK ME 43 MINUTES
        
        if(head == null || head.next == null){
            return head;
        }
        
        Node prev = head;
        Node curr = head.next;
        
        Node recur_head = pairwiseSwap(curr.next);
        
        prev.next = recur_head;
        curr.next = prev;
        
        return curr;
    }	
	
	
}
