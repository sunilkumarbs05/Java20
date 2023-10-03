
public class Test3 {
	{
		System.out.println("class block");

	}
	
	static {
		System.out.println("static block");

	}
	
	Test3(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
	}

}
