
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
        
        String num = in.next();
        
        long k = in.nextLong();
        
        if (num.length() <= k) {
            
            System.out.println(0);
            
            return;
        }
        
        if (k == 0) {
            
            System.out.println(num);
            
            return;
        }
        
        char arr[] = num.toCharArray();
        
        int min = 9;
        int idx = -1;
        for (int i = 0; i <= k; i++) {
            
            int digit = arr[i] - '0';
            if (digit < min) {
                
                min = digit;
                idx = i;
            }
        }
        
        k = k - idx;
        
        for (int i = 0; i < idx; i++) {
            
            arr[i] = 0;
        }
        
        for (int i = idx + 1; i < arr.length && k > 0; i++) {
            
            int max = 0;
            int pos = 0;
            for (int j = idx + 1; j < arr.length; j++) {
                
                int digit = arr[j] - '0';
                if (digit > max) {
                    
                    max = digit;
                    pos = j;
                }
            }
            arr[pos] = 0;
            k--;
        }
        
        System.out.println(String.valueOf(arr));
    }
    
    private static String findCommon(String str, String str1) {
        
        String res = "";
        
        for (int i = 0; i < str.length() && i < str.length() && str1.charAt(i) == str.charAt(i); i++) {
            
            res += str.charAt(i);
        }
        
        return res;
    }
    
}
