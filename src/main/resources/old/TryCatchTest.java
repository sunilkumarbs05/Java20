
public class TryCatchTest {
	
	    public static void main(String[] args) {
	        int i = performBusiness();
	        System.out.println(i);

	    }

	    private static int performBusiness() {
	        try {
	            //perform business logic
	        	throw new NullPointerException();
//	            System.out.println("Business executed");
//	            return 5;
	        }catch (Exception ex){
	            System.out.println("Exception");
	           
	            return 6;
	         
	        }finally {
	            System.out.println("Completed");
	            return 7;
	            
	        }
	    }



}
