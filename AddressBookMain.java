package com.bridgelabz;
import java.util.HashMap;
import java.util.Scanner;
public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    static HashMap<String, AddressBook> allAddressBook = new HashMap<>();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            isEmptyAllAddressBook();
            System.out.println("\n" + "************* Main Menu *************");
            System.out.println("1.Add New AddressBook" + "     " + "2.AddContacts" + "     " + "3.Show AddressBook details");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createAddressBook();
                    break;
                case 2:
                    System.out.println("How many contacts do you want to add : ");
                    int num = sc.nextInt();
                    if(num <= 0)
                        System.out.println("Invalid Input!!!");
                    else {
                        System.out.println("Enter the name of the Adressbook in which you want to add contacts : ");
                        String addressBookName = sc.next();
                        if(checkAddressBookPresent(addressBookName)) {
                            for(int i = 0; i< num; i++) {
                                addContact(addressBookName);
                            }
                        }else {
                            System.out.println("No AdressBook present with name " + addressBookName + ". Below Adressbooks present currently: ");
                            System.out.println(allAddressBook.keySet());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the name of the AddressBook which you want to show: ");
                    String addressBookName2 = sc.next();
                    System.out.println(allAddressBook.get(addressBookName2));
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }

    }

    private static void isEmptyAllAddressBook() {
        if (allAddressBook.size() == 0) {
            System.out.println("There is no AddressBook present till now. Please add an AddressBook now to start.");
            createAddressBook();
        }
    }

    private static void addContact(String bookName) {
        AddressBook addressBook = allAddressBook.get(bookName);
        addressBook.addAddress();
    }

    private static void createAddressBook() {
        System.out.println("Enter the name of the AddressBook : ");
        String name = sc.next();
        allAddressBook.put(name, new AddressBook());
        System.out.println("AddressBook created successfully.");
    }

    private static boolean checkAddressBookPresent(String name) {
        for(int i = 0; i<allAddressBook.size(); i++) {
            if(allAddressBook.containsKey(name))
                return true;
        }
        return false;
    }
}
