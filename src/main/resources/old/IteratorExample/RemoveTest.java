package IteratorExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			if (it.next() == "3") {
				it.remove();
			}
		}

		list.stream().forEach(System.out::println);
		System.out.println("-----------------------");
		for (String str : list) {
			if (str == "4") {
				list.remove(str);
			}
		}

		
		list.stream().forEach(System.out::println);
		
		System.out.println("-----------------------");
		Iterator<String> it3 = list.iterator();
		while (it.hasNext()) {
			if (it.next() == "2") {
				list.remove("2");
			}
		}
		list.stream().forEach(System.out::println);
		
		//below also fails
		System.out.println("-----------------------");
		for (String str : list) {
			if (str == "4") {
				list.remove(str);
				list.add("6");
			}
		}
	}

}
