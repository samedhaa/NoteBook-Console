package Main;

import greenNote.Notebook;

public class Main {

	public static void main(String[] args) {
		
		Notebook notebook = Notebook.getInstance();//.demoMethod(); // calling singelton
		notebook.activateNotebook();
		
	}

}
