import java.util.Scanner;

public class ContactApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List application");
		System.out.println();
		
		Scanner sc= new Scanner(System.in);
		String choice="y";
		while(choice.equalsIgnoreCase("y")) {
			Contact contact=new Contact();
			
			String firstName=Console.getString("Enter first name: ");
			contact.setFirstName(firstName);
			String lastName=Console.getString("Enter last name: ");
			contact.setLastName(lastName);
			String email=Console.getString("Enter email: ");
			contact.setEmail(email);
			String phone=Console.getString("Enter phone: ");
			contact.setPhone(phone);
			System.out.println(contact.displayContact());
			
		}

	}

}
