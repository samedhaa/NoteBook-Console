package greenNote;
import java.util.HashMap;


public class Users {

	private static HashMap<String, String> usersDatabase = new HashMap<String, String>();
	
	Users() // just for adding some users
	{	
		usersDatabase.put("1", "1");
		usersDatabase.put("2","2");
	}
	
	public boolean AuthorizeUser(String id, String password)
	{
		String user = "";
		if(usersDatabase.containsKey(id) == false)
		{
			System.out.println("The User you entered is not singed up!");
			return false;
		}
		else
		{
			user = usersDatabase.get(id);
			
			if(user.equals(password))
			{
	
				System.out.println("Login Succeeded");
				return true;
			}
			else
			{
				System.out.println("The Password is Wrong!");
				return false;
			}
		}
	}
}
