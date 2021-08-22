import java.util.Scanner;

public class Climb_stairs_with_variable_jumps {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	         
	         int arr[] = new int[n];
	         for(int i=0; i<n; i++){
	             arr[i] = sc.nextInt();
	         }
	         
	         int dp[] = new int[n+1];
	         
	         dp[n] = 1;
	         
	         //ye dp[] store karega i se n pe jaane ki ketne raaste hain
	         
	         for(int i=n-1; i>=0; i--){
	             for(int j=1; j<=arr[i] && (i+j)<dp.length; j++){
	                 dp[i] = dp[i] + dp[i+j];
	             }
	         }
	         
	         System.out.println(dp[0]);
	}

}
