/* Find Cartoons
Input ------
Enter number of boxes to be packed
56

Output -----
48*1=48
6*1=6
Remaining Boxes=2*1=2
Total Number Of Boxes=56
Total Number Of Cartoons=3
*/

package New2;
import java.util.*;
public class Boxes {
	public static void main(String[]args)
	{Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of boxes to be packed");
	int n=sc.nextInt();  // acceptingnumber of boxes to be packed
	int a[]={6,12,24,48};
	int i,d=0,f=0,m=n,c=0;  
	if(n<=1000)             
	{
	while(n>0)                
	{
	for(i=3;i>=0;i--)             
	{
	f=n/a[i];
	d=n%a[i];                    
	if(d!=n)
	{System.out.println(a[i]+"*"+f+"="+(a[i]*f));
	c+=f;                  
	n=d;}
	}
	if(n<a[0])
	break;
	}
	if(n>0)                            
	{System.out.println("Remaining Boxes="+n+"*"+"1="+n);   
	System.out.println("Total Number Of Boxes="+m);
	System.out.println("Total Number Of Cartoons="+(c+1));
	}
	else
	{
	System.out.println("Remaining Boxes="+n);
	System.out.println("Total Number Of Boxes="+m);
	System.out.println("Total Number Of Cartoons="+c);
	}
	}
	else
	{
	System.out.println("Invalid Input");
	}
	}

}
