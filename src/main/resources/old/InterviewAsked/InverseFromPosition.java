package InterviewAsked;

public class InverseFromPosition {
	
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9,10};
		int position=5;
		inverse(a,position);
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	private static void inverse(int[] a, int p) {
		int temp;
		for(int k=p,j=0;k<a.length; k++,j++) {
			temp = a[j];
			a[j]=a[k];
			a[k]=temp;
			
		}
		
	}

}
