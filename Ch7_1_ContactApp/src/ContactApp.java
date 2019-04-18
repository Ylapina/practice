import java.util.Scanner;

public class ContactApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List application");
		System.out.println();
		
		Scanner sc= new Scanner(System.in);
		String choice="y";
		while(choice.equalsIgnoreCase("y")) {
			
			Contact contact=new Contact();
			
			String first = Console.getString("Enter first name: ");
			contact.setFirstName(first);
			String last=Console.getString("Enter last name: ");
			contact.setLastName(last);
			String email=Console.getString("Enter email address: ");
			contact.setEmail(email);
			String phone=Console.getString("Enter phone: " );
			contact.setPhone(phone);
			
			System.out.println(contact.displayContact());
			System.out.println();
			
			choice = Console.getString("Continue? (y/n): ");
            System.out.println();
			
			
		}

	}

}
