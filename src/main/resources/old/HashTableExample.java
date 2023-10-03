import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableExample {
	
	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<>();
		map.put("string1", "1");
		map.put("string2", "2");
		map.put("string3", "3");
		map.put(null, "3");
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
			iterator.remove();
		}
		 
		iterator = map.keySet().iterator();
		System.out.println("Yes---");
		while(iterator.hasNext()) {
			System.out.println("Yes---");
			System.out.println(map.get(iterator.next()));
			iterator.remove();
		}
		
	}

}
