
public class staircaseDP {
	
	public static long staircase(int n) {     
        long storage[] = new long[n+1];
        
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return n;
        }
        
        storage[0] = 1;
        storage[1] = 1;
        storage[2] = 2;
        
        for(int i=3; i<n+1; i++){
            storage[i] = storage[i-1] + storage[i-2] + storage[i-3];
        }
        
        return storage[n];
	}
	
}
