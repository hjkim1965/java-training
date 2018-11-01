package basics;

public class Weather {
	public static void main(String[] args) {
		//This program will give suggestions on what to wear based upon weather (specially temperature) and sun condition
	
		
		//int temperature = 65;
		int temperature = 45;
		//String sunCondition = "Sunny";
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.print("It is pleasant. Wear shorts and T-shirt\n");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")){
			System.out.print("It is a little cooler. Perhaps wear a long-sleeve shirt and jeans\n");
			System.out.print("Wear a hat to keep the sun out of your eyes\n");
		}
		else if ((temperature > 50) && (sunCondition == "Overcast")) {
			System.out.print("This is a cool day and overcast.  Make sure to wear warmer clothes and bring an umbrella.\n");
		}
		else {
			System.out.print("Looks like a cold day.  Bring a sweater.\n");
		}
	}
}
