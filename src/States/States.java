package States;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;

import greenNote.NoteTemblate;
import greenNote.NotebookConstance;
import greenNote.TextNote;
import greenNote.UrlNote;

public class States implements NotebookConstance{
	
	public static String[] userAction = {"1","ITG Task","1","This is a note for a task","YES","2","task","itg","2","0","0","task"}; // temporary input
	public static String[] userInput = {"audio"};
	//static String[] userAction = {"1","ITG Task","1","This is a note for a task","YES","2","task","itg","3","task","0","task"}; // temporary input
	//static String[] userAction = {"1","ITG Task","1","This is a note for a task","YES","2","task","itg","2","0","0","task"}; // temporary input


	public static ArrayList<TextNote> TNotes = new ArrayList<TextNote>();
	public static ArrayList<UrlNote> UNotes = new ArrayList<UrlNote>();

    public static HashMap<String, List<Integer> > tags = new HashMap<String, List<Integer> >();
 
    Integer NotePosition = -1;
    private Integer endFile = 0;
	
	public Integer stateDirecting()
	{
		System.out.println(NotebookConstance.NOTETYPE);

		String state = "";

		state = userAction[endFile];
		
		if(state.equals("1"))
		{
			startState();
		}
		else if(state.equals("2"))
		{	
			System.out.println("is it audio or url ?");
			String noteType = userInput[0];
			if(noteType.equals("audio"))
			{				
				UrlNote.RDState();
			}
			else if(noteType.equals("url"))
			{
				TextNote.RDState();
			}
			else
			{
				System.out.println("type isn't defined");
				return stateDirecting();
			}
			endFile++;
		}
		else if(state.equals("3"))
		{
			Google();
		}
		else
		{
			System.out.println(NotebookConstance.WRONGINPUT);
		}

		if(endFile == 9) // temporary
			return 0;

		return stateDirecting(); 
		
	}
	
	public void startState()
	{
		StateMachine insertAction = new StateMachine();
		insertAction.Inserting();
		
		endFile = 8; // those are temporary for the input

	}
	
	public void Google()
	{
		System.out.println(NotebookConstance.ENTERTAG);
		endFile++;
		String tag = userAction[endFile];
		UrlNote.Search(tag);
	}
	
}
