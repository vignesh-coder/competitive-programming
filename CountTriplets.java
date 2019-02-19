
import java.util.*;
import java.io.*;

class Solution {

    private static int cnt = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];
        
        for(int i =0;i<n;i++)
            arr[i] = in.nextInt();
        
        for(int i=0;i<n;i++){
        
            for(int j=i+1;j<n;j++){
            
                for(int k=j+1;k<n;k++){
                
                    
                    if(arr[i]<arr[j] && arr[j]<arr[k]){
                    
                        cnt++;
                    }
                }
            }
        }
        
        System.out.println(cnt);
    }
}
