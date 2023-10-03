import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {

	public static String getSmallestAndLargest(String s, int k) {
		
		String temp = s.substring(0, k);
        String smallest = temp;
        String largest = temp;
        
        for(int i = 1;i<=s.length()-k;i++) {
        	temp = s.substring(i,i+k);
        	if(temp.compareTo(smallest)<0) {
        		smallest= temp;
        	}
        	
        	if(temp.compareTo(largest)>0) {
        		largest=temp;
        	}
        }
        
        return  smallest +"\t"+largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        
      
        System.out.println(getSmallestAndLargest(s, k));
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    }
}
