/* Pattern Program
Input -----
123456789
1234 6789
123   789
12     89
1       9
Expected Output -----
123456789
1234 6789
123   789
12     89
1       9
*/

package New2;
import java.util.*;
public class PatternProblem {
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(j<=6-i || j>=4+i){
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
						
			
				
			}
			System.out.println("");
		}
	}
}

