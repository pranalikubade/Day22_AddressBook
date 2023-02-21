package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
    static Scanner sc = new Scanner(System.in);

    List<Contact> allContacts = new ArrayList<>();

    void addAddress() {
        Contact newContact = new Contact();

        System.out.println("Enter Name");
        newContact.setName(sc.next());

        System.out.println("Enter Age");
        newContact.setAge(sc.next());

        System.out.println("Enter Phone No");
        newContact.setPhoneNumber(sc.next());

        System.out.println("Enter City");
        newContact.setCity(sc.next());

        System.out.println("Enter State");
        newContact.setState(sc.next());

        allContacts.add(newContact);
        System.out.println("Contact created successfully. Total contact present in the current adressbook = " + allContacts.size());
    }

    @Override
    public String toString() {
        return "All the contact details of this AddressBook :-" + "[\n" + allContacts + "\n]";
    }

}
