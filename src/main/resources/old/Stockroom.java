import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class Stockroom {

	static int  k=0;
	
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		String nValues;
		String value ;
		int top;
		String tc = scanner.nextLine();
		for (int i = 0; i < Integer.parseInt(tc); i++) {
			 nValues = scanner.nextLine();
			Map<String, Integer> map = new TreeMap<>();
			for (int j = 0; j < Integer.parseInt(nValues); j++) {
				 value = scanner.nextLine();
				if (value.startsWith("top ")) {
	top = Integer.parseInt(value.substring(value.length() - 1));
					List<Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
					Collections.sort(list,(o1,o2) -> {return o2.getValue().compareTo(o1.getValue());});
					printValues(list,top);	
					map.clear();
				} else {
					if (map.containsKey(value)) {
						map.put(value, map.get(value) + 1);
					} else {
						map.put(value, 1);
					}
				}
			}
		}
		scanner.close();
	}

	private static void printValues(List<Entry<String, Integer>> entryList, int top) {
		for (Entry<String, Integer> entry : entryList) {
			if(k==0) {
				System.out.println();
				k++;
			}
			if (top > 1) {
				System.out.print(entry.getKey() + " ");
				top--;
			} else if (top == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
