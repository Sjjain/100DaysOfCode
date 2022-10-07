/* BINARY SEARCH 
input ----
Enter size of the array:
5
Enter elements in the array:
1
2
3
4
5
Entered array is:
1 2 3 4 5 
Enter the value that you want to search: 
4
Expected Output ----
Item is present at index:3
Execution time: 21 seconds
*/
import java.util.*;
public class Binary {
	static int binSearch(int arr[],int target){
        int lo = 0;
        int hi = arr.length-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return -1;
}
    public static void main(String[] args) {
    	// get the start time
	    long start = System.nanoTime();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the value that you want to search: ");
        int target=sc.nextInt();
        int result=binSearch(arr, target);
        if(result==-1){
            System.out.println("Not Present");
        }
        else{
            System.out.println("Item is present at index:"+result);
        }
        sc.close();
        
        // get the end time
	    long end = System.nanoTime();

	    // execution time
	    long execution = (end - start)/1000000000;
	    System.out.println("");
	    System.out.println("Execution time: " + execution + " seconds");
    }
}