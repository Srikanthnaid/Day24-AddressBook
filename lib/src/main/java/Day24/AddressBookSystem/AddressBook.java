package Day24.AddressBookSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	// create list.
	List<ContactPerson> list = new ArrayList<>();

	// create a object of Contactperson class
	ContactPerson person = new ContactPerson();
	// create scanner class for take input from console.
	Scanner sc = new Scanner(System.in);

	public ContactPerson createContact() {
		// Taken from user.
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
		// add to list
		list.add(person);
		System.out.println("Contact added successfully");
	}

	// Edit contact is Existing in addressbook.
	public void editContact() {

		System.out.print("Enter First Name:");
		String editName = sc.next();
		boolean edited = false;
		boolean result = list.stream().anyMatch(a -> list.contains(editName) == equals(list));
		System.out.println(result);// true
		// Check name == editName.
		if (result == true) {
			System.out.println("Name is Match  \nnow Edit contact");
			System.out.println(
					"FirstName match  \n choose which one you want to change  \n Enter 1 to change firatName  \nEnter 2 to change LastName  \nEnter 3 to change address  \nEnter 4 to change city  \nEnter 5 to change state  \nEnter 6 to change ZipCode  \nEnter 7 to change MobNumber  \nEnter 8 to change E-Mail Address");
			int input = sc.nextInt();
			switch (input) {
			case 1 -> {
				System.out.print("Enter firstname: ");
				person.setFirstName(sc.next());
				break;
			}
			case 2 -> {
				System.out.print("Enter lastname: ");
				person.setLastName(sc.next());
				break;
			}
			case 3 -> {
				System.out.print("Enter Address: ");
				person.setAddress(sc.next());
				break;
			}
			case 4 -> {
				System.out.print("Enter City: ");
				person.setCity(sc.next());
				break;
			}
			case 5 -> {
				System.out.print("Enter State: ");
				person.setState(sc.next());
				break;
			}
			case 6 -> {
				System.out.print("Enter ZipCode: ");
				person.setZipCode(sc.nextInt());
				break;
			}
			case 7 -> {
				System.out.print("Enter PhoneNumber: ");
				person.setPhoneNumber(sc.next());
				break;
			}
			case 8 -> {
				System.out.print("Enter E-Mail Address: ");
				person.setEmail(sc.next());
				break;
			}
			}

			edited = true;
		}

		if (!edited) {
			System.out.println("This name does not exist");
		}
		list.stream().forEach(a -> System.out.println(a));
	}

	// main mathod
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program");
		System.out.println("--------------------------");
		System.out.println("Contact created in address book is: ");
		AddressBook book = new AddressBook();
		book.addContact();// call add contact method
		book.editContact();// call edit contact method to edit a contact in addressbook

	}
}
