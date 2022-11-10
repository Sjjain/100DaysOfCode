/* Inheritance
Output -----
The main method in the Solution class above should print the following:
My superclass is: Arithmetic
42 13 20
*/

package New2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
abstract class Arithmetic{

}

class Adder extends Arithmetic{

Adder(){
    super();
}
int add(int a, int b){
    return a+b;
}
}
class Demos {
	public static void main(String []args){
    Adder a = new Adder();
    
    System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
    System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
 }
}


