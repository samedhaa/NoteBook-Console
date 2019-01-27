package greenNote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InsertState extends States{
	
	
	private String title = ""; 
	private String type = "";
	private String content = "";
    //ArrayList<DbTemblate> Notes = new ArrayList<DbTemblate>();
    
    InsertState(){
    	NotePosition++;
		InsertingState();

    }
    

	public void InsertingState()
	{
					
		getTitle();
		
		getType();// text or audio
		
		System.out.println("Would you like to add a tag ? yes/no");
		String isTagged  = userAction[4];
			
		if(isTagged.equals("yes") | isTagged.equals("YES") | isTagged.equals("Yes") | isTagged.equals("y") | isTagged.equals("Y"))
		{
			getTags();
		}
		
		/**
		System.out.println(title);
		System.out.println(type);
		System.out.println(content);
		System.out.println(tags);
		*/
		DbTemblate InsertedNotes = new DbTemblate(title, type, content, tags,NotePosition);
		States.Notes.add(InsertedNotes);
		System.out.println("#@#!@#@");

		InsertedNotes.printNote();
		//Notes.get(NotePosition).printNote();
		
	}
	
	
	public void getTextContent()
	{
		
		System.out.println("Please enter the Note : ");
		String Content  = userAction[3];

		editContent(Content);
	}
	
	
	public void getAudioContent()
	{
		
		System.out.println("Please enter the Url for the voice : ");
		content  = userAction[3];
		
	}
	
	
	public void getTitle()
	{
				
		System.out.println("Please enter the title of the note : ");
		String theTitle = userAction[1];

		editTitle(theTitle);
		
	}
	
	public void getType()
	{
		
		System.out.println("Please enter 1 if it's a text");
		System.out.println("Please enter 2 if it's an audio");
		
		String type  = userAction[2];
		
		if(type.equals("1"))
		{
			editType("text");
			getTextContent();
		}
		else if(type.equals("2"))
		{
			editType("audio");
			getAudioContent();
		}
		else
		{
			System.out.println("Type wasn't clarified");
			getType();
		}

	}
	
	
	public void getTags()
	{
		String numberOfTags="0"; // should be integer will be fixed after the input get fixed
		
		System.out.println("How many tags ? ");
		try
		{
			numberOfTags = userAction[5];

		}
		catch(Exception e)
		{
			System.out.println("Yoo! give me that number!");
			getTags();
			return;
		}
		
		String tag;
		for(int i=1;i<=Integer.parseInt(numberOfTags);i++)
		{
			System.out.println("Tag number : " + i);
			tag = userAction[5+i];
			List<Integer> prevData = new ArrayList<Integer>();
			if(tags.containsKey(tag))
			{
				prevData.addAll(tags.get(tag));
			}
			prevData.add(NotePosition);

			tags.put(tag,prevData);

//			prevData.clear();

		}

		
	}
	
	private void editTitle(String Title)
	{
		this.title = Title;
	}
	
	private void editType(String Type)
	{
		this.type = Type;
	}

	private void editContent(String Content)
	{
		this.content = Content;
	}
	
	//tags


}
