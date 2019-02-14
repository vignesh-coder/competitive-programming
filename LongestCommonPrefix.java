
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vignesh-7204
 */
public class Solution {
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt() - 1;
        
        String str = in.next();
        
        while(n-->0){
        
            str = findCommon(str,in.next());
        }
        System.out.println(str);
                
    }

    private static String findCommon(String str, String str1) {
        
        String res = "";
        
        for(int i = 0;i<str.length() && i<str.length() && str1.charAt(i) == str.charAt(i);i++){
        
            res += str.charAt(i);
        }
        
        return res;
    }
    
}
