package api.util.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("6");
		list.add("3");
		list.add("2");
		list.add("5");
		
		ListIterator<String> it =list.listIterator(list.size());
		
		System.out.println("역방향 출력");
		while (it.hasPrevious()) {
			System.out.println(it.previous()+"\t");
			
		}
		
	}
}
