/**
Author: Saanvi Nayak
Purpose: Evaluates the strength of a password by assigning a rudimentary score based on length,
uppercase, lowercase, numbers and special characters.
*/

public class PasswordChecker {


public static String checkStrength(String password) {

int score = 0;

// checking length
if(password.length() >= 8)
score++;

// checking uppercase letters
if(password.matches(".*[A-Z]. *"))
score++;

// checking lowercase letters
if(password.matches(".*[a-z]. *"))
score++;

// checking numbers
if(password.matches(".*[0-9]. *"))
score++;

// checking special characters
if(password.matches(".*[!@#$%^&*()]. *"))
score++;

// deciding final strength
if(score <= 2)
return "WEAK";
else if(score <= 4)
return "MEDIUM";
else
return "STRONG";
}

}