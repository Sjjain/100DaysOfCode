/* ZEROES & ONES PATTERN PROGRAMS
Input -----
Enter the number of rows: 
5
1
10
101
1010
10101
Output -----
1
10
101
1010
10101
*/

package New2;
import java.util.*;
public class PatternTriangles {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				if(j%2 == 0)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}

			System.out.println();
		}
		//sc.close();
	}
}
