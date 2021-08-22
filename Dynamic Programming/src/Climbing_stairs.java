import java.util.*;

public class Climbing_stairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int paths = countPaths(n);
		System.out.println(paths);

	}

	public static int countPaths(int n) {
		
		//base case
		if(n==0) {
			return 1;
		}else if(n<0) {
			return 0;
		}
		
		int nm1 = countPaths(n-1);
		int nm2 = countPaths(n-2);
		int nm3 = countPaths(n-3);
		
		int tp = nm1 + nm2 + nm3;
		
		return tp;
		
	}
	
	

}
