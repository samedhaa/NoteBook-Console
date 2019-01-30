package greenNote;


public class GoogleIt extends States{
	
	public static void Search(String tag)
	{
		if(UNotes.size() == 0)
		{
			System.out.println("Not Found! ");
		}
		else
		{
			 
			for(Integer tagPosition : tags.get(tag))
			{
				UrlNote note1 = States.UNotes.get(tagPosition);
				note1.printNote();
			}
			
		}
	}

}
