package greenNote;

import java.util.HashMap;
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
			int id = 1;
			for(DbTemblate note : Notes)
			{
				System.out.println(id);
				note.printNote();
				id++;
			}
			System.out.println("if you want to delete any note enter it's id");
			System.out.println("otherwise type 0");
			int input = Integer.parseInt(userAction[10]);
			if(input != 0)
			{
				try
				{
					DbTemblate deletedNote = Notes.get(input-1);
					HashMap<String, Integer > deletedTags = deletedNote.getTags();
					for(Map.Entry<String, Integer> dt : deletedTags.entrySet()) // deleting the tag after deleting the value
					{ // make multivalues of hashmap and then delete somevalues in the hashmap
						tags.remove(dt.getKey());
					}
					Notes.remove(input-1);
					System.out.println("Deleted!");
				}catch(Exception e)
				{
					System.out.println("Note id is worng");
					System.out.println(input);
				}
			}
			
			
		}
	}

}
