package ch3;

public interface Calc {
	// (public static final) 이 생략 된 상태
	double PI = 3.14;
	int ERROR = -99999;

	// 추상메서드
	int add(int num1, int num2);

	int substract(int num1, int num2); // -

	int times(int num1, int num2); // *

	int divide(int num1, int num2); // /


}
