//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str[] = br.readLine().trim().split(" ");

            int n = Integer.parseInt(str[0]);
            int s = Integer.parseInt(str[1]);

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(arr, n, s);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int j = 0;                 // first pointer 
        int i = 0;                 // second pointer
        while( i < n ){
            sum += arr[i];    // adding and storing values in sum from array one by one
            while( sum > s && j < i ){

             // removing previous values from sum when it exceeds the given s value
                sum -= arr[j];    
                j++;
            }
            if( sum == s ){
                list.add( j + 1 );   // adding first index of subarray whose sum is equal to s
                list.add( i + 1 );   // adding last index of subarray whose sum is equal to s
                return list;       // returning list of first and last indexes
            }
            i++;
        }

        // adding -1 to list
        list.add(-1);

        // if given array doesn't contains any subarray whose sum is equal to s then return -1
        return list;   
    }
}
