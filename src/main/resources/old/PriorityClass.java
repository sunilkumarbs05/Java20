import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
interface test{
	public default void display() {
	      System.out.println("display method of MyInterface");
	   }
	public static void display1() {
	      System.out.println("Static method of the interface");
	   }
}


public class PriorityClass  implements test{
	static int i;
	public static void display1() {
	      System.out.println("Static method of the class");
	   }
	@Override
	public  void display() {
		test.super.display();
	      System.out.println("display method of MyInterface--");
	   }
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		strings.stream().limit(10).forEach(System.out::println);
		System.out.println("-----");
		strings.stream().limit(10).forEach(System.out::println);
	}
}
