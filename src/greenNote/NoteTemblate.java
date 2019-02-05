package greenNote;

public abstract class NoteTemblate {

	String title = ""; 
	Integer id = 0;
	
	
	public abstract void printNote();
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	
	public String getTitle()
	{
		return this.title;
	}
	
	public Integer getId()
	{
		return this.id;
	}
	
}
