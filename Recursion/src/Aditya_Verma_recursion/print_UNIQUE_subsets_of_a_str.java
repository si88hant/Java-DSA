package Aditya_Verma_recursion;

import java.util.HashSet;
import java.util.Scanner;

public class print_UNIQUE_subsets_of_a_str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String output = "";
		
		solve(input, output);
	}
	
	public static void solve(String ip, String op) { 
	
		HashSet<String> hs = new HashSet<>();
	
		if(ip.length() == 0) {
			hs.add(op);
			System.out.println(hs);
			return;
		}
		
		String op1 = op;
		String op2 = op;
		
		op2 += ip.charAt(0);
		ip = ip.substring(1);
		
		solve(ip, op1);
		solve(ip, op2);

		
		
//		for(String s: hs) {
//			System.out.println(s);
//		}
	}
}
