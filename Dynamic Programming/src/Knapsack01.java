
public class Knapsack01 {

	public static void main(String[] args) {
		int weights[] = {6,1,2,4,5};
		int values[] = {10,5,4,8,6};
		int maxWeight = 5;
		
		System.out.println(knapsack(weights, values, maxWeight));
	}
	
	public static int knapsack(int[] weights, int values[], int maxWeight) {
		return knapsack(weights, values, maxWeight, 0);
	}

	public static int knapsack(int[] weights, int[] values, int maxWeight, int i) {
		
		//base case
		if(i==weights.length || maxWeight==0) {
			return 0;
		}
		
		if(weights[i] > maxWeight) {
			return knapsack(weights, values, maxWeight, i+1);
		}else {
			//include this item
			int op1 = values[i] + knapsack(weights, values, maxWeight - weights[i], i+1);
			
			//don't include this item
			int op2 = knapsack(weights, values, maxWeight, i+1);
			
			return Math.max(op1, op2);
		}
	}
	

}
