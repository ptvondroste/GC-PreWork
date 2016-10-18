import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class PeriodCalc1 {
// Simple code calculates the duration between two dates
	
		public static void main(String[] args) {
			//Author P.Droste
			//Caution code is dependent on the user to follow suggested date format
			Scanner Date1 = new Scanner(System.in);
			System.out.println("Enter Beginning Date: YYYY-MM-DD: ");
			String inputDate1 = Date1.next();
			
			Scanner Date2 = new Scanner(System.in);
			System.out.println("Enter Ending Date: YYYY-MM-DD: ");
			String inputDate2 = Date2.next();
			
			LocalDate input1 = LocalDate.parse(inputDate1);
			LocalDate input2 = LocalDate.parse(inputDate2);
			
			//Java taking the difference between the two inputs	using Java Class Period		
			Period p = Period.between(input1,  input2);
						
			System.out.println("Duration is: " +p.getYears() + " Years " + p.getMonths() + " months " +p.getDays() + " days");
			
		}
}
