package Pepcoding;

import java.util.Scanner;

public class print_decreasing_increasing {
    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
