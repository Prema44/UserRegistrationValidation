package userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
			
		public static void validateName(String firstName)
		{
			String regex = "^[A-Z]{1}[a-zA-z]{2,}";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(firstName);

			if(matcher.find()) {
				System.out.println(firstName + " is valid");
			}
	                else {
				System.out.println(firstName + " is not valid");
	                }
		}
		
		public static void validateEmail(String Email) {
			String expression = "(abc[.][A-Za-z]+@bl[.]co[.][A-Za-z]{2,})$"; // Pattern for Email
			Pattern pattern = Pattern.compile(expression);
			Matcher match = pattern.matcher(Email);
			if(match.find()) {
				System.out.println("Email is Valid");
			}
			else {
			System.out.println("Email is invalid");
			}
			
		}	
			
			
		public static void main(String[] args) {
			
			String firstName = "";
			String lastName = "";
			String email = "";
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the first name");
			firstName = input.nextLine();
			validateName(firstName);//validation of first name
			
			System.out.println("Enter the last name");
			lastName = input.nextLine();
			validateName(lastName);//validation of last name
			
			System.out.println("Enter the Email");
			email = input.nextLine();
			validateEmail(email);//validation of Email
		}	
		}
	


