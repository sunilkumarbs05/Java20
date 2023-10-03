import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Test {
	public static void main(String[] args) {

		/*
		 * Predicate<String> startWithJ = s -> s.startsWith("J"); Predicate<String>
		 * length4 = s -> s.length() > 4;
		 * 
		 * List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		 * languages.stream().filter(startWithJ.or(length4)).forEach(System.out::println
		 * );
		 */
		/*
		 * List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		 * List<Integer> list=costBeforeTax.stream().map((cost) -> cost + 12 *
		 * cost).collect(Collectors.toList()); list.forEach(System.out::println);
		 */
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		double bill = costBeforeTax.stream().reduce((sum, cost) -> sum + cost).get();
		System.out.println("Total : " + bill);
		
		
		
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
		IntSummaryStatistics stats = primes.stream().mapToInts((x) -> x).summaryStatistics();

	}
}
