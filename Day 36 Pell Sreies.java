/* Pell Series 
Expected Output -----
The first 15 Series are: 
0 1 2 5 12 29 70 169 408 985 2378 5741 13860 33461 80782 
*/

package New5;
import java.util.*;
public class Sreies {
	public static void main(String argvs[])
	 {
	   int t1 = 0, t2 = 1; // the first two terms
	   int Terms = 15;
	   System.out.print("The first " + Terms + " Series are: \n");
	   for(int i = 1; i <=Terms; i++)
	         {
	                if( i == 1) 
	                 {
	                       System.out.print(t1 + " ");
	                 }
	                else if(i == 2) 
	                 {
	                       System.out.print(t2 + " ");
	                 }
	                else 
	                 {
	                       int t3 = t1 + t2 * 2;
	                       System.out.print(t3 + " ");
	                       t1 = t2;
	                       t2 = t3;
	                 }
	            }
	 	}
}
