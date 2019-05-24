package emailapp;

import java.util.Scanner;

public class Email {
private String firstname;
private String lastname;
private String password;
private String department;
private String email;
private int mailboxCapacity=500;
private int defaultPasswordLength=10;
private String alternateEmail;
private String companySuffix = "company.com";
// constructor to receive the firstname and lastname
 public Email(String firstname, String lastname)
 {
	 this.firstname= firstname;
	 this.lastname= lastname;
	 // call a method for asking dept and return the dept
	 this.department= setDepartment();
	 // call a method that returns random password
	  this.password = randomPassword(defaultPasswordLength);
	  System.out.println("Your password is : " + this.password);
	// Combine elements to generate email
	  email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
 }
// Ask for the department
 private String setDepartment()
 {
	 System.out.println("New Employee: " + firstname + ". Department codes\n 1 for sales\n 2 for Development \n 3 for accounting\n 0 for none\n Enter Department code: ");
	 Scanner in = new Scanner(System.in);
	 int depChoice = in.nextInt();
	 if(depChoice == 1) { return "sales";}
	 else if(depChoice == 2) { return "dev";}
	 else if(depChoice == 3) { return "acct";}
	 else { return ""; }
 }

// Generate a random password
private String randomPassword(int length) {
	String passwordSet = "ABCdefghijklmnop$3@qwrts123456789";
	char[] password = new char[length];
	for(int i=0; i<length ; i++){
		int rand =(int)(Math.random()* passwordSet.length());
		password[i] = passwordSet.charAt(rand);
	}
	return new String (password);
}
// set the mailboxcapacity
    public void setMailboxCapacity(int capacity) {
    	this.mailboxCapacity = capacity ;
    }
// Set the alternate email
    public void setAlternateEmail(String altEmail)
    {
    	this.alternateEmail = altEmail ;
    }

// change password
   public void changePassword(String password)
   {
	   this.password = password;
   }
  public int getMailboxCapacity() { return mailboxCapacity; }
  public String getAlternateEmail() { return alternateEmail; }
  public String getPassword() { return password ; }
  
  public String showInfo() {
	  return "DISPLAY NAME: " + firstname + " " + lastname +
			  "\nCOMPANY EMAIL: " + email +
			  "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb" ;
  }
}
