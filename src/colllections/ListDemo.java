package colllections;

import java.util.HashSet;
import java.util.Set;

public class ListDemo {
	public static void main(String[] args) {
		Set<Integer> sets = new HashSet<Integer>();
		sets.add(10);
		sets.add(20);
		sets.add(10);
		sets.add(40);
		System.out.println(sets);
		System.out.println(sets.size());
		
		Set<String> names = new HashSet<String>();
		names.add("Lokesh");
		names.add("Kiran");
		names.add("murali");
		
		System.out.println(names);
		

	}
}
