import java.io.IOException;
import java.sql.SQLException;

class MyException extends RuntimeException{
	
	
	public MyException(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
}

class MyException1 extends Exception{
	
	
	public MyException1(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
}

class ClassTestExA {
	
	public void M2() {
		ClassTestExB  classTestExB = new ClassTestExB();
		classTestExB.M1();
	}
	
	public void M3() {
		ClassTestExB  classTestExB = new ClassTestExB();
		classTestExB.M2();
	}
	
}

class ClassTestExB {
	
public void M1 () throws MyException {
	
}

public void M2 () throws MyException1 {
}
}


public class ExceptionRuntime {

}
