package Aditya_Verma_recursion;

import java.util.*;

public class letter_case_change_permutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String op = "";
		ArrayList<String> al = new ArrayList<>();
		solve(ip, op, al);
		
		for(String x : al) {
			System.out.println(x);
		}
	}

	private static void solve(String ip, String op, ArrayList<String> al) {
		if(ip.length() == 0) {
			al.add(op);
			return;
		}
		
		if((ip.charAt(0) >= 65 && ip.charAt(0) <= 90) || (ip.charAt(0) >= 97 && ip.charAt(0) <= 122)) {
			String op1 = op;
			String op2 = op;
			
			op1 += Character.toLowerCase(ip.charAt(0));
			op2 += Character.toUpperCase(ip.charAt(0));
			
			ip = ip.substring(1);
			
			solve(ip, op1, al);
			solve(ip, op2, al);
		}
		else {
			String op1 = op;
			
			op1 += ip.charAt(0);
			ip = ip.substring(1);
			
			solve(ip, op1, al);
		}
		
	}

}
