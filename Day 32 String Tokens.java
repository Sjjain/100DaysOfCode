/* Java String Tokens

Input -----
He is a very very good boy, isn't he?

Expected Output -----
10
He
is
a
very
very
good
boy
isn
t
he
*/

import java.io.*;
import java.util.*;

public class sol {

   public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            int i;
            if(!s.trim().isEmpty()){
            String delim=("[ !,?._'@]+");
            String[] a=s.trim().split(delim);
            System.out.println(a.length);
            for(i=0;i<a.length;i++)
            {
                    System.out.println(a[i]);
            }  
            }
            else{
                System.out.println(0);
            }
            // Write your code here.
           
        }
}


