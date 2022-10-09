/* Linear Search
Input----
Enter the Value n 
5
Enter the array Values 
3
6
2
5
9
Enter the key value 
5
Expected Output ----
true
Execution time: 12 seconds
*/
import java.util.*;
public class Linear {
	public static boolean LinearSearch(int arr[],int key,int n)
	{
		int i=0;
		while(i<n && arr[i]!=key)
		{
			i++;
		}
		if(i<n)
		{
			
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		// get the start time
	    long start = System.nanoTime();
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value n ");
		int num = sc.nextInt();
		
		System.out.println("Enter the array Values ");
		int a[] = new int[num];
		for(i=0;i<num;i++)
		{
			a[i] = sc.nextInt();
			
		}
		
		System.out.println("Enter the key value ");
		int key = sc.nextInt();
		System.out.println(LinearSearch(a,key,num));
		
		// get the end time
	    long end = System.nanoTime();

	    // execution time
	    long execution = (end - start)/1000000000;
	    System.out.println("");
	    System.out.println("Execution time: " + execution + " seconds");
		
		}
	}


