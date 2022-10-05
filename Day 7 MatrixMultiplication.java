/* multiplication of matrix 

input: 
Enter the Row1 value  :
2
Enter the Column1 value  :
2
Enter values of first matrix  :
 1 1
 1 1
Enter the Row2 value  :
2
Enter the Column2 value  :
2
Enter values of Second matrix  :
1 1
1 1

expected output:
Product of matrix 
2 2 
2 2 
*/

package New2;
import java.util.*;
public class MatrixMulti {
	public static void main(String args[])
	{
	int i,j,k,c1,c2,r1,r2,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Row1 value  :");
	r1 = sc.nextInt();
	System.out.println("Enter the Column1 value  :");
	c1 = sc.nextInt();
	
	int arr1[][] = new int[r1][c1];
	System.out.println("Enter values of first matrix  :");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			arr1[i][j] = sc.nextInt();
		}
	}
	System.out.println("Enter the Row2 value  :");
	r2 = sc.nextInt();
	System.out.println("Enter the Column2 value  :");
	c2 = sc.nextInt();
	System.out.println("Enter values of Second matrix  :");
	
	if(c1 != r2)
	{
		System.out.println("Matrix Mulltiplication is nort possible");
	}
	else 
	{
		int arr2[][] = new int[r2][c2];
		int arr3[][] = new int[r1][c2];
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}
	
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{	arr3[i][j]=0;
				for(k=0;k<r2;k++)
				{
					arr3[i][j]+= arr1[i][k]*arr2[k][i];
							
				}
			}
					
			}
			System.out.println("Product of matrix ");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
	               System.out.print(arr3[i][j] +" ");
	 
	            
	         }
				System.out.println();
	      }
		}
	}
	}


	
		

