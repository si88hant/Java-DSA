package Easy;

public class Is_LL_Palindrome {
    boolean isPalindrome(Node head) 
    {
        if(head == null || head.next == null){
            return true;
        }

        Node temp = head;
        
        Node mid = middleNode(temp);
        Node newHead = mid.next;
        mid.next = null;
        
        Node head2 = reverse(newHead);
        
        
        while(head2 != null){
            if(head.data != head2.data){
                return false;
            }
                head = head.next;
                head2 = head2.next;   
        }
        return true;
    }   
    
    Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
