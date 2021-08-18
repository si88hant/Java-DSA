import java.util.*;
public class Buy_the_ticket {

	public static void main(String[] args) {
		int arr[] = {2, 3, 2, 2, 4};
		int k = 3;
		System.out.println(buyTicket(arr, k));

	}
	
	
	public static int buyTicket(int input[], int k) {
	
		int timer = 0;
       
		Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       
        for (int i=0;i<input.length;i++){
            queue.add(i);
            pq.add(input[i]);
       
        }
        
        int i=0;
        
        while (!queue.isEmpty()){
            if (input[queue.peek()] < pq.peek()){
                queue.add(queue.poll());
            }else{
                int temp = queue.poll();
                pq.remove();
                timer++;
                if (temp == k){
                    return timer;
                }
            }
        }
        
        return timer;
	}

}
