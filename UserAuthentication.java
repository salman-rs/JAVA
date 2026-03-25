package faris;
import java.util.Scanner;

//User-defined Exception class
class InvalidUserException extends Exception {

 // Constructor
 public InvalidUserException(String message) {
     super(message);
 }
}

public class UserAuthentication {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     String username, password;

     System.out.print("Enter Username: ");
     username = sc.nextLine();

     System.out.print("Enter Password: ");
     password = sc.nextLine();

     try {
         authenticate(username, password);
         System.out.println("Login Successful!");
     } catch (InvalidUserException e) {
         System.out.println("Exception: " + e.getMessage());
     } finally {
         sc.close();
     }
 }

 // Method to authenticate user
 static void authenticate(String username, String password) throws InvalidUserException {
     if (!username.equals("admin") || !password.equals("1234")) {
         throw new InvalidUserException("Invalid Username or Password!");
     }
 }


	}


