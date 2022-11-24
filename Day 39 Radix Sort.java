/* Radix Sort
Input -----
enter array length
6
Enter array elements
3
6
2
9
1
8
Expected Output -----
1 2 3 6 8 9 
*/

package New5;
import java.util.*;
import java.io.*;
class Radix {
		static int getMax(int arr[],int n) {
	        int mx = arr[0];
	        for (int i = 1; i < n; i++)
	            if (arr[i] > mx)
	                mx = arr[i];
	        return mx;
	    }
	 
	   
	    static void countSort(int arr[], int n, int exp)
	    {
	        int output[] = new int[n]; 
	        int i;
	        int count[] = new int[10];
	        Arrays.fill(count, 0);
	 
	       
	        for (i = 0; i < n; i++)
	            count[(arr[i] / exp) % 10]++;
	 
	        
	        for (i = 1; i < 10; i++)
	            count[i] += count[i - 1];
	 
	       
	        for (i = n - 1; i >= 0; i--) {
	            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
	            count[(arr[i] / exp) % 10]--;
	        }
	 
	        
	        for (i = 0; i < n; i++)
	            arr[i] = output[i];
	    }
	 
	 
	    static void radixsort(int arr[], int n)
	    {
	      
	        int m = getMax(arr, n);
	 
	       
	        for (int exp = 1; m / exp > 0; exp *= 10)
	            countSort(arr, n, exp);
	    }
	 
	   
	    static void print(int arr[], int n)
	    {
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	    }
	 
	    
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter array length");
	        int n=sc.nextInt();
	        int i;
	        int arr[]=new int[n];
	        System.out.println("Enter array elements");
	        for(i=0;i<n;i++)
	        arr[i]=sc.nextInt();
	        // Function Call
	        radixsort(arr, n);
	        print(arr, n);
	    }
}
