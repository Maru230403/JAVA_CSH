package Day19.Map;

import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("first", new Integer(100));
		map.put("second", "Hello World!!");
		map.put("third", new MyStudent());
		map.put("fourth", null);
		Set set = map.keySet(); //모든 키를 가지고 온다.
		Collection col = map.values(); // 모든 값을 가지고 온다.
		
		Object[] obj = set.toArray();
		System.out.println("키를 출력합니다.");
		for(int i = 0; i <obj.length; i++) {
			System.out.println(obj[i]);
		}
		System.out.println("\n키를 이용해서 값을 출력합니다.");
		for(int i = 0; i < obj.length; i++) {
			String key = (String)obj[i];
			System.out.println(map.get(key)); // 키로 값을 가져온다.
		}
		System.out.println("\n값을 출력합니다");
		obj = col.toArray();
		for( int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}

}
