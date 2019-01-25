package greenNote;
import java.util.Scanner;
public class UserLogin extends Users{

	static public void Login()
	{
		Users DB = new Users(); // A class that have users.
		Scanner userInput = null;
		String userId = null;
		String userPassword = null;
		
		
		
		// this return true if the login succeeded
		while(DB.AuthorizeUser(userId, userPassword) == false) // q for omar : is there a better way for making it more secure?
		{
			System.out.println("Please enter user id : ");
			
			userInput = new Scanner(System.in);
			userId = userInput.nextLine();
			
			System.out.println("Please enter password : ");
			
			userInput = new Scanner(System.in); // ?
			userPassword = userInput.nextLine();
		}
		
		userInput.close(); // getting out of bath is just like entering it
		
	}
}
