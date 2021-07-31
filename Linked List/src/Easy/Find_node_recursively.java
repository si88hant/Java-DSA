package Easy;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Find_node_recursively {

	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
        
        if(head == null){
            return -1;
        }
        
        if(n == head.data){
            return 0;
        }
        
        int recursive_ans = findNodeRec(head.next , n);
        if(recursive_ans == -1){
            return -1;
        }
        
        return recursive_ans + 1;
	}
	
}
