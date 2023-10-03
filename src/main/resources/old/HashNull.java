import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashNull {
public static void main(String[] args) {
	HashMap<String, String> hashMap = new HashMap<String,String>();
	hashMap.put(null, "Value1");
	hashMap.put(null, "Value2");
	for(Map.Entry<String, String> entry: hashMap.entrySet()) {
		System.out.println("Key1:- "+entry.getKey()+" Value:"+entry.getValue());
		int a[] = {1,2,3,4};
		List<int[]> list = new ArrayList<>(Arrays.asList(a));
	}
 }
}
