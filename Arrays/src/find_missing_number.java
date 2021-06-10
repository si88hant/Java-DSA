import java.util.Arrays;

public class find_missing_number {

	// my Ad-Hoc solution ;p 
	
	public static void main(String[] args) {
		int a[] = {1,2,4,6,3,7,8,5,10};
		
		Arrays.sort(a);
				
		int max = a[a.length-1];
		
		for(int i=0; i<max-1; i++) {
			if(i+1 != a[i]) {
				System.out.print(i+1 + " ");
				break;
			}
		}
		
	}

}
