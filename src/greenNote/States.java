package greenNote;

import java.util.ArrayList;

public class States extends Notebook{
	
	String[] userAction = {"1","ITG Task","1","This is a note for a task","YES","2","task","itg","2"}; // temporary input
    static ArrayList<DbTemblate> Notes = new ArrayList<DbTemblate>();
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
				for(DbTemblate note : Notes)
				{
					note.printNote();
				}
			}
		}
		else if(state.equals("3"))
		{
			System.out.println("Please enter the tag");
			
		}
		else
		{
			System.out.println("I'm not a damn AI give me something i can understand");
		}
		if(endFile == 8) // temporary
			return;
		endFile = 8;
		stateDirecting(); 
		
	}
	
	
	
}
