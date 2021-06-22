package Easy;

import java.util.*;
import java.util.LinkedList;

public class Stack_using_2_queues {

	{
	    Queue<Integer> q1 = new LinkedList<>();
	    Queue<Integer> q2 = new LinkedList<>();
	    
	    //Function to push an element into stack using two queues.
	    void push(int a)
	    {
		    q1.add(a);
	    }
	    
	    //Function to pop an element from stack using two queues. 
	    int pop()
	    {
		    // Your code here
		    
		    if(q1.isEmpty()){
		        return -1;
		    }
		    
	        while(q1.size() != 1){
	            q2.add(q1.remove());
	        }
	        
	        
		    int temp = q1.remove();
		    
		    //swapping the queues q1 and q2
		    Queue<Integer> temp_q = q1;
		    q1 = q2;
		    q2 = temp_q;
		    
		    return temp;
		    
	    }	
	}
}
