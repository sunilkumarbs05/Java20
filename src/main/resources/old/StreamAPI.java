import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty())
				.sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(filtered);
		
	}
}
