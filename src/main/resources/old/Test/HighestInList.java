package Test;

public class HighestInList {
	public static void main(String[] args) {
		int highest =4;
		int values[] = {12,3,56,78,2};
		int temp =0;
		for(int i=0;i<highest;i++) {
			for( int j =i+1;j<values.length;j++) {
				if(values[i]<values[j]) {
					temp = values[i];
					values[i] = values[j];
					values[j]=temp;
				}
			}
			
		}
		System.out.println("Highest of "+highest+" is "+values[highest-1]);
	}

}
