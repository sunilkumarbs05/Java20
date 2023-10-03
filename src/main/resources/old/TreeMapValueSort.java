import java.util.TreeMap;

public class TreeMapValueSort {
	
	public static void main(String[] args) {
		TreeMap< String, String> treeMap = new TreeMap<>();
		treeMap.put("Key1", "Value3");
		treeMap.put("Key2", "Value2");
		treeMap.put("Key3", "Value1");
		System.out.println(treeMap);
		
		TreeMap<String, String> sortTreeMap = new TreeMap<>((s1,s2)->{
			return s2.compareTo(s1);
		});
		
		sortTreeMap.put("Key1", "Value3");
		sortTreeMap.put("Key2", "Value2");
		sortTreeMap.put("Key3", "Value1");
		sortTreeMap.put("2", "ui");
		System.out.println(sortTreeMap);
		
	}

}
