package ch4;

public class ComputerMainTest {

	public static void main(String[] args) {
		Computer c1 = new DeskTop();
		
		c1.turnOn();
		c1.display();
		c1.typing();
		c1.turnOff();
	
		System.out.println("==========");
		NoteBook c2 = new MyNoteBook(); 
		c2.turnOn();
		c2.display();
		c2.typing();
		c2.turnOff();
		
	}

}
