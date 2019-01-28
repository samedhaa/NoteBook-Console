package greenNote;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;

public class States extends Notebook implements NotebookConstance{
	
	//static String[] userAction = {"1","ITG Task","1","This is a note for a task","YES","2","task","itg","2","0","0","task"}; // temporary input
	//static String[] userAction = {"1","ITG Task","1","This is a note for a task","YES","2","task","itg","3","task","0","task"}; // temporary input
	static String[] userAction = {"1","ITG Task","1","This is a note for a task","YES","2","task","itg","2","0","0","task"}; // temporary input


	static ArrayList<DbTemblate> Notes = new ArrayList<DbTemblate>();
    static HashMap<String, List<Integer> > tags = new HashMap<String, List<Integer> >();
 
    Integer NotePosition = -1;
    Integer endFile = 0;
	
	public void stateDirecting()
	{
		System.out.println(NotebookConstance.NOTETYPE);

		String state = "";

		state = userAction[endFile];
		if(state.equals("1"))
		{
			InsertState insertAction = new InsertState();
			insertAction.Inserting();
			
			endFile = 8; // those are temporary for the input
		}
		else if(state.equals("2"))
		{	
			RDState.Start();
			endFile++;
		}
		else if(state.equals("3"))
		{
			System.out.println(NotebookConstance.ENTERTAG);
			endFile++;
			String tag = userAction[endFile];
			GoogleIt.Search(tag);
			
		}
		else
		{
			System.out.println(NotebookConstance.WRONGINPUT);
		}

		if(endFile == 9) // temporary
			return;

		stateDirecting(); 
		
	}
	
}
