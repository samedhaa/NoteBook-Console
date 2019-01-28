package greenNote;

public class MessageNote extends NotesTemblate{
	
	String content = "";
	
	
	public void Insert(Integer id, String title, String type, String content)
	{
		this.id = id;
		this.title = title;
		this.type = type;
		this.content = content;
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
		System.out.println(this.content);

		
	}
	
}
