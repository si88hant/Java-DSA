package Easy;

public class getNth_node_from_end {
    int getNthFromLast(Node head, int n)
    {	
    	//first find length
    	int len = 0;
    	Node temp = head;
    	
    	while(temp != null){
    	    len++;
    	    temp = temp.next;
    	}
    	
    	
    	Node temp2 = head;
    	int counter = 1; 
    	
    	while(temp2 != null){
    	    if(counter == (len-n+1)){
    	        return temp2.data;
    	    }
    	    temp2=temp2.next;
    	    counter++;
    	}
    	return -1;      //if(n>length) then return -1
    }
}
