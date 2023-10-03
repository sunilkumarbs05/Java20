import java.util.Collections;
import java.util.LinkedList;

public class Temp {

	public static void main(String[] args) {
		LinkedList<String> linked = new LinkedList<>();
		linked.add("Hello");
		linked.add("Kumar");
		linked.add("A");
		linked.add("B");
//		Collections.sort(linked, (o1, o2) -> {
//			return o1.compareTo(o2);
//		});
		
		Collections.sort(linked);
		System.out.println(linked);

	}
}
