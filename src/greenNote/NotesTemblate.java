package greenNote;

public abstract class NotesTemblate {
	
	String title = "";
	String type = "";
	Integer id = 0;
	
	public abstract Integer getId();
	public abstract String getTitle();
	public abstract String getType();
	
	public abstract void printNote();

}
