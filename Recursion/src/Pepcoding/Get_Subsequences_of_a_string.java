package Pepcoding;

import java.io.*;
import java.util.*;

public class Get_Subsequences_of_a_string {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        ArrayList<String> ans = gss(str);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {

        if(str.length() == 0){
            ArrayList<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> recres = gss(ros);
        
        ArrayList<String> myres = new ArrayList<>();
        
        for(String rstr: recres){
            myres.add("" + rstr);
        }
        for(String rstr: recres){
            myres.add(ch + rstr);
        }
        
        return myres;
    }
}
