//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        int idx=-1;
        for(int i=N-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
            rev(arr,0,N-1);
        }
        else
        {
            for(int i=N-1;i>=0;i--)
            {
                if(arr[i]>arr[idx])
                {
                    swap(arr,i,idx);
                    break;
                }
            }
            rev(arr,idx+1,N-1);
        }
        List<Integer> al = new ArrayList<>();
        for (int num : arr) {
            al.add(num);
        }
        return al;
    }
    public static void rev(int[] arr,int low,int high)
    {
        while(low<high)
        {
            int temp=arr[low];
            arr[low++]=arr[high];
            arr[high--]=temp;
        }
    }
    public static void swap(int[] arr,int low,int high)
    {
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
}