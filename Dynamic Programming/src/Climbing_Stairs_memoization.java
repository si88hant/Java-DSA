import java.util.Scanner;

public class Climbing_Stairs_memoization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int storage[] = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			storage[i] = -1;
		}
		
		int paths = countPaths(n, storage);
		System.out.println(paths);

	}

	public static int countPaths(int n, int[] storage) {
		
		//base case
		if(n==0) {
			return 1;
		}else if(n<0) {
			return 0;
		}
		
		if(storage[n] > 0) {
			return storage[n];
		}
		
		int nm1 = countPaths(n-1, storage);
		int nm2 = countPaths(n-2, storage);
		int nm3 = countPaths(n-3, storage);
		
		int tp = nm1 + nm2 + nm3;
		
		storage[n] = tp;
		return tp;
		
	}

}
