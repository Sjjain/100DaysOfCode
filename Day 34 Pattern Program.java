/* Pattern Program
Input -----
Enter row number.
7

Expected Output -----
7654321
654321
54321
4321
321
21
1
*/

package New2;
import java.util.*;
public class pattern1 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row number.");
		int n=sc.nextInt();
		int i,j;
		for(i=n;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
