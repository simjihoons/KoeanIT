package ch1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class DataStructureTest3 {

	public static void main(String[] args) {
		Map map0;

		// key 와 value 구조로 데이터를 저장한다.
		// key 값은 중복이 불가하다.
		// value 에 null 값 허용
		// HashMap<K,V>
		HashMap<String, String> map1 = new HashMap<>();

		// null 값을 허용하지 않는다.
		Hashtable<String, String> map2 = new Hashtable<>();

		map1.put("A01", "김포공항정문");
		map1.put("A02", "김포공항후문");
		map1.put("A03", "김포공항로비");
		map1.put("B01", "인천공항정문");
		map1.put("B02", "인천공항후문");
		map1.put("B03", "인천공항로비");
		map1.put("C01", null);

//		map2.put("D01",null);

		System.out.println(map1);
	

		// 값 출력 방법
		System.out.println(map1.get("A01"));
		
		// 삭제 방법
		System.out.println(map1.remove("C01"));
		System.out.println(map1);
		
		// for문 사용 방법
		// java.util.Map.Entry 사용
		for (Entry<String,String> entry  : map1.entrySet()) {
			System.out.println("Key : "+entry.getKey()+"\nValue : "+entry.getValue());
		}
		
		System.out.println("================");
		
		for (String key : map1.keySet()) {
			System.out.println(key+" : "+map1.get(key));
		}
	}

}
