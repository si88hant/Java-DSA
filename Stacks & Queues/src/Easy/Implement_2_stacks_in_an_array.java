package Easy;

class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}
public class Implement_2_stacks_in_an_array {

	   //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq)
    {
        
        if(sq.top1 < sq.top2 - 1){
            sq.top1++;
            sq.arr[sq.top1] = x;
        }
        else{
            return;
        }
        
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
        
        if(sq.top1 < sq.top2 - 1){
            sq.top2--;
            sq.arr[sq.top2] = x;
        }
        else{
            return;
        }
        
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
        
        if(sq.top1 >= 0){
            int temp = sq.arr[sq.top1];
            sq.top1--;
            return temp;
        }
        else{
            return -1;
        }

    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
        
        if(sq.top2 < sq.size){
            int temp = sq.arr[sq.top2];
            sq.top2++;
            return temp;
        }
        else{
            return -1;
        }

    }	
	
}
