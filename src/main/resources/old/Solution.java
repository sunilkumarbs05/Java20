import java.util.*;
import java.util.Scanner;

public class Solution {

public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String b = scan.nextLine();
        scan.close();
        if(b.isEmpty())
	    	   System.out.println("0");
	       
	       else
	       {
	    	   String[] array = b.split("[ !,?\\.\\_'@]+");
		       
		       System.out.println(array.length);
		       
		       for(int i = 0; i < array.length && array[i] != null; ++ i)
		    	   System.out.println(array[i]);
		   }
    }
    
}
