
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

        int DP[][] = new int[x.length() + 1][y.length() + 1];

        for (int i = 1; i <= x.length(); i++) {

            for (int j = 1; j <= y.length(); j++) {

                if (i > j) {

                    //int update = DP[i][j - 1] + Math.abs((x.charAt(i - 1) - 'a') - (y.charAt(j - 1) - 'a'));

                    int delete = DP[i - 1][j] + (x.charAt(i - 1) - 'a' + 1);

                    DP[i][j] = delete;
                    
                    //System.out.print("d:"+DP[i][j]+" ");
                    
                } else if (i < j) {

                    //int update = DP[i - 1][j] + Math.abs((x.charAt(i - 1) - 'a') - (y.charAt(j - 1) - 'a'));
                    int add = DP[i][j - 1] + (y.charAt(j - 1) - 'a' + 1);

                    DP[i][j] = add;
                    
                    //System.out.print("a:"+DP[i][j]+" ");
                    
                } else {
                    
                    int update = DP[i - 1][j - 1] + Math.abs((x.charAt(i - 1) - 'a') - (y.charAt(j - 1) - 'a'));
                    
                    DP[i][j] = update;
                    
                    //System.out.print("u:"+DP[i][j]+" ");
                }

                

            }
            //System.out.println();
        }

        System.out.println(DP[x.length()][y.length()]);
    }

    private static String findCommon(String str, String str1) {

        String res = "";

        for (int i = 0; i < str.length() && i < str.length() && str1.charAt(i) == str.charAt(i); i++) {

            res += str.charAt(i);
        }

        return res;
    }

}
