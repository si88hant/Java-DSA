package Aditya_Verma_recursion;

public class print_nos_from_n_to_1 {

	public static void main(String[] args) {
		int n = 7;
		print_Nto1(n);
	}

	private static void print_Nto1(int n) {
		// TODO Auto-generated method stub
		
		if(n<1) {
			return;
		}
		
		System.out.print(n + " ");
		print_Nto1(n-1);
		
	}

}
