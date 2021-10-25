package ch3;

public class Person {

	// this ��
	// 1. �ν��Ͻ�(��ü) �ڽ��� �޸𸮸� ����Ų��.
	// 2. �����ڿ��� �� �ٸ� �����ڸ� ȣ���Ҷ� ����� �� �ִ�..
	// 3. �ڽ��� �ּ�(������,�ּҰ�)�� ��ȯ ��ų �� �ִ�.

	String name;
	int age;

	public Person(String name, int age) {
		// 1. �ڱ� �ڽ��� ����Ű�� this
		this.name = name;
		this.age = age;
	}

	public Person() {
		// �⺻ ������ ���� �ٸ� �����ڸ� ȣ��
		this("�̸�����", 1);
	}

	public Person getPerson() {
		// 3. �ڽ��� �ּ�(������)�� ��ȯ
		// ���� ������ ����� �� �� �ִ�.
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("�̸� : " + name + "\n���� : " + age);
	}

	// main ����
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.showInfo();
		p1.setName("ȫ�浿");

		// �������� �޾Ƽ� �ٸ� �ν��Ͻ� ������ �ּҸ� �Ҵ��� ����.
		Person p2 = p1.getPerson();
		p2.setName("�̼���");

		p1.showInfo();
		p2.showInfo();

	}// end of main

}// end of class
