/* Author: Saanvi Nayak
* Purpose: Handles saving/loading vault to a simple text file. Simply writes entries as CSV format and reads from it.
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class FileManager {

public static void saveVault(Vault vault) {

try {

FileWriter writer = new FileWriter("vault.txt");


//saving each entry as csv line
for(PasswordEntry entry : vault.getEntries()) {
writer.write(
entry.getWebsite() + "," +
entry.getUsername() + "," +
entry.getPassword() + "\n"
);
}


writer.close();
System.out.println("Vault saved successfully! ");


} catch(IOException e) {

System.out.println("Error saving vault. ");
}
}


//loading vault entries again
public static void loadVault(Vault vault) {

try {

BufferedReader reader =
new BufferedReader(new FileReader("vault.txt"));

String line;


//reading file line by line
while((line = reader.readLine()) != null) {

String[] data = line.split(",");

PasswordEntry entry = new PasswordEntry(
data[0],
data[1],
data[2]
);


vault.addEntry(entry);
}


reader.close();
System.out.println("Vault loaded successfully! ");

} catch(IOException e) {

System.out.println("Error loading vault. ");
}
}
}