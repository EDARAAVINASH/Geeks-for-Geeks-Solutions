//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
        StringBuilder sb=new StringBuilder();
        int l1=S1.length();
        int l2=S2.length();
        int mini=Math.min(l1,l2);
        for(int i=0;i<mini;i++)
        {
            sb.append(S1.charAt(i));
            sb.append(S2.charAt(i));
        }
        if(l1<l2)
        {
            sb.append(S2.substring(mini));
        }
        else
        {
            sb.append(S1.substring(mini));
        }
        return sb.toString();
    }
} 