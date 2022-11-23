/* Bucket Sort
Input -----
Before sorting array elements are - 
3 2 6 1 9 
Output -----
After sorting array elements are - 
1 2 3 6 9 
*/

package New5;
import java.util.*;
public class Bucket {
	 int getMax(int a[])  
	 {  
	     int n = a.length;  
	     int max = a[0];  
	     for (int i = 1; i < n; i++)  
	     if (a[i] > max)  
	     max = a[i];  
	     return max;  
	 }  
	 void bucket(int a[])   
	 {  
	     int n = a.length;  
	     int max = getMax(a);  
	     int bucket[] = new int[max+1];   
	     for (int i = 0; i <= max; i++)  
	     {  
	         bucket[i] = 0;  
	     }  
	     for (int i = 0; i < n; i++)  
	     {  
	         bucket[a[i]]++;  
	           
	     }  
	     for (int i = 0, j = 0; i <= max; i++)  
	     {  
	         while (bucket[i] > 0)  
	         {  
	             a[j++] = i;  
	             bucket[i]--;  
	         }  
	     }  
	 }  
	 void printArr(int a[])  
	 {  
	     int i;  
	     int n = a.length;  
	     for (i = 0; i < n; i++)  
	     System.out.print(a[i] + " ");  
	 }  
	   
	     public static void main(String[] args) 
	     { 
	    	 Scanner sc=new Scanner(System.in);
	    	 System.out.println("enter array length");
	    	 int n=sc.nextInt();
	    	 int i;
	    	 int a[]=new int[n];
	    	 System.out.println("Enter array elements");
	    	 for(i=0;i<n;i++)
	    	 {
	    		 a[i]=sc.nextInt();
	    	 }
	     Bucket b1 = new Bucket();
	     System.out.print("Before sorting array elements are - \n");  
	     b1.printArr(a);  
	     b1.bucket(a);  
	     System.out.print("\nAfter sorting array elements are - \n");  
	     b1.printArr(a);  
	     }
}
