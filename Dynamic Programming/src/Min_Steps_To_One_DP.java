
public class Min_Steps_To_One_DP {
	
	public static int countMinStepsToOneDP(int n) {
		
        int storage[] = new int[n+1];
        storage[1] = 0;
        
        for(int i=2; i<n+1; i++){
            int min = storage[i-1];
            
            if(i%3 == 0){
                if(storage[i/3] < min){
                    min = storage[i/3];
                }
            }
            if(i%2 == 0){
                if(storage[i/2] < min){
                    min = storage[i/2];
                }
            }            
            storage[i] = 1 + min;
        }
        return storage[n];
	}
	
}
