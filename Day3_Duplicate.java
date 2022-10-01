import java.util.*;
public class Duplicate {
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
		for (int i = 0; i < arr.length; i++) {
		     for (int j = i + 1 ; j < arr.length; j++) {
		          if (arr[i]==(arr[j]) && (i != j)) 
		          {
		        	  System.out.println("Duplicate Value :"+arr[j]);      
		          }
		     } 
		 }
		 System.out.println("No Duplicate Value");
	}
}
