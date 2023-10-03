

class Test5{
	private void draw() {
		System.out.println("TEst5----");
	}
}
public class Test4  extends Test5{
	
	public void draw() {
		System.out.println("Test4----");
	}
	
	public static void main(String[] args) {
		Test5 t = new Test4();
		t.draw();
		
	}

}
