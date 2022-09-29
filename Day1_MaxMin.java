//Find maximum and Minimum values

import java.util.*;
public class Day1_MaxMin {
	int max,i,min;
	void Max(int arr[],int n)
	{
		max = arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("Max value is :"+max);
	}
	
	void Min(int arr[],int n)
	{
		min = arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("Max value is :"+min);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of values :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array values :");
		for(int i=0;i<arr.length;i++)
		{
		   arr[i] = sc.nextInt();	
		}
		MaxMin m = new MaxMin();
		m.Max(arr,n);
		m.Min(arr,n);
	}

}
