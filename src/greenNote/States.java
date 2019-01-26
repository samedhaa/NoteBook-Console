package greenNote;

import java.util.ArrayList;
import java.util.HashMap;

public class States extends Notebook{
	
	String[] userAction = {"1","ITG Task","1","This is a note for a task","YES","2","task","itg","2","0","1","task"}; // temporary input
    static ArrayList<DbTemblate> Notes = new ArrayList<DbTemblate>();
    static HashMap<String, Integer > tags = new HashMap<String, Integer >();
 
    Integer NotePosition = -1;
    Integer endFile = 0;
	
	public void stateDirecting()
	{

		System.out.println("Type 1 to add new note");
		System.out.println("Type 2 to view notes");
		System.out.println("Type 3 to search for notes based on tags");

		//userAction = new Scanner(System.in);
		//System.out.println(userAction.nextLine());
		String state = "";//userAction.readLine()

		state = userAction[endFile];
		
		if(state.equals("1"))
		{
			System.out.println("Insert Entered : ");
			InsertState Insert = new InsertState();
		}
		else if(state.equals("2"))
		{
			if(Notes.size() == 0)
			{
				System.out.println("There is no notes yet...");
			}
			else
			{
				int id = 1;
				for(DbTemblate note : Notes)
				{
					System.out.println(id);
					note.printNote();
					id++;
				}
				System.out.println("if you want to delete any note enter it's id");
				System.out.println("otherwise type 0");
				int input = Integer.parseInt(userAction[10]);
				if(input != 0)
				{
					try
					{
						Notes.remove(input-1);
						System.out.println("Deleted!");
					}catch(Exception e)
					{
						System.out.println("Note id is worng");
						System.out.println(input);
					}
				}
				
				
			}
		}
		else if(state.equals("3"))
		{
			System.out.println("Please enter the tag");
			String tag = userAction[11];
			System.out.println(tag);
			GoogleIt al = new GoogleIt(tag);
			
		}
		else
		{
			System.out.println("I'm not a damn AI give me something i can understand");
			System.out.println(endFile);
		}
		if(endFile == 10) // temporary
			return;
		else if(endFile == 8)
			endFile = 10;
		else if(endFile != 10 & endFile != 8)
			endFile = 8;
		stateDirecting(); 
		
	}
	
	
	
}
