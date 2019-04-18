import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller!");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		Dice dice=new Dice();
		
		String choice="y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Roll the dice? (y/n): ");
			String rollTheDice=sc.nextLine();
			
			dice.roll();
			dice.displayTheResults();
			
			System.out.println("Continue? y/n");
			sc.next();
		}
	}

}
