package Pepcoding;

import java.util.Scanner;

public class power_in_logarithmic_complexity {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        
        int ans = power(x,n);
        System.out.println(ans);
        
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnb2 = power(x , n/2);
        int xn = xnb2 * xnb2;
        
        if(n%2 != 0){
            xn = x * xn;
        }
        return xn;
    }
}
