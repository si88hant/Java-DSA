import java.io.*;
import java.util.*;

public class Longest_Increasing_Subsequence_DP {
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int overall_max = 0;
        int dp[] = new int[n];
        
        for(int i=0; i<n; i++){
            int max = 0;
            
            for(int j=0; j<i; j++){
                if(arr[j]<arr[i]){
                    if(dp[j]>max){
                        max = dp[j];
                    }
                }
            }
            
            dp[i] = max + 1;
            if(dp[i] > overall_max){
                overall_max = dp[i];
            }
        }
        System.out.println(overall_max);
        
    }

}
