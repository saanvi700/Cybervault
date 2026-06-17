/**
Author: Saanvi Nayak
Description: Driver class which runs CyberSafe Vault.
The menu options, user input and calling different features are
handled here.
*/
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

Vault vault = new Vault();

int choice;

do {
System.out.println("\n===== CYBERSAFE VAULT =====");
System.out.println("1. Add Password");
System.out.println("2. View Passwords");
System.out.println("3. Check Password Strength");
System.out.println("4. Save Vault");
System.out.println("5. Load Vault");
System.out.println("6. Display Threat Tree");
System.out.println("7. Search Password");
System.out.println("8. Delete Password");
System.out.println("9. Check Duplicate Passwords");
System.out.println("10. Exit");

System.out.print("Choose option: ");
choice = scanner.nextInt();
scanner.nextLine(); // clearing the newline leftover

switch(choice) {

case 1:
System.out.print("Website: ");
String website = scanner.nextLine();

System.out.print("Username: ");
String username = scanner.nextLine();

System.out.print("Password: ");
String password = scanner.nextLine();

// encrypting password before storing
password = EncryptionUtil.encrypt(password);

PasswordEntry entry = new PasswordEntry(website, username, password);
vault.addEntry(entry);

System.out.println("Password added successfully! ");
break;

case 2:
vault.displayEntries();
break;

case 3:
System.out.print("Enter password to check: ");
String pwd = scanner.nextLine();

String strength = PasswordChecker.checkStrength(pwd);

System.out.println("Password Strength: " + strength);
break;

case 4:
FileManager.saveVault(vault);
break;

case 5:
FileManager.loadVault(vault);
break;

case 6:

// building a small threat tree
ThreatNode root = new ThreatNode("Cyber Threats");

ThreatNode passwordThreats = new ThreatNode("Password Threats");
ThreatNode networkThreats = new ThreatNode("Network Threats");

ThreatNode weakPassword = new ThreatNode("Weak Password");
ThreatNode reusedPassword = new ThreatNode("Reused Password");

ThreatNode phishing = new ThreatNode("Phishing");
ThreatNode mitm = new ThreatNode("Man In The Middle Attack");

root.addChild(passwordThreats);
root.addChild(networkThreats);

passwordThreats.addChild(weakPassword);
passwordThreats.addChild(reusedPassword);

networkThreats.addChild(phishing);
networkThreats.addChild(mitm);

System.out.println("\n===== THREAT TREE =====");
ThreatTree.displayThreats(root);

break;

case 7:
System.out.print("Enter website to search: ");
String searchWebsite = scanner.nextLine();

vault.searchEntry(searchWebsite);
break;

case 8:
System.out.print("Enter website to delete: ");
String deleteWebsite = scanner.nextLine();

vault.deleteEntry(deleteWebsite);
break;

case 9:
vault.checkDuplicatePasswords();
break;

case 10:
System.out.println("Exiting...");
break;

default:
System.out.println("Invalid option. ");
}

} while(choice != 10);

scanner.close();
}

}