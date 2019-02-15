
import java.util.*;
import java.io.*;


class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        long n = in.nextLong();
        
        int a = in.nextInt();
        
        int b = in.nextInt();
        
        if((n/2)%(a+b) == 0 || (a == b && n%a == 0)){
        
            System.out.println("YES");
        }
        else{
        
            System.out.println("NO");
        }
    }
}
