//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
	    int min=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }
        }
        return min;
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<n-1;i++)
	    {
	        int j=select(arr,i);
	        swap(arr,i,j);
	    }
	}
	public static void swap(int[] arr,int i,int j)
	{
	    int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}
}