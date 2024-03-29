package Pepcoding;

import java.io.*;
import java.util.*;

public class get_keypad_combination {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {
        
        //base case
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        //678
        char ch = str.charAt(0); //6
        String ros = str.substring(1); //78
        
        ArrayList<String> rres = getKPC(ros);  //6 words of 78
        ArrayList<String> mres = new ArrayList<>(); // 24 words for 678
        
        String codeforch = codes[ch - '0'];   // codes array mai se 'ch' ke correponding wali string nikal li
        
        for(int i=0; i<codeforch.length(); i++){
            char chcode = codesforch.charAt(i);
            
            for(String rstr: rres){
                myres.add(chcode + rstr);
            }
        }
        
        return mres;
    }
}
