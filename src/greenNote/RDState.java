package greenNote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RDState extends States{
	
	public void Start()
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
			System.out.println("if you want to delete any note enter it's id");
			System.out.println("otherwise type 0");
			int input = Integer.parseInt(userAction[10]);
			if(input != 0)
			{
				try
				{
						DbTemblate deletedTags = Notes.get(input-1);
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
					System.out.println(input);
				}
			}
			
			
		}
	}

}
