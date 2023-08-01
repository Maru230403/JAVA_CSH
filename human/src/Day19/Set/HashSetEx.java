package Day19.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("servlet");
		set.add("spring");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		set.remove("jdbc");
		System.out.println("개수 : " + set.size());
		
		it = set.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		set.clear();
		if(set.isEmpty())System.out.println("비어있음");
	}
}
