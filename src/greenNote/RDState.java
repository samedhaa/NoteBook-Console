package greenNote;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RDState extends States{
	
	public static void Start()
	{
		if(Notes.size() == 0) // 
		{
			System.out.println("There is no notes yet...");
		}
		else
		{
			for(DbTemblate note : Notes)
			{
				note.printNote();
			}
			System.out.println("if you want to delete any note enter it's id \n otherwise type -1");

			Integer input = Integer.parseInt(userAction[9]);
			if(input != -1)
			{
				try
				{
						DbTemblate deletedTags = Notes.get(input);
						HashMap<String, List<Integer>> deleted = deletedTags.getTags();
						
							
						for (Map.Entry<String, List<Integer> > entry : deleted.entrySet())
						{
								tags.get(entry.getKey()).remove(deletedTags.getId());

						}

						Notes.remove(input);
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
