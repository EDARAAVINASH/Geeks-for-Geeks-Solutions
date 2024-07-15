//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) 
    {
        long pref=1,suff=1,res=Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(pref==0) pref=1;
            if(suff==0) suff=1;
            pref=pref*arr[i];
            suff=suff*arr[n-i-1];
            res=Math.max(res,Math.max(pref,suff));
        }
        return res;
    }
}