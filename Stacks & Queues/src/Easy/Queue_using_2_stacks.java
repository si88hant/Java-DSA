package Easy;

import java.util.*;

public class Queue_using_2_stacks {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {   
	   if(s1.empty() && s2.empty()){
	       return -1;     //return -1 if the queue is empty
	   }
	   
	   if(s2.empty()){
         while(!s1.empty())
            {	   
                int temp = s1.pop();
	            s2.push(temp);
            }
            return s2.pop();
	   }
	   
	   
	   //else{
            return s2.pop();  //if s2 is not empty then pop()
	   //}
        
    }	
	
}
