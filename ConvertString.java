
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

        String x = in.next();
        String y = in.next();

        int i = 0, j = 0 , cnt = 0;

        for (; i < x.length() && j < y.length(); i++, j++) {
            
            if(x.charAt(i) != y.charAt(j)) cnt++;
        }
        
        cnt += x.length() - i;
        cnt += y.length() - j;
        
        System.out.println(cnt);
    }

    private static String findCommon(String str, String str1) {

        String res = "";

        for (int i = 0; i < str.length() && i < str.length() && str1.charAt(i) == str.charAt(i); i++) {

            res += str.charAt(i);
        }

        return res;
    }

}
