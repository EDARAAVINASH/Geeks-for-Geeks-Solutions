//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        int count=0,max_repeat=0;
        for(int i:a)
        {
            if(count==0)
            {
                max_repeat=i;
            }
            if(i==max_repeat)
            {
                count++;
            }
            if(i!=max_repeat)
            {
                count--;
            }
        }
        int max_count=0;
        for(int i:a)
        {
            if(i==max_repeat)
            {
                max_count++;
            }
        }
        if(max_count>size/2) return max_repeat;
        return -1;
    }
}