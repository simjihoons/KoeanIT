package ch3;

class A {
	int num1;
	int num2;
	int num3;

}

class B {
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
}

class C extends A {
	int num4;
	int num5;

}

public class MainTest1 {

	public static void main(String[] args) {
		C c = new C();

		c.num1 = 1;
		c.num2 = 2;
		c.num3 = 3;
		c.num4 = 4;
		c.num5 = 5;

	}

}
