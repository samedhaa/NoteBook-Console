package greenNote;

import java.util.HashMap;
import java.util.List;

public class UrlNote extends NoteTemblate{
	
	HashMap<String, List<Integer> > tags = new HashMap<String, List<Integer> >();

	private String url = "";
	

	UrlNote(String title, String type, String url, HashMap<String, List<Integer> > tags, Integer id)
	{
		this.id = id;
		this.title = title;
		this.type = type;
		this.url = url;
		this.tags = tags;
	}
	
	public HashMap<String, List<Integer> > getTags()
	{
		return tags;
	}
	
	public String getUrl()
	{
		return url;
	}
	public Integer getId()
	{
		return id;
	}



	@Override
	public void printNote() {
		// TODO Auto-generated method stub
		
	}



}
