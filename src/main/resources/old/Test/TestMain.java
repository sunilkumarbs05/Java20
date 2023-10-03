package Test;

public class TestMain {
	
	public static void main(String[] args) {
		int [] a1= {10,20,30};
		int [] a2= {10,20,30,40,80};
		
		
		
		
	}
	
	public boolean accept(int a1[], int a2[]) {
		
		for(int i=0; i< a1.length; i++) {
			for(int j=0; j< a2.length; j++) {
				
				if(a1[i]==a2[j]) {
					return false;
				}
			}
		}
		
		
		return true;
	}

}
