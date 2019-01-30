package greenNote;


public class TextNote extends NoteTemblate{
	
	private String content = "";

	TextNote(String title, String type, String content, Integer id)
	{
		this.id = id;
		this.title = title;
		this.type = type;
		this.content = content;
	}

	
	public String getContent()
	{
		return content;
	}
	
	@Override
	public void printNote() {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
