/*Input -----
Choose Health is Excellent or Poor 
excellent
Choose Sex is Male or Female 
Male
Choose Lives in Village or City 
City
Enter age 
20
Expected Output -----
Person is not insured.
*/

import java.util.Scanner;
public class Insurance {
	public static void main(String args[])
	{
		String health,sex,lives;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Health is Excellent or Poor ");
		health = sc.nextLine();
		System.out.println("Choose Sex is Male or Female ");
	    sex = sc.nextLine();
		System.out.println("Choose Lives in Village or City ");
		lives = sc.nextLine();
		System.out.println("Enter age ");
		age = sc.nextInt();
		
		if((health.equalsIgnoreCase("Excellent")) && (sex.equalsIgnoreCase("Male")) && (lives.equalsIgnoreCase("City")) && (age>=25 && age<=35))
		{
			System.out.println("The premium is Rs. 4 per thousand and his policy amount cannot exceed Rs 2 lakhs.");
		}
		else if((health.equalsIgnoreCase("Excellent")) && (sex.equalsIgnoreCase("Female")) && (lives.equalsIgnoreCase("City")) && (age>=25 && age<=35))
		{
			System.out.println("The premium is Rs. 3 per thousand and his policy amount cannot exceed Rs 1 lakhs.");
	    }
		else if((health.equalsIgnoreCase("Poor")) && (sex.equalsIgnoreCase("Male")) && (lives.equalsIgnoreCase("City")) && (age>=25 && age<=35))
		{
			System.out.println("The premium is Rs. 6 per thousand and his policy amount cannot exceed Rs 10,000.");
		}
		else
		{
			System.out.println("Person is not insured.");
					
		}
			
	}
}
