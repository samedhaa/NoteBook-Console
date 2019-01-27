package greenNote;

import java.util.ArrayList; // 2 problems i don't delete the tag from the hashmap , the input sucks
// why the url should have it's own class?
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class States extends Notebook{
	
	//static String[] userAction = {"1","ITG Task","1","This is a note for a task","YES","2","task","itg","2","0","0","task"}; // temporary input
	//static String[] userAction = {"1","ITG Task","1","This is a note for a task","YES","2","task","itg","3","task","0","task"}; // temporary input
	static String[] userAction = {"1","ITG Task","1","This is a note for a task","YES","2","task","itg","2","0","0","task"}; // temporary input


	static ArrayList<DbTemblate> Notes = new ArrayList<DbTemblate>();
    static HashMap<String, List<Integer> > tags = new HashMap<String, List<Integer> >();
 
    Integer NotePosition = -1;
    Integer endFile = 0;
	
	public void stateDirecting()
	{
		String Message = "Type 1 to add new note\n Type 2 to view notes\n ";
		System.out.println(Message);

		String state = "";

		state = userAction[endFile];
		if(state.equals("1"))
		{
			new InsertState();
			endFile = 8; // those are temporary for the input
		}
		else if(state.equals("2"))
		{	
			RDState.Start();
			endFile++;
		}
		else if(state.equals("3"))
		{
			System.out.println("Please enter the tag : ");
			endFile++;
			String tag = userAction[endFile];
			new GoogleIt(tag);
			
		}
		else
		{
			System.out.println("I'm not a damn AI give me something i can understand");
		}

		if(endFile == 9) // temporary
			return;

		stateDirecting(); 
		
	}
	
	
	
}
