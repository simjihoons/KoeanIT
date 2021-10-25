package ch3;

public class Person {

	// this 란
	// 1. 인스턴스(객체) 자신의 메모리를 가리킨다.
	// 2. 생성자에서 또 다른 생성자를 호출할때 사용할 수 있다..
	// 3. 자신의 주소(참조값,주소값)을 반환 시킬 수 있다.

	String name;
	int age;

	public Person(String name, int age) {
		// 1. 자기 자신을 가리키는 this
		this.name = name;
		this.age = age;
	}

	public Person() {
		// 기본 생성자 에서 다른 생성자를 호출
		this("이름없음", 1);
	}

	public Person getPerson() {
		// 3. 자신의 주소(참조값)을 반환
		// 빌더 패턴을 만들어 낼 수 있다.
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("이름 : " + name + "\n나이 : " + age);
	}

	// main 영역
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.showInfo();
		p1.setName("홍길동");

		// 참조값을 받아서 다른 인스턴스 변수에 주소를 할당해 보자.
		Person p2 = p1.getPerson();
		p2.setName("이순신");

		p1.showInfo();
		p2.showInfo();

	}// end of main

}// end of class
