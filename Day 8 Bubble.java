/* Bubble Sort
input ---
Enter the Value n : 
5
1 6 2 3 5
Expected output ---
1 2 3 5 6
Calculating execution time:
Execution time: 97999 nanoseconds
*/

import java.util.*;
import java.time.*;
public class Bubble {
		 void display() {
			 System.out.println("");
			    System.out.println("Calculating execution time:");
			  }
	public static void BubbleSort(int arr[],int n)
	{
		int temp=0,i,j;
		for(i=0;i<n;i++)
		{
			for(j=1;j<n-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		int num,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value n : ");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		for(i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
	
		BubbleSort(arr,num);
		for(i=0;i<num;i++)
		{
		System.out.print(arr[i]+" ");
	}
		Bubble obj = new Bubble();

	    // get the start time
	    long start = System.nanoTime();

	    // call the method
	    obj.display();

	    // get the end time
	    long end = System.nanoTime();

	    // execution time
	    long execution = end - start;
	    System.out.println("Execution time: " + execution + " nanoseconds");
		
	}
	
	}
