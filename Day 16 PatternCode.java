/* Pattern Problems
Input -----
Enter the values of rows :
5
12345
 2345
  345
   45
    5
   45
  345
 2345
12345
Expected Output -----
12345
 2345
  345
   45
    5
   45
  345
 2345
12345
*/

package New2;
import java.util.*;
public class PatternCode {
	public static void main(String[] args)   
	{  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values of rows :");
	int rows = sc.nextInt();
	  
	for (int i = 1; i <= rows; i++)   
	{  
	  for (int j = 1; j < i; j++)   
	  {  
		  System.out.print(" ");  
	   }  
	 
	for (int j = i; j <= rows; j++)   
	{   
		System.out.print(j);   
		}   
		System.out.println();   
	}   
	  
	for (int i = rows-1; i >= 1; i--)   
	{  
		for (int j = 1; j < i; j++)   
		{  
			System.out.print(" ");  
		}  
	 
	for (int j = i; j <= rows; j++)  
	{  
		System.out.print(j);  
		}  
		System.out.println();  
	}  
  }  
}
