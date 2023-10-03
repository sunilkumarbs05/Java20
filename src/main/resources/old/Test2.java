import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test2 {
	public static void main(String[] args) {
//		List<Integer> elements = new ArrayList<>();
//		elements.add(10);
//		int firstElmnt = elements.get(1);
//		System.out.println(firstElmnt);
		String v=null;
		Optional<String> value= Optional.ofNullable(v);
		String vv =value.orElse("SS");
		
		System.out.println(vv);
		
	}
}
