package ch2;

public class GenericPrinter<T> {// T는 임시(tmep) A,B등 아무꺼나 들어와도됨
	// T,E-element,K-key,V-value 를 주로 많이 사용함
	// 이런 것을 자료형 매개변수 , type paramater라 한다.
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	// toString 오버라이드
	@Override
	public String toString() {
		return material.toString();
	}
	
	
	
}
