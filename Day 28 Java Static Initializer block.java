/* Java Static Initializer Block
Input -----
1
3
Expected output -----
3
Input -----
-1
2
Expected output -----
java.lang.Exception: Breadth and height must be positive
*/

package New2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Demo {
	private static int B,H;
	private static boolean flag;

	static Scanner sc =new Scanner(System.in);

	static {
	    B = sc.nextInt();
	    H = sc.nextInt();
	    try{
	        if ( B<=0 || H<=0) throw new Exception("Breadth and height must be positive");
	        flag=true;
	    }
	    catch (Exception e){
	        flag=false;
	        System.out.println(e.toString());
	    }
	}
	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}


}
