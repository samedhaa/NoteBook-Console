package greenNote;

public class GoogleIt extends States{
	
	GoogleIt(String tag)
	{
		if(Notes.size() == 0)
		{
			System.out.println("Note Found! ");
		}
		else
		{
			Notes.get(tags.get(tag)).printNote();
		}
	}

}
