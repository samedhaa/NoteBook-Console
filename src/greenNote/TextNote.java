package greenNote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import States.States;


public class TextNote extends NoteTemblate{
	
	private String messageContent = "";

	public TextNote(String title, String content, Integer id)
	{
		setId(id);
		
		setTitle(title);

		setContent(content);
	}

	
	public void setContent(String content) {
		this.messageContent = content;
	}
	
	public String getContent()
	{
		return messageContent;
	}
	
	@Override
	public void printNote() {
		System.out.println(id + " : " + title);
		System.out.println(messageContent);

		
	}


	public static void RDState() {
		
		Integer input = RDnote();
		
		if(input == -1)
			return;
		
		Integer index = 0;
		
		for(TextNote textNote : States.TNotes)
		{
			if(textNote.getId()==input)
			{
				States.TNotes.remove(index);
			}
			
			index++;
		}
		
	}
	
	

	
}
