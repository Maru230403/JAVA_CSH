package Day21.IoTest2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class FruitTest2 {
	static HashMap<String,Number> map;
	
	public static void main(String[] args) {
		String[] fruit = {"사과","바나나","귤","수박","사과","사과","귤","수박","수박","바나나","귤","사과","사과","수박","귤","바나나","바나나","사과","귤","귤"};
		String fruitName = null;
		int value = 0;
		boolean isExisted = false;
		
		HashMap<String,Number> map =new HashMap<String,Number>();
		for (int i = 0; i < fruit.length; i++) {
			fruitName = fruit[i];
			Set set = map.keySet();
			Iterator ite = set.iterator();
			while(ite.hasNext()) {
				String name = (String)ite.next();
				if(fruitName.equals(name)) {
					value = (Integer)map.get(name);
					map.put(name, ++value);
					isExisted = true;
					break;				
		}
			}// end while
			
			if(isExisted==false) {	//HashMap에 존재하지 않는경우
				map.put(fruitName, ++value);
			}
			value = 0;
			isExisted = false;
		}//end for
		System.out.println("과일 개수 출력하기");
		System.out.println("====================");
		
		Set set = map.keySet();
		Iterator ite = set.iterator();
		
		while (ite.hasNext()) {
			fruitName =(String)ite.next();
			value =(Integer)map.get(fruitName);
			System.out.println(fruitName + ":" + value + "개");
		}
}
}