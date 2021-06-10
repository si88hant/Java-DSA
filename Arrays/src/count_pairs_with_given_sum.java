
public class count_pairs_with_given_sum {

	//inefficient solution

	    public static void main(String args[])
	    {
	        int[] arr = { 1, 5, 7, -1, 5 };
	        int sum = 6;
	        int ans = getPairsCount(arr, sum);
	        System.out.println(ans);
	    }

		public static int getPairsCount(int[] arr, int sum) {
			
			int count = 0;
			
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i] + arr[j] == sum) {
						count++;
					}
				}
			}
			return count;
		}
}
