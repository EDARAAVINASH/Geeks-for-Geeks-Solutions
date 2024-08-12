//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         int[] arr1=new int[r-l+1];
         int left=l,right=m+1,i=0;
         while(left<=m && right<=r)
         {
             if(arr[left]<arr[right])
             {
                 arr1[i++]=arr[left++];
             }
             else
             {
                 arr1[i++]=arr[right++];
             }
         }
         while(left<=m)
         {
             arr1[i++]=arr[left++];
         }
         while(right<=r)
         {
             arr1[i++]=arr[right++];
         }
         for(int k=0;k<arr1.length;k++)
         {
             arr[k+l]=arr1[k];
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(r<=l) return;
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
