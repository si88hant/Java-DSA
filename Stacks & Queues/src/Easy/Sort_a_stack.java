package Easy;

import java.util.*;

public class Sort_a_stack {
	public Stack<Integer> sort(Stack<Integer> s)
	{
		
		if(!s.empty()){
		    int temp = s.pop(); 
		    sort(s);
		    sortInsert(s, temp);
		}
		
		return s;
	}
	
	public void sortInsert(Stack<Integer> s, int elem){
	    if((s.empty()) || (elem > s.peek())){
	        s.push(elem);
	        return;
	    }
	    else{ // If top is greater, remove the top item and recur
	        int temp = s.pop();
	        sortInsert(s, elem);
	        s.push(temp);
	    }
	}
}
