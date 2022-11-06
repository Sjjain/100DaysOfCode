/* Exception Handling
Input -----
10
Hello
Expected Output -----
java.util.InputMismatchException
Input -----
10
0
Expected Output -----
java.lang.ArithmeticException: / by zero
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	    try
	    {
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        int c=(x/y);
	        System.out.println(c);

	    }catch(ArithmeticException e)
	    {
	        System.out.println("java.lang.ArithmeticException: / by zero");
	    }
	    catch(InputMismatchException e)
	    {
	        System.out.println("java.util.InputMismatchException");
	    }

	}
	        

}
