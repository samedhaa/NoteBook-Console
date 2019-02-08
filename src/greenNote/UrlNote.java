package greenNote;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import States.States;

public class UrlNote extends NoteTemblate{
	
	static HashMap<String, List<Integer> > tags = new HashMap<String, List<Integer> >();

	private String url = "";
	

	public UrlNote(String title, String url, HashMap<String, List<Integer> > tags, Integer id)
	{
		setId(id);
		
		setTitle(title);
		
		setUrl(url);
		
		setTags(tags);
		
	}
	
	public HashMap<String, List<Integer> > getTags()
	{
		return tags;
	}
	
	public String getUrl()
	{
		return url;
	}
	
		
	public void setUrl(String url)
	{
		this.url = url;
	}

	public void setTags(HashMap<String, List<Integer> > tags)
	{
		UrlNote.tags = tags;
	}

	@Override
	public void printNote() {

		System.out.println(id + " : " + title);
		System.out.println(url);
		System.out.println(tags);
		
	}
	
	public static void Search(String inp) // inp = tag
	{
		if(States.UNotes.size() == 0)
		{
			System.out.println("Not Found! ");
		}
		else
		{
			 
			for(Integer tagPosition : tags.get(inp))
			{
				UrlNote note1 = States.UNotes.get(tagPosition);
				note1.printNote();
			}
			
		}
	}
	
	public static void RDState()
	{
		Integer input = RDnote();
		boolean catched = false;

		
		if(input == -1)
			return;
		try
		{
				UrlNote deletedTags = States.UNotes.get(input);
				HashMap<String, List<Integer>> deleted = deletedTags.getTags();
				
					
				for (Map.Entry<String, List<Integer> > entry : deleted.entrySet())
				{
						tags.get(entry.getKey()).remove(deletedTags.getId());

				}

				States.UNotes.remove(input);
				System.out.println("Deleted!");
		}
			
		catch(Exception e)
		{
			catched = true;
		}
		
		if(catched == true)
		{
			
			try
			{
					States.UNotes.remove(input);
					System.out.println("Deleted!");
			}
			
			catch(Exception e)
			{
				System.out.println("Note id is worng");
			}
		}
	
		
			
		
	}



}
