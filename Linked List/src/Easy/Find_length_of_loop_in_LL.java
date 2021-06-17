package Easy;

public class Find_length_of_loop_in_LL {

    static int countNodesinLoop(Node head)
    {
    	/* This function detects and counts loop
    	nodes in the list. If loop is not there
    	in then returns 0 */
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            /* If slow_p and fast_p meet at some point
            then there is a loop */
            if(slow == fast){
                return countNodes(slow);   
            }            
        }
        /* Return 0 to indicates that there is no loop*/
        return 0;  
    }
    
 // Returns count of nodes present in loop.
    static int countNodes(Node head){
        int count = 1;
        Node temp = head;
        
        while(temp.next!=head){
            temp = temp.next;
            count++;
        }
        return count;
    }	
	
}
