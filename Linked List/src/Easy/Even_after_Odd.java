package Easy;

public class Even_after_Odd {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
       
		LinkedListNode<Integer> evenHead = null, evenTail = null, oddHead = null, oddTail = null;
        
        while(head != null){
            
            if(head.data%2 ==0){ //if head's data is even
                
               if(evenHead == null){
                   evenHead = head;
                   evenTail = head;
               }else{
					evenTail.next = head;
                    evenTail = evenTail.next;
               }
                
            }
            else{ //if head's data is odd
                
                if(oddHead == null){
                    oddHead = head;
                    oddTail = head;
                }else{
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            	
            }
            
            head = head.next;
        }
            
        if(oddHead == null){
            return evenHead;
        }
        else{
            oddTail.next = evenHead;
        }
        
        if(evenHead != null){
            evenTail.next = null;
        }
        
        return oddHead; 
	}
}
