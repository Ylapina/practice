import java.util.ArrayList;
import java.util.List;

public class ContactManagerOldSchool {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murack",null,"800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murack","Joel@murach.com", null));
		
		printContactSummary(contacts);
			
			List<Contact> cnp=filterContactsWithoutPhone(contacts);
			System.out.println("Contacts without phone..");
			printContactSummary(cnp);
			
			List<Contact> cne=filterContactsWithoutEmail(contacts);
			System.out.println("Contacts without email..");
			printContactSummary(cne);
		
		}
	private static void printContactSummary(List<Contact> contacts) {
		System.out.println("List of all contacts");
		for(Contact c: contacts) {
			System.out.println(c);
		}
	}
		
		
		
		

	
	
	
	
	private static List<Contact> filterContactsWithoutPhone(List<Contact> contacts){
		System.out.println();
		List<Contact> contactsNoPhone= new ArrayList<Contact>();
		for(Contact c: contacts) {
			if(c.getPhone()==null) {
				contactsNoPhone.add(c);
			}
		}
		return contactsNoPhone;
	}
	private static List<Contact> filterContactsWithoutEmail(List<Contact> contacts){
		System.out.println();
		List<Contact> contactsNoEmail= new ArrayList<Contact>();
		for(Contact c: contacts) {
			if(c.getPhone()==null) {
				contactsNoEmail.add(c);
			}
		}
		return contactsNoEmail;
	}

}
