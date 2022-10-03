//CHOCOLATE DISTRIBUTION

package New2;
import java.util.*;
public class Chocolates {
	 public static int chocolatesFinder(int[] arr, int size, int m)
	    {
	        int answer = Integer.MAX_VALUE;
	        Arrays.sort(arr);
	        
	        for (int i=0; i<=size-m; i++)
	        {
	            int minimum = arr[i];
	            int maximum = arr[i+m-1];
	            int gap = maximum- minimum ;
	            
	            if(gap < answer)
	            {
	                answer = gap;
	            }
	        }
	        return answer;
	    }
	    public static void main(String[] args) 
	    {
	      int[] arr = {3,4,1,9,56,7,9,12};
	      int m = 5;
	      int size = arr.length; 
	      System.out.println(chocolatesFinder(arr, size, m));
	    } 

}
