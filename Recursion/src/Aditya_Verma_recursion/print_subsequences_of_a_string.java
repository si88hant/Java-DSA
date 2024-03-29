package Aditya_Verma_recursion;

import java.util.Scanner;

public class print_subsequences_of_a_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String output = "";
		
		solve(input, output);
	}

	public static void solve(String ip, String op) { 
		
		if(ip.length() == 0) {
			System.out.print(op + " ");
			return;
		}
		
		String op1 = op;
		String op2 = op;
		
		op2 += ip.charAt(0);
		ip = ip.substring(1);
		
		solve(ip, op1);
		solve(ip, op2);
		
	}
	
}
