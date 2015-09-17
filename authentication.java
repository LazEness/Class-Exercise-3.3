/**
 * @author Eli Brennan
 * Classroom: CSC200
 * Date: 9/17/2015
 *
 */
import java.util.Scanner;
public class authentication {
	/**
	 * This is a main method
	 * @param args arguments for user input during run java command
	 */
	public static void main(String[] args) {
		String username, password, usernamein, passwordin;
		username = "Eli";
		password = "Brennan";	
		/*
		 * This is prompting the user to enter a username
		 *  that is case sensitive (System.out.println()
		 */
		System.out.println("Please enter username. It is case sensitive");
		Scanner keyboard = new Scanner(System.in);
		/* 
		 * This reads the users input for the username using the Scanner class 
		 * keyboard.nextLine() function and sets it equal to the usernamein string
		 */
		usernamein = keyboard.nextLine();
		System.out.println("Please enter password. It is case sensitive");
		passwordin = keyboard.nextLine();
		/* 
		 * The following logic is using java if else statement.
		 * If the statement is true, the program will print out "Welcome Eli" with 
		 * formatting so that (System.out.println("Welcome " + username + " !")) does
		 * not have to be written. This is to condense the code.
		 */
		if ((usernamein.equals(username) && (passwordin.equals(password)))){
			System.out.printf("Welcome %s!", username);
		} else {
			System.out.println("Wrong Username or Password!");
		}
		
		
		
	}

}
