//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) 
    {
        int count=0;
        Set<Integer> set=new HashSet<>();
        for(int i:arr)
        {
            set.add(i);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(set.contains(arr[i]+arr[j]))
                {
                    count++;
                }
            }
        }
        return count;
    }
}