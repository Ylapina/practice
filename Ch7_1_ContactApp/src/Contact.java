
public class Contact {
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String displayContact() {
        String contact = "--------------------------------------------\n";
        contact += "---- Current Contact -----------------------\n";
        contact += "--------------------------------------------\n";
        contact += "Name:           " + firstName + " " + lastName + "\n";
        contact += "Email Address:  " + email + "\n";
        contact += "Phone Number:   " + phone + "\n";
        contact += "--------------------------------------------\n";
        return contact; 

	}
}
