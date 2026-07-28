/** Author: Saanvi Nayak
* Purpose: Class to store ONE password entry consisting of website,
username and the (encrypted) password.
*/
public class PasswordEntry {

private String website;
private String username;
private String password;

// creates entry with website, username and password
public PasswordEntry(String website, String username, String password) {
// just storing the values directly
this.website = website;
this.username = username;
this.password = password;
}

public String getWebsite() {
return website;
}

public String getUsername() {
return username;
}

public String getPassword() {
return password;
}

@Override
public String toString() {
// basic string format to display entry details
return "Website: " + website +
", Username: " + username +
", Password: " + password;
}
}