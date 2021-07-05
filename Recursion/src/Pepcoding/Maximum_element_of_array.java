package Pepcoding;

import java.util.Scanner;

public class Maximum_element_of_array {
    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = maxOfArray(arr, 0);
        System.out.println(ans);
    }

    public static int maxOfArray(int[] arr, int idx){
        
        if(idx == arr.length-1){  //base case
            return arr[idx];
        }

        int temp_max = arr[idx];
        
        int asli_max = maxOfArray(arr, idx+1);
        
        return Math.max(temp_max, asli_max);
        
    }
}
