CyberSafe Vault App Documentation


Purpose of the Program
CyberSafe Vault is a console-based cybersecurity application coded in Java. This program allows a user to store passwords safely for various websites/accounts. Some users struggle with creating/remembers passwords along with reusing weak passwords and/or keeping track of multiple logins. CyberSafe Vault allows the user to simply Add/Save, Search, Delete, Save-to-file, Load-from-file password entries.

The program will also check password strength and scan for duplicate passwords to promote better security practices. Your passwords will be encrypted before being stored. The project also recursively displays cyberthreats using a threat tree that highlights some common cyber security threats.

This application teaches you some basic cybersecurity concepts while exploring OOP concepts all in one Java project for beginners!


Project Structure
This project includes the following files:


Main.java
Driver file that displays menu and routes the program

Vault.java
Stores vault password entries into an ArrayList. Methods included allow user to search, delete, display passwords entries and check for duplicates.

PasswordEntry.java
Stores website, username, and password for each password entry.

PasswordChecker.java
Determines if password strength is weak, medium, or strong.

EncryptionUtil.java
Encrypts and decrypts passwords.

FileManager.java
Imports and exports passwords from text file.

ThreatNode.java
Creates each node for our cyber threat tree.

ThreatTree.java
Displays cyber threats recursively.

VaultTest.java
JUnit testing file that includes different test cases.


Features of CyberSafe Vault
Add passwords.
View saved passwords.
Search saved passwords.
Delete saved passwords.
Check Strength.
Scan for duplicate passwords.
Encrypt passwords.
Decrypt passwords.
Save passwords to text file.
Load passwords from text file.
Recursive Threat Tree.
JUnit Testing.


Running the Program
1. Open application folder using VS Code or IntelliJ IDEA.
2. Install Java JDK.
3. Add both junit jar files located in lib folder.
-> junit-4.13.2.jar
-> hamcrest-core-1.3.jar
4. Compile all java files.
5. Run Main.java.
6. Use Console Menu to navigate through app.
7. Run VaultTest.java to run JUnit Tests.


Technologies Used
Java
ArrayList
File I/O
Recursion
JUnit Testing
Object Oriented Programming
