import java.time.LocalDate;
import java.util.Scanner;
public class ques2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a date (yyyy-mm-dd): ");
		String input = sc.nextLine();
		LocalDate date = LocalDate.parse(input);
		System.out.println("Original Date: " + date);
		LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
		System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate);
		LocalDate finalDate = modifiedDate.minusWeeks(3);
		System.out.println("After subtracting 3 weeks: " + finalDate);
		sc.close();
	}

}

