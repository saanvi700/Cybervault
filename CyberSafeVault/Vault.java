/**
Author: Saanvi Nayak
Purpose: Holds all PasswordEntry objects. Has basic functions
like add, search, delete, displayEntries and checkDuplicatePasswords.
*/

import java. util. ArrayList;

public class Vault {

private ArrayList<PasswordEntry> entries; // holds PasswordEntry objects

public Vault() {
entries = new ArrayList<>(); // creating list to store all entries
}

// ADD ENTRY
public void addEntry(PasswordEntry entry) {
entries.add(entry); // adds entry to ArrayList entries.
}

// DISPLAY ENTRIES
public void displayEntries() {

if(entries.isEmpty()) { // Displays if list is empty

System.out.println("No passwords stored. ");
return;
}

for(PasswordEntry entry : entries) { // Iterates through each element in entries.
System.out.println("Website: " + entry.getWebsite() +
", Username: " + entry.getUsername() +
", Password: " + EncryptionUtil.decrypt(entry.getPassword())
);
}
}

// SEARCH ENTRY
public void searchEntry(String website) {

boolean found = false;

for (PasswordEntry entry : entries) { // Iterates through each element in entries.
if(entry.getWebsite().equalsIgnoreCase(website)) { // checking if website entered by user matches any website stored.
System.out.println("Website: " + entry.getWebsite() +
", Username: " + entry.getUsername() +
", Password: " + EncryptionUtil.decrypt(entry.getPassword())
);
found = true;
}
}

if(!found) {
System.out.println("No password found for website. ");
}
}

// DELETE ENTRY
public void deleteEntry(String website) {

boolean removed = false;

for(int i = 0; i < entries.size(); i++) { // Iterates through each element in entries.
if(entries.get(i).getWebsite().equalsIgnoreCase(website)) { // checking if website entered by user matches any website stored.
entries.remove(i); // removes entry from arraylist
removed = true;

System.out.println("Password deleted successfully! ");
break;
}
}

if(!removed) {
System.out.println("Website not found. ");
}
}

// CHECK DUPLICATE PASSWORDS
public void checkDuplicatePasswords() {

boolean duplicateFound = false;

for(int i = 0; i < entries.size(); i++) {

for(int j = i + 1; j < entries.size(); j++) { //nested for loops help compare passwords between each Password Entry.

String password1 = EncryptionUtil.decrypt(entries.get(i).getPassword());
String password2 = EncryptionUtil.decrypt(entries.get(j).getPassword());

if(password1.equals(password2)) { //checking if passwords are same.
System.out.println("Duplicate password detected between:");
System.out.println(entries.get(i).getWebsite());
System.out.println(entries.get(j).getWebsite());

duplicateFound = true;
}
}
}

if(!duplicateFound) {
System.out.println("No duplicate passwords found. ");
}
}

// GET ENTRIES
public ArrayList<PasswordEntry> getEntries() {
return entries; //returns entries
}
}