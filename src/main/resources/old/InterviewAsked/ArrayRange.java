package InterviewAsked;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayRange {
	
	public static void main(String[] args) {
		
		
		System.out.println(IntStream.range(10, 11)
			      .boxed()
			      .collect(Collectors.toList()));
		
		System.out.println(getNumbersInRange(4,7));
		
		int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(getNumbersInRange(arr,4,11));
		
		
		System.out.println(getNumbersUsingIntStreamIterate(4,11));
		
	}
	 static List<Integer> getNumbersInRange(int start, int end) {
	    List<Integer> result = new ArrayList<>();
	    for (int i = start; i < end; i++) {
	        result.add(i);
	    }
	    return result;
	}
	 
	 static List<Integer> getNumbersInRange(int array[], int start, int end) {
		    List<Integer> result = new ArrayList<>();
		    
		    if(array.length+1>=end) {
		    	for (int i = start-1; i < end-1; i++) {
			        result.add(array[i]);
			    }
		    }
		    return result;
		}
	 
	 public static List<Integer> getNumbersUsingIntStreamIterate(int start, int limit) {
		    return IntStream.iterate(start, i -> i + 1)
		      .limit(limit)
		      .boxed()
		      .collect(Collectors.toList());
		}
	 
	 
	 
}
