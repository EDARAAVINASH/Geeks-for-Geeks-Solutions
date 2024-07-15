//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int longestSubstrDistinctChars(String S)
    {
        int[] arr=new int[256];
        Arrays.fill(arr,-1);
        int l=0,r=0,n=S.length(),max=0;
        while(r<n)
        {
            char c=S.charAt(r);
            if(arr[c]!=-1)
            {
                l=Math.max(l,arr[c]+1);
            }
            arr[c]=r;
            max=Math.max(r-l+1,max);
            r++;
        }
        return max;
    }
}