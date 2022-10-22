/* Selection Sort
Input -----
Before sorting array elements are - 
91 49 4 19 10 21 
Expecting Output -----
After sorting array elements are - 
4 10 19 21 49 91 
*/

package New2;
import java.util.*;
public class Selection 
{
	 void selection(int a[])  
	 {  
	     int i, j, small;  
	     int n = a.length;  
	     for (i = 0; i < n-1; i++)  
	     {  
	         small = i; //minimum element in unsorted array  
	           
	         for (j = i+1; j < n; j++)  
	         if (a[j] < a[small])  
	             small = j;  
	   
	     int temp = a[small];  
	     a[small] = a[i];  
	     a[i] = temp;  
	     }  
	   
	 }  
	 void printArr(int a[])  
	 {  
	     int i;  
	     int n = a.length;  
	     for (i = 0; i < n; i++)  
	     System.out.print(a[i] + " ");  
	 }  
	   
	     public static void main(String[] args) {  
	     int a[] = { 91, 49, 4, 19, 10, 21 };  
	     Selection i1 = new Selection();  
	     System.out.println("\nBefore sorting array elements are - ");  
	     i1.printArr(a);  
	     i1.selection(a);  
	     System.out.println("\nAfter sorting array elements are - ");  
	     i1.printArr(a);  
	     System.out.println();  
	 }  

}
