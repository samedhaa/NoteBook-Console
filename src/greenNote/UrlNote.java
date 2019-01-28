package greenNote;

import java.util.HashMap;
import java.util.List;

public class UrlNote extends NotesTemblate{
	
	String url = "";
	HashMap<String, List<Integer> > tags = new HashMap<String, List<Integer> >();
	
	public void Insert(Integer id, String title, String type, String url, HashMap<String, List<Integer> > tags)
	{
		this.id = id;
		this.title = title;
		this.type = type;
		this.url = url;
		this.tags = tags;
	}
	
	@Override
	public Integer getId()
	{
		return this.id;
	}
	
	@Override
	public String getTitle() 
	{
		return this.title;
	}
	
	@Override
	public String getType()
	{
		return this.type;
	}
	
	@Override
	public void printNote()
	{
		System.out.println("Note ID : " + this.id);
		System.out.println(this.title + " : " + this.type);
		System.out.println(this.url);
		System.out.println(this.tags);

		
	}
	

}
