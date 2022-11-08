/* Java SubArray
Output Format -----
Print the number of subarrays of  having negative sums.

Sample Input -----
5
1 -2 4 -5 1

Sample Output ------
9



package New2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray {

    public static void main(String[] args) 
    {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();int h=2,a=0,sum=0 ,c=0 ,d=n-1;
    int arr[] =new int[n];
    int b[]=new int[(int)Math.pow(2,n)-1];
    for (int i = 0; i < arr.length; i++) 
    {
        arr[i]=sc.nextInt();
    }
    while(h<=n)
    {
    for(int j=0;j<d;j++)
    {    a=0;   
    for(int i=0;i<h;i++)
    {
     sum=sum+arr[a];
    } c++;  d--;
        }
    h++;
    }c+=arr.length;System.out.println(c);
}
}
