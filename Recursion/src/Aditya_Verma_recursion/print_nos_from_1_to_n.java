package Aditya_Verma_recursion;

public class print_nos_from_1_to_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		print(n);

	}
	
	public static void print(int n) {
		
		if(n<1) {
			return;
		}
		
		print(n-1);
		System.out.print(n + " ");
	}

}
