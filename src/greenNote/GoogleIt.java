package greenNote;


public class GoogleIt extends States{
	
	public static void Search(String tag)
	{
		if(Notes.size() == 0)
		{
			System.out.println("Not Found! ");
		}
		else
		{
			 
			for(Integer tagPosition : tags.get(tag))
			{
				DbTemblate note1 = States.Notes.get(tagPosition);
				note1.printNote();
			}
			
		}
	}

}
