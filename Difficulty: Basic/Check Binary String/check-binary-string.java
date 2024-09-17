//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            if (new Sol().checkBinary (s))
    		    System.out.println ("VALID");
    		else
    		    System.out.println ("INVALID");
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean checkBinary (String s)
    {
        int index1=s.indexOf('1');
        int index2=s.lastIndexOf('1');
        while(index1<index2)
        {
            char c=s.charAt(index1);
            if(c=='0')
            {
                return false;
            }
            index1++;
        }
        return true;
    }
}
