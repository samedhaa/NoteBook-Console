package greenNote;

public abstract class NoteTemblate {

	String title = ""; 
	String type = "";
	Integer id = 0;
	
	
	public abstract void printNote();
	
	
	public String getTitle()
	{
		return this.title;
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
