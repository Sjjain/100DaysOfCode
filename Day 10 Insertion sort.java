/* Insertion Sort
Input :----
Enter the Value n : 
5
Enter the array values : 
2
6
5
1
3
Expected Output :----
Sorted elements : 
1 2 3 5 6 
Execution time: 8 seconds
*/

import java.util.*;
import java.time.*;
public class Insert {
	public static void InsertionSort(int arr[],int n)
	{
		int i,j,key;
		for(j=1;j<n;j++)
		{
			key = arr[j];
			i = j-1;
			while(i>=0 && key<arr[i])
			{
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
	}
	public static void main(String args[])
	{
		// get the start time
	    long start = System.nanoTime();
		int num,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value n : ");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.println("Enter the array values : ");
		for(j=0;j<num;j++)
		{
			arr[j] = sc.nextInt();
			
		}
		InsertionSort(arr,num);
		System.out.println("Sorted elements : ");
		for(j=0;j<num;j++)
		{
		System.out.print(+arr[j]+" ");
	}
		// get the end time
	    long end = System.nanoTime();

	    // execution time
	    long execution = (end - start)/1000000000;
	    System.out.println("");
	    System.out.println("Execution time: " + execution + " seconds");
	}
	
	}



