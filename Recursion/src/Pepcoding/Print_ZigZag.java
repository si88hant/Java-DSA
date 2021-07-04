package Pepcoding;

import java.util.Scanner;

public class Print_ZigZag {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");  //pre
        pzz(n-1); //left call
        System.out.print(n + " ");  //in
        pzz(n-1); //right call
        System.out.print(n + " ");  //post
    }
}
