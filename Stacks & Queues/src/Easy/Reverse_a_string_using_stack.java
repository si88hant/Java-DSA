package Easy;

import java.util.*;

public class Reverse_a_string_using_stack {
    public String reverse(String S){

        Stack <Character> stack = new Stack<>();
        
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            stack.push(ch);
        }
        
        String output = "";
        
        while(!stack.empty()){
            output += stack.pop();
        }
        
        return output;
    }
}
