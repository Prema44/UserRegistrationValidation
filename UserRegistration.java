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
		
		public static String validateEmail(String Email) {
			String expression = "^[a-z]+[.|+_-]?[a-z0-9]+[@][a-z0-9]{1,}[.][a-z]{2,}[.]{0,1}[a-z]*$";; // Pattern for Email
			Pattern pattern = Pattern.compile(expression);
			Matcher match = pattern.matcher(Email);
			if(match.find()) {
				return "valid";
			}
			else {
			return "invalid";
			}
			
			
		}	
		
		public static void validateMobile(String mobileNumber)
		{
			String regex="[0-9]{2}[ ][1-9][0-9]{9}";
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(mobileNumber);

			if(matcher.find())
				System.out.println(mobileNumber + " is valid");
			else
				System.out.println(mobileNumber + " is not valid");
		}
		
		public static void validatePassword(String password)
	    {
	        String regex="(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[a-zA-Z0-9@_#$%^&*]{8,}$";
	        Pattern pattern=Pattern.compile(regex);
	        Matcher matcher=pattern.matcher(password);

	        if(matcher.find()) {
	            System.out.println(password+" is valid");
	        }
	        else {
	            System.out.println(password+" is not valid");
	        }
	    }
		
		private void verifyEmail() {
			System.out.println("abc@gmail.com" + " is " +validateEmail("abc@gmail.com"));
			System.out.println("abc-100@yahoo.com" + " is " +validateEmail("abc-100@yahoo.com"));
			System.out.println("abc.100@yahoo.com" + " is " +validateEmail("abc.100@yahoo.com"));
			System.out.println("abc-100@abc.net" + " is " +validateEmail("abc-100@abc.net"));
			System.out.println("abc.100@abc.com.au" + " is " +validateEmail("abc.100@abc.com.au"));
			System.out.println("abc@gmail.com.com" + " is " +validateEmail("abc@gmail.com.com"));
			System.out.println("abc@.com.my" + " is " +validateEmail("abc@.com.my"));
			System.out.println("abc123@gmail.a" + " is " +validateEmail("abc123@gmail.a"));
			System.out.println("abc123@.com" + " is " +validateEmail("abc123@.com"));
			System.out.println(".abc@abc.com" + " is " +validateEmail(".abc@abc.com"));
			System.out.println("abc()*@gmail.com" + " is " +validateEmail("abc()*@gmail.com"));
			System.out.println("abc@%*.com" + " is " +validateEmail("abc@%*.com"));
			System.out.println("abc..2002@gmail.com" + " is " +validateEmail("abc..2002@gmail.com"));
			System.out.println("abc@abc@gmail.com" + " is " +validateEmail("abc@abc@gmail.com"));
		}
			
			
		public static void main(String[] args) {
			
			String firstName = "";
			String lastName = "";
			String email = "";
			String mobileNumber = "";
			
			UserRegistration user = new UserRegistration();
			
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
			
			System.out.println("Enter the Mobile Number");
			mobileNumber = input.nextLine();
			validateMobile(mobileNumber);//validation of MobileNumber
			
			System.out.println("Enter the password");
			String password = input.nextLine();
			validatePassword(password); // Validation of password
			
			user.verifyEmail();
			
			
		}	
		}
	


