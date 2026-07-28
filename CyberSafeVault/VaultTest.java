/**
Author: Saanvi Nayak
Purpose: This class has many JUnit tests that test vault functions
as well as password strengh / encryption.
*/


import org. junit. Test;
import static org. junit. Assert. *;


public class VaultTest {

@Test
public void testAddEntry() {
// testing to see if adding 1 entry works

Vault vault = new Vault();

PasswordEntry entry = new PasswordEntry(
"gmail. com",
"saanvi",
EncryptionUtil.encrypt("Test@123")
);

vault.addEntry(entry);

// there should only be 1 entry in vault
assertEquals(
1,
vault.getEntries().size()
);
}

@Test
public void testWeakPassword() {
// very short password so this should be weak
String result = PasswordChecker.checkStrength("abc");

assertEquals(
"WEAK",
result
);
}

@Test
public void testMediumPassword() {
// letters + numbers but no special characters
String result = PasswordChecker.checkStrength("abc12345");

assertEquals(
"MEDIUM",
result
);
}

@Test
public void testStrongPassword() {
// good strong password with everything mixed
String result = PasswordChecker.checkStrength("Test@123");

assertEquals(
"STRONG",
result
);
}

@Test
public void testGetWebsite() {
// testing to see if website getter works properly
PasswordEntry entry = new PasswordEntry(
"gmail. com",
"user",
EncryptionUtil.encrypt("pass")
);

assertEquals(
"gmail. com",
entry.getWebsite()
);
}

@Test
public void testEncryption() {
// want to make sure when we encrypt and decrypt we get original string back
String original = "Test@123";

String encrypted = EncryptionUtil.encrypt(original);
String decrypted = EncryptionUtil.decrypt(encrypted);

assertEquals(
original,
decrypted
);
}
}