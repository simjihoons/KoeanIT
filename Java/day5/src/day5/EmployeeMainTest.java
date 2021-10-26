package day5;

public class EmployeeMainTest {

	public static void main(String[] args) {
//		Employee test1;
//		test1.getEmployeeId(); // 일반 메서드
		
//		int temp = Employee.getSerialNum(); //static 메서드
//		System.out.println(temp);
		
//		Employee e1 = new Employee();
//		System.out.println(e1.serialNum);
//		System.out.println(e1.getEmployeeId());
//				
//		Employee e2 = new Employee();
//		Employee e3 = new Employee();
//		Employee e4 = new Employee();
//		Employee e5 = new Employee();
//		Employee e6 = new Employee();
//		
//		System.out.println(e5.getEmployeeId());
//		System.out.println(e2.getEmployeeId());
//		System.out.println(e3.getEmployeeId());
		
		// static 변수 , 멤버 변수 , 지역 변수 , ---> 메모리 위치 확인
		// employee1~5 : 인스턴스 변수로 접근해서 getSerialNum() 사용
		Employee e1 = new Employee();
		System.out.println(e1.getSerialNum()); 
	
		Employee e2 = new Employee();
		System.out.println(e2.getSerialNum()); 
	
		Employee e3 = new Employee();
		System.out.println(e3.getSerialNum()); 
	
		Employee e4 = new Employee();
		System.out.println(e4.getSerialNum()); 
	
		Employee e5 = new Employee();
		System.out.println(e5.getSerialNum()); 
		
		// 클래스 이름으로 접근해서 getSerialNum() 사용
		int sE1 = Employee.getSerialNum(); //static 메서드
		System.out.println(sE1);
		
		int sE2 = Employee.getSerialNum(); //static 메서드
		System.out.println(sE2);
		
		int sE3 = Employee.getSerialNum(); //static 메서드
		System.out.println(sE3);
		
		int sE4 = Employee.getSerialNum(); //static 메서드
		System.out.println(sE4);
		
		int sE5 = Employee.getSerialNum(); //static 메서드
		System.out.println(sE5);
		
	}

}
