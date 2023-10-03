package StringExample;

import java.util.HashMap;
import java.util.Map.Entry;

public class ReverseString {
//	public static void main(String[] args) {
//		String value ="Hello sunil";
//		char arr[] = value.toCharArray();
//		char temp;
//		for(int i=0; i<arr.length/2;i++) {
//			temp = arr[i];
//			arr[i] = arr[arr.length-1-i];
//			arr[arr.length-1-i] = temp;
//			
//		}
//			
//		String revers = new String(arr);
//		System.out.println(revers);
//	}

	
	// COunt number of words in string
	
	public static void main(String[] args) {
		String input = "This this is is done by Saket Saket";
		String arr[] = input.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(String value :arr) {
				
			if(map.containsKey(value)) {
				map.put(value, map.get(value)+1);
			} else {
				map.put(value, 1);
			}
		}
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
