
public class MinCostPath_DP {

	public static void main(String[] args) {
		int arr[][] = {{1,1,1},{4,5,2},{7,8,9}};
		System.out.println(minCostPathDP(arr));
	}

	public static int minCostPathDP(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		
		int storage[][] = new int[m][n];
		
		storage[m-1][n-1] = arr[m-1][n-1];
		
		//we can calculate last row and last column using storage[m-1][n-1]
		
		//last row
		for(int j=n-2; j>=0; j--) {
			storage[m-1][j] = storage[m-1][j+1] + arr[m-1][j];
		}
		//last column
		for(int i=n-2; i>=0; i--) {
			storage[i][n-1] = storage[i+1][n-1] + arr[i][n-1];
		}
		
		for(int i=m-2; i>=0; i--) {
			for(int j=n-2; j>=0; j--) {
				storage[i][j] = arr[i][j] + Math.min(storage[i][j+1], Math.min(storage[i+1][j+1], storage[i+1][j]));
			}
		}
		return storage[0][0]; //it'll return the 'cost' from (0,0) to (m-1, n-1)
	}

}
