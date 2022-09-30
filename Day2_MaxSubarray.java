//Find maximum subArray

import java.util.*;
public class Day2_MaxSubarray {
	void array(int arr[],int n)
	{
		int i;
		int currentvalue = 0;
		int maximum = 0;
		for(i=0;i<arr.length;i++)
		{
			currentvalue = currentvalue + arr[i];
			if(currentvalue > 0)
			{
				maximum = currentvalue;
			}
			if(currentvalue < 0)
			{
				currentvalue = 0;
			}
		}
		System.out.println("Maximum SubArray :"+maximum);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		MaxSubarray ans = new MaxSubarray();
		ans.array(arr,size);
		
	}

}
