package basics;

public class Days {
	public static void main (String[] args) {
		// Execute different block of code based upon value of condition
		String dayOfWeek="Tuesday";
		
		switch(dayOfWeek) {
		case "Monday":
			System.out.print("Today is Monday\n");
			break;
		case "Tuesday":
			System.out.print("Today is Tuesday\n");
			break;
		case "Wednesday":
			System.out.print("Today is Wednesday\n");
			break;
		case "Thursday":
			System.out.print("Today is Thursday\n");
			break;
		case "Friday":
			System.out.print("Today is Friday\n");
			break;
		}
	}
}
