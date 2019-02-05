package States;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import greenNote.UrlNote;

public class RDState extends States{
	
	public static void Start()
	{
		if(UNotes.size() == 0 & TNotes.size() == 0) // 
		{
			System.out.println("There is no notes yet...");
		}
		else
		{
			for(UrlNote note : UNotes)
			{
				note.printNote();
			}
			System.out.println("if you want to delete any note enter it's id \n otherwise type -1");

			Integer input = Integer.parseInt(userAction[9]);
			boolean catched = false;
			if(input != -1)
			{
				try
				{
						UrlNote deletedTags = UNotes.get(input);
						HashMap<String, List<Integer>> deleted = deletedTags.getTags();
						
							
						for (Map.Entry<String, List<Integer> > entry : deleted.entrySet())
						{
								tags.get(entry.getKey()).remove(deletedTags.getId());

						}

						UNotes.remove(input);
						System.out.println("Deleted!");
				}
					
				catch(Exception e)
				{
					catched = true;
				}
				
				if(catched == true)
				{
					
					try
					{
							UNotes.remove(input);
							System.out.println("Deleted!");
					}
					
					catch(Exception e)
					{
						System.out.println("Note id is worng");
					}
				}
			}
			
			
		}
	}

}
