package greenNote;

import java.util.HashMap;
import java.util.List;

public class UrlNote extends NoteTemblate{
	
	HashMap<String, List<Integer> > tags = new HashMap<String, List<Integer> >();

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
		this.tags = tags;
	}

	@Override
	public void printNote() {

		System.out.println(id + " : " + title);
		System.out.println(url);
		System.out.println(tags);
		
	}



}
