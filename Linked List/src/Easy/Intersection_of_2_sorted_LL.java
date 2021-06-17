package Easy;

public class Intersection_of_2_sorted_LL {
	   public static Node findIntersection(Node head1, Node head2)
	    {
	        // DID IT ON MY OWN. Gonna Fly Now.
		   
	        Node h3 = null , t3 = null;
	        
	        while(head1!=null && head2!=null){
	            if(head1.data < head2.data){
	                head1 = head1.next;
	            }else if(head2.data < head1.data){
	                head2 = head2.next;
	            }else{
	                if(h3 == null){
	                    h3 = head1;
	                    t3 = h3;
	                }else{
	                    t3.next = head1;
	                    t3 = t3.next;
	                }
	                head1 = head1.next;
	                head2 = head2.next;
	            }
	            
	        }
	        return h3;
	    }
}
