package Day24.AddressBookSystem;

import java.util.Scanner;

public class AddressBook {

	// create a object of Contactperson class
	ContactPerson person = new ContactPerson();
	// create scanner class for take input from console.
	Scanner sc = new Scanner(System.in);

	public ContactPerson createContact() {
		//Taken from user.
		System.out.print("Enter First Name: ");
		person.setFirstName(sc.next());
		System.out.print("Enter Last Name: ");
		person.setLastName(sc.next());
		System.out.print("Enter Address: ");
		person.setAddress(sc.next());
		System.out.print("Enter City: ");
		person.setCity(sc.next());
		System.out.print("Enter State: ");
		person.setState(sc.next());
		System.out.print("Enter email: ");
		person.setEmail(sc.next());
		System.out.print("Enter ZipCode: ");
		person.setZipCode(sc.nextInt());
		System.out.print("Enter Phone Number: ");
		person.setPhoneNumber(sc.next());
		System.out.println("created new contact");
		return person;
	}
	public void addContact() {
		ContactPerson contactPerson = createContact();
        System.out.println(contactPerson);
        System.out.println("Contact added successfully");
    }

	// main mathod
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program");
		System.out.println("--------------------------");
		System.out.println("Contact created in address book is: ");
		AddressBook addressBook = new AddressBook();
		addressBook.createContact();

	}
}
