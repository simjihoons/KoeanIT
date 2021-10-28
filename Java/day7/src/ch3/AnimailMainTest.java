package ch3;

public class AnimailMainTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		
		hAnimal.move();
		System.out.println("=================");
		tAnimal.move();
	}

}
