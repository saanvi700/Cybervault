# CyberSafe Vault

CyberSafe Vault is a console-based Java application that securely stores and manages passwords for multiple websites and accounts. The project demonstrates object-oriented programming, file handling, encryption, recursion, and software testing while promoting cybersecurity best practices.



## Project Overview

Managing multiple online accounts often leads to weak or reused passwords. CyberSafe Vault helps users securely organise their login credentials while encouraging stronger password habits through password strength analysis and duplicate password detection.

Passwords are encrypted before storage, and users can save or load their vault from a local file.



## Features

- Store passwords securely
- Encrypt passwords before storage
- Decrypt passwords when viewing entries
- Search passwords by website
- Delete saved passwords
- Save vault to a text file
- Load vault from a saved file
- Check password strength (Weak, Medium or Strong)
- Detect duplicate passwords across accounts
- Display a recursive cyber threat tree
- JUnit unit testing



## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- File I/O
- Recursion
- JUnit 4
- Console-Based User Interface



## Software Design

The application is organised into multiple classes with clear responsibilities:

| Class | Responsibility |
|--------|----------------|
| Main | Controls the menu system and user interaction |
| Vault | Stores and manages password entries |
| PasswordEntry | Represents individual password records |
| EncryptionUtil | Encrypts and decrypts passwords |
| PasswordChecker | Evaluates password strength |
| FileManager | Saves and loads vault data |
| ThreatNode | Represents nodes in the cyber threat tree |
| ThreatTree | Displays threats recursively |
| VaultTest | Unit tests using JUnit |



## Getting Started

### Prerequisites

- Java JDK 17 or later
- IntelliJ IDEA, Eclipse or Visual Studio Code

### Installation

1. Clone this repository.
2. Open the project in your preferred Java IDE.
3. Add the required JUnit libraries from the `lib` folder.
4. Compile all Java source files.
5. Run `Main.java`.



##  Main Menu

The application allows users to:

- Add a password
- View stored passwords
- Check password strength
- Save the vault
- Load the vault
- Display the cyber threat tree
- Search for passwords
- Delete passwords
- Detect duplicate passwords
- Exit the application



##  Programming Concepts Demonstrated

- Object-Oriented Programming
- Encapsulation
- ArrayLists
- File Handling
- Encryption and Decryption
- Recursion
- Exception Handling
- User Input Validation
- Software Testing with JUnit



## Screenshots

Screenshots of the application will be added soon.



## Future Improvements

Potential enhancements include:

- AES encryption instead of a basic character shift
- Master password authentication
- Graphical User Interface (GUI)
- Secure database storage
- Password generator
- Password expiry reminders
- Export to encrypted files



## Author

**Saanvi Nayak**

Computer Science Student

GitHub: https://github.com/saanvi700



## Licence

This project was developed for educational purposes as part of a university software development assignment.
