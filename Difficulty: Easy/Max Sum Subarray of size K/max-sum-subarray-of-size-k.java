//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N)
    {
        int c=0,l=0,r=0;
        long max1=Long.MIN_VALUE,sum=0;
        while(r<N)
        {
            sum=sum+Arr.get(r);
            if(r-l+1==K) 
            {
                max1=Math.max(max1,sum);
                sum=sum-Arr.get(l);
                l++;
            }
            r++;
        }
        return max1;
    }
}