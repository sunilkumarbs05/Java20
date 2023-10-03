
class Test7 {
	public void draw() {
		System.out.println("TEst5----");
	}
}


public class Test6 extends Test7 {
	private void draw() {
		System.out.println("Test4----");
	}
	public static void main(String[] args) {
		Test7 t = new Test6();
		t.draw();
		
	}
}
