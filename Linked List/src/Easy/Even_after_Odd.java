package Easy;

public class Even_after_Odd {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
		   		LinkedListNode<Integer> odd = null, oddTail = null;
				LinkedListNode<Integer> even = null, evenTail = null;
				LinkedListNode<Integer> curr = head;

			while (curr != null)
				{
					if ((curr.data & 1) == 0) // current node is even
					{
						// handle head for first odd node
						if (odd == null) {
							odd = oddTail = curr;
						}
						else
						{
							oddTail.next = curr;
							oddTail = oddTail.next;
						}
					}
					else // current node is odd
					{
						// handle head for first even node
						if (even == null) {
							even = evenTail = curr;
						}
						else
						{
							evenTail.next = curr;
							evenTail = curr;
						}
					}
					curr = curr.next;
				}

				// if list contains at-least one even node
				if (even != null)
				{
					head = even;
					evenTail.next = odd;
				}
				// special case - list contains all odd nodes
				else {
					head = odd;
				}

				// null to terminate the list, 
				// else it will go in infinite loop
				if (oddTail != null) {
					oddTail.next = null;
				}

				return head;
			}
}
