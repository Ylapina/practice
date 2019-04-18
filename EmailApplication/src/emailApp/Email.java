package emailApp;

import java.util.Scanner;

public class Email {
private String firstName;
private String lastName;
private String password;
private String department;
private int mailboxCapacity;
private String alternateEmail;

//Constractor to receive a firstName and lastName
public Email(String firstName, String lastName) {
	this.firstName=firstName;
	this.lastName=lastName;
	System.out.println("Email created: "+ this.firstName+ this.lastName);
	
	//call a method asking for the department - return the department
	this.department=setDepartment();
	System.out.println("Department: "+this.department);
}
//Ask for a department
private String setDepartment() {
	System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter the department code ");
	Scanner in = new Scanner(System.in);
			int departmentChoice=in.nextInt();
	if(departmentChoice==1) {
		return "sales";
	}else if(departmentChoice==2) {
		return "development";
	}else if(departmentChoice==3) {
		return "accounting";
	}else {
		return "";
	}
	
}
//Generate a random password

//set the mailbox Capacity

//set an alternate email

//change the password
}
