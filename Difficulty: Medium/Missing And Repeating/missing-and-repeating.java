//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int xor=0;
        for(int x:arr)
        {
            xor=xor^x;
        }
        for(int i=1;i<=n;i++)
        {
            xor=xor^i;
        }
        int rmsb=xor & -xor;
        int y=0,z=0;
        for(int x:arr)
        {
            if((x&rmsb)==0)
            {
                z=z^x;
            }
            else
            {
                y=y^x;
            }
        }
        for(int i=1;i<=n;i++)
        {
            if((i&rmsb)==0)
            {
                z=z^i;
            }
            else
            {
                y=y^i;
            }
        }
        for (int num : arr) {
            if (num == z) {
                return new int[] {z,y};
            }
        }
        
        return new int[] {y,z};
    }
}