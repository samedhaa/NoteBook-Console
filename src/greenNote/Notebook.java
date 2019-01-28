package greenNote;


public class Notebook {


	public static void main(String[] args) {
		
		// This will get the password for the note book;
		UserLogin.Login(); // A while loop will keep runing till it get the right id + pw;
		
		/**
		 This helper function choose the state (view notes,insert a note,
		 search for note).# there is other state which is deleting a note you can delete a note
		 after viewing it.
		 */
		States userNoteBook = new States();//States.stateDirecting(); 
		userNoteBook.stateDirecting(); // singelton

	}
	
}
