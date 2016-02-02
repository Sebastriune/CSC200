import java.util.Scanner;
public class HelloWorld {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Prompt the user to enter his or her username
		System.out.println("Enter your name");
		String username = scanner.nextLine();
		// Read string input for password
		System.out.println("Enter your password");
		String password = scanner.next();
		
		//Instantiation: Create a Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Display results 
		System.out.println("Hello " + username + ", Welcome to CSC200 class! and Your password is " + password);

	}

}

//Tanes
//Email: tkanchanawanchai@gmail.com

