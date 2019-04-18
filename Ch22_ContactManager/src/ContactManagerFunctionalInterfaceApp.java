import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ContactManagerFunctionalInterfaceApp {

	public static void main(String[] args) {
		System.out.println("Hello");

		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murack", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murack", "Joel@murach.com", null));

		printContactSummary(contacts);

		List<Contact> cnp = filterContacts(contacts, c -> c.getPhone() == null);
		System.out.println("Contacts without phone..");
		printContactSummary(cnp);

		List<Contact> cne = filterContacts(contacts, c -> c.getEmail() == null);
		System.out.println("Contacts without email..");
		printContactSummary(cne);

	}

	private static void printContactSummary(List<Contact> contacts) {
		System.out.println("List of all contacts");
		for (Contact c : contacts) {
			System.out.println(c);
		}
	}

	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition) {

		List<Contact> filteredContacts = new ArrayList<Contact>();
		for (Contact c : contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

}
