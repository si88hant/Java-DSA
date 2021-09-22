package Aditya_Verma_recursion;

import java.util.Scanner;

public class print_permutations_with_space {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String output = "";
		
		output += input.charAt(0);
		input = input.substring(1);
		
		solve(input, output);

	}

	private static void solve(String ip, String op) {
		if(ip.length() == 0) {
			System.out.println(op);
			return;
		}
		
		String op1 = op;
		String op2 = op;
		
		op1 += " ";
		op1 += ip.charAt(0);
		
		op2 += ip.charAt(0);
		
		ip = ip.substring(1);
		
		solve(ip, op1);
		solve(ip, op2);
	}

}
