import java.util.ArrayList;
import java.util.List;

public class TypeInferance {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList();
		arrayList.add("");
		arrayList.forEach(System.out::print);
	}

}
