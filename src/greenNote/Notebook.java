package greenNote;

import States.States;
import UserAuthenticator.UserAuthenticator;

public class Notebook {
	
	   private static Notebook instance;
	   private Notebook() {
	      // Exists only to defeat instantiation.
	   }
	   
	   public static void activateNotebook( ) {
		      
			// This will get the password for the note book;
			UserAuthenticator.Login(); // A while loop will keep runing till it get the right id + pw;
			
			/**
			 This helper function choose the state (view notes,insert a note,
			 search for note).# there is other state which is deleting a note you can delete a note
			 after viewing it.
			 */
			States userNoteBook = new States();//States.stateDirecting(); 
			userNoteBook.stateDirecting(); // singelton

		}


	   public static Notebook getInstance() {
	      if(instance == null) {
	         instance = new Notebook();
	      }
	      return instance;
	   }

}
