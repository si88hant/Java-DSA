
public class fibonacci_memoization {

	public static void main(String[] args) {
		int n =4;
		System.out.println(fibM(n));
	}

	public static int fibM(int n) {
		
		int storage[] = new int[n+1];
		for(int i=0; i<n+1; i++) {           // making a storage array and initializing it to -1
			storage[i] = -1;
		}
		
		return fibM(n,storage);
	}
	
	public static int fibM(int n, int storage[]) {
		if(n==0 || n==1) {
			storage[n] = n;
			return storage[n];
		}
		
		if(storage[n] != -1) {
			return storage[n];
		}
		
		storage[n] = fibM(n-1,storage) + fibM(n-2, storage);
		return storage[n];
	}
}
