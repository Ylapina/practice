import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the App of temperature converter");
		Scanner sc = new Scanner(System.in);
		String choice ="y";
		while(choice.equalsIgnoreCase("y")) {
		
		System.out.println("Enter degrees in Fahrenheit: ");
		double fDegrees= sc.nextDouble();
		double cDegrees=(fDegrees-32)*5/9;
		System.out.println("Degrees in Celsius: "+cDegrees);
		
		
		System.out.println("Continue?");
		choice = sc.next();

	}
	}
}
