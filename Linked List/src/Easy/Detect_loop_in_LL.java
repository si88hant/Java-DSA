package Easy;


class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class Detect_loop_in_LL {
    public static boolean detectLoop(Node head){
        
        if(head == null){
            return false;
        }
        
        Node slow = head;
        Node fast = head.next;
        
        while(fast!= null && slow !=null && fast.next!=null){
           if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
