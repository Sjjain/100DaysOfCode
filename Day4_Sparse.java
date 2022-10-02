package New2;
import java.util.*;
class Sparse {
	public static void main(String args[])
	{
	int rows,cols,count=0;
	int i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the row size :");
	int row = sc.nextInt();
	System.out.println("Enter the column size :");
	int col = sc.nextInt();
	System.out.println();
	
	
    int Smatrix[][]= new int[row][col];
    
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
        	Smatrix[i][j] = sc.nextInt(); 
        }
        System.out.println();
    }
    
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
        	System.out.print(Smatrix[i][j]+ " "); 
        }
        System.out.println();
    }
    
    
    rows = Smatrix.length;
    cols = Smatrix[0].length;
    
    for(i=0;i<rows;i++)
    {
        for(j=0;j<cols;j++)
        {
            if(Smatrix[i][j] == 0)
            {
                count++;
            }
        }
    }
    
    if(count>(rows*cols)/2)
    {
        System.out.println("Sparse Matrix");
    }
    else
    {
        System.out.println("Not Sparse Matrix");
    }
  }
}




