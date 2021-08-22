import java.util.Scanner;

public class Climbing_Stairs_Tabulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int storage[] = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			storage[i] = -1;
		}
		
		int paths = countPathsDP(n, storage);
		System.out.println(paths);

	}

	public static int countPathsDP(int n, int[] storage) {
		
		storage[0] = 1;
		storage[1] = 1;
		storage[2] = 2;
		
		//storage array ke ith index index par, i se 0 
		// ke sabhi paths honge 
		
		for(int i=3; i<=n; i++) {
			storage[i] = storage[i-1] + storage[i-2] + storage[i-3];
		}
		return storage[n];
	}

}
