import java.util.Scanner;

public class OddEvenApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Odd/Even Checker!");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String choice="y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer: ");
			int num=sc.nextInt();
			//determine where the number is odd or even
			String oddOrEven="odd";
            if (num % 2 == 0) {
                oddOrEven = "even";
            }
			
            System.out.println("The number"+num+" is"+oddOrEven);
            
            System.out.println("Continue? y/n");
            choice=sc.next();
			
		}

	}

}