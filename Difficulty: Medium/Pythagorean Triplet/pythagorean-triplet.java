//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) 
    {
       HashMap<Integer, Integer> squareMap = new HashMap<>();

        // Populate the squareMap with the squares of elements.
        for (int i = 0; i < n; i++) {
            int square = arr[i] * arr[i];
            squareMap.put(square, arr[i]);
        }

        // Iterate through the squareMap to find triplets with the sum of squares.
        for (int square1 : squareMap.keySet()) {
            for (int square2 : squareMap.keySet()) {
                // Calculate the sum of two squared values.
                int sumOfSquares = square1 + square2;

                // Check if the sum exists in the squareMap, indicating the presence of a triplet.
                if (squareMap.containsKey(sumOfSquares)) {
                    return true;
                }
            }
        }

        // If no triplet is found, return false.
        return false;
    }
}