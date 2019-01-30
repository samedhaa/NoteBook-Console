package greenNote;
import java.util.Scanner;
public class UserAuthenticator{

	static public void Login()
	{
		Users DB = new Users(); // A class that have users.
		Scanner userInput = new Scanner(System.in); ;
		String userId = "";
		String userPassword = "";
		
		
		
		// this return true if the login succeeded
		do
		{
				System.out.println("Please enter user id : ");
				
				userId = userInput.nextLine();
				
				System.out.println("Please enter password : ");
				
				userPassword = userInput.nextLine();
		}
		while(DB.AuthorizeUser(userId, userPassword) == false);
		
		userInput.close(); 
		
	}
}
