//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            List<Integer> brr = new ArrayList<>();
            List<Integer> crr = new ArrayList<>();

            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }

            String input2 = sc.nextLine();
            Scanner ss2 = new Scanner(input2);
            while (ss2.hasNextInt()) {
                brr.add(ss2.nextInt());
            }

            String input3 = sc.nextLine();
            Scanner ss3 = new Scanner(input3);
            while (ss3.hasNextInt()) {
                crr.add(ss3.nextInt());
            }

            Solution ob = new Solution();
            List<Integer> res = ob.commonElements(arr, brr, crr);

            if (res.size() == 0) System.out.print(-1);
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) 
    {
        int i=0,j=0,k=0;
        List<Integer> common=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size() && k<arr3.size())
        {
            int a=arr1.get(i),b=arr2.get(j),c=arr3.get(k);
            if(a==b && b==c)
            {
                common.add(a);
                while(i<arr1.size() && arr1.get(i)==a) i++;
                while(j<arr2.size() && arr2.get(j)==b) j++;
                while(k<arr3.size() && arr3.get(k)==c) k++;
            }
            else if(a<b) i++;
            else if(b<c) j++;
            else k++;
        }
        return common;
    }
}