
public class Min_Steps_To_One {
	
	//recursive
	public static int countMinStepsToOne(int n) {
        
        if(n==1){
            return 0;
        }
        
        int op1 = countMinStepsToOne(n-1);
        int minSteps = op1;  // assuming the answer for now is option1(op1)
        
		if(n%3 == 0){
            int op2 = countMinStepsToOne(n/3);
            if(op2 < minSteps){
                minSteps = op2;
            }
        }
        
        if(n%2 == 0){
            int op3 = countMinStepsToOne(n/2);
            if(op3 < minSteps){
                minSteps = op3;
            }
        }
        
        return 1 + minSteps;
	}
	
	//memoization
	public static int countMinStepsToOneM(int n) {
		
		int storage[] = new int[n+1];
		return countMinStepsToOneM(n, storage);
		
	}

	public static int countMinStepsToOneM(int n, int[] storage) {
		
		if(n==1) {
			return 0;
		}
		
		if(storage[n] != 0) {
			return storage[n];
		}
		
        int op1 = countMinStepsToOneM(n-1, storage);
        int minSteps = op1;
        
        if(n%3 == 0){
            int op2 = countMinStepsToOneM(n/3, storage);
            if(op2 < minSteps){
                minSteps = op2;
            }
        }
        
        if(n%2 == 0){
            int op3 = countMinStepsToOneM(n/2, storage);
            if(op3 < minSteps){
                minSteps = op3;
            }
        }
        
        storage[n] = 1 + minSteps;
        
        return storage[n];
	}	
}
