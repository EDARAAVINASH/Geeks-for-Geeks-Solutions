//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int tot) {
        Arrays.sort(arr);
        int length=arr.length;
        ArrayList<ArrayList<Integer>> all=new ArrayList<>();
        for(int i=0;i<length;i++)
        {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for(int j=i+1;j<length;j++)
            {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue; 
                int k=j+1,l=length-1;
                int sum=0;
                while(k<l)
                {
                    sum=arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==tot) 
                    {
                        all.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k], arr[l])));
                        while (k < l && arr[k] == arr[k + 1]) k++;
                        while (k < l && arr[l] == arr[l - 1]) l--;
                        l--;k++;
                    }
                    else if(sum>tot)   l--;
                    else k++;
                }
            }
        }
        return all;
    }
}