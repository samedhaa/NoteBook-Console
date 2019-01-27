package greenNote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DbTemblate {

	private String title = ""; 
	private String type = "";
	private String content = "";
	HashMap<String, Integer > tags = new HashMap<String, Integer >();
	
	DbTemblate(String title, String type, String content, HashMap<String, Integer > tags)
	{
		this.title = title;
		this.type = type;
		this.content = content;
		this.tags = tags;
	}
	
	public void printNote()
	{
		System.out.println(title + " : " + type);
		System.out.println(content);
		System.out.println(tags);
		//Integer L = tags["task"];
	}
	
	public HashMap<String, Integer > getTags()
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
 
}
