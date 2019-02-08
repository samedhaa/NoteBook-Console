package greenNote;

import States.States;

public abstract class NoteTemblate{

	public String title = ""; 
	public Integer id = 0;
	
	
	public abstract void printNote();
	
	public static void RDState()
	{
		return;
	}
	
	
	public static Integer RDnote()
	{
		viewNote();
		
		System.out.println("if you want to delete any note enter it's id \n otherwise type -1");

		Integer input = Integer.parseInt(States.userAction[9]);
		
		return input;
	}
	
	public static void viewNote()
	{
		if(States.UNotes.size() == 0 & States.TNotes.size() == 0) // 
		{
			System.out.println("There is no notes yet...");
		}
		else
		{
			for(UrlNote note : States.UNotes)
			{
				note.printNote();
			}
		}

	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	
	public String getTitle()
	{
		return this.title;
	}
	
	public Integer getId()
	{
		return this.id;
	}
	
}
