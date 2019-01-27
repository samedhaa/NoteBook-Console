package greenNote;

import java.util.HashMap;
import java.util.List;

public class DbTemblate {

	private String title = ""; 
	private String type = "";
	private String content = "";
	private Integer id = 0;
	HashMap<String, List<Integer> > tags = new HashMap<String, List<Integer> >();
	
	DbTemblate(String title, String type, String content, HashMap<String, List<Integer> > tags, Integer id)
	{
		this.id = id;
		this.title = title;
		this.type = type;
		this.content = content;
		this.tags = tags;
	}
	
	public void printNote()
	{
		System.out.println("Note ID : " + id);
		System.out.println(title + " : " + type);
		System.out.println(content);
		System.out.println(tags);
		//Integer L = tags["task"];
	}
	
	public HashMap<String, List<Integer> > getTags()
	{
		return tags;
	}
	
	public String getTitle()
	{
		return title;
	}
	public String getContent()
	{
		return content;
	}
	public String getType()
	{
		return type;
	}
	public Integer getId()
	{
		return id;
	}
 
}
