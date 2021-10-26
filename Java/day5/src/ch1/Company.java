package ch1;

public class Company {
	//싱글톤 패턴 
	//1. 생성자 private로 만든다.
	private Company() {
		// TODO Auto-generated constructor stub
	}

	//2. static 변수를 활용해서 내부에서 객체를 생성한다.
	private static Company instance = new Company();
	
	//3. 외부에서 유일한 인스턴스를 참조할 수 잇는 public 메서드를 제공 해야 한다.
	public static Company getInstance() {
		//방어적 코드가 들어간다.
		return instance;
	}
}
