package StringExample;

public class StringBufferExample {
	
	public static void main(String[] args) {
		System.out.println("------------ String Literal equal check -------------");
		String s1 ="Sunil";
		String s2 ="Sunil";
		
		if(s1.equals(s2)) {
			System.out.println("String literal: equal");
		} else {
			System.out.println("String literal: Not equal");
		}
		
		System.out.println("------------ String Class equal check -------------");

		String s1Class = new String("Sunil");
		String s2Class =new String("Sunil");
		if(s1Class.equals(s2Class)) {
			System.out.println("String Class: equal");
		} else {
			System.out.println("String Class: Not equal");
		}
		
		System.out.println("------------  StringBuffer equal check -------------");

		StringBuffer buffer1 = new StringBuffer("Apple");
		StringBuffer buffer2 = new StringBuffer("Apple");
		if(buffer1.equals(buffer2)) {
			System.out.println("String buffer: equal");
		} else {
			System.out.println("String buffer: Not equal");
		}
		System.out.println("------------  StringBuilder equal check -------------");

		
		StringBuilder builder1 = new StringBuilder("Apple");
		StringBuilder builder2 = new StringBuilder("Apple");
		if(builder1.equals(builder2)) {
			System.out.println("SStringBuilder: equal");
		} else {
			System.out.println("StringBuilder: Not equal");
		}
		
		System.out.println("------------  StringBuilder  address equal check -------------");
		
		if(builder1.equals(builder1)) {
			System.out.println("String buffer: equal");
		} else {
			System.out.println("String buffer: Not equal");
		}
		
		System.out.println("------------  StringBuilder  address equal check == operator -------------");
		if(builder1 ==builder1) {
			System.out.println("String buffer: equal");
		} else {
			System.out.println("String buffer: Not equal");
		}
		
	}

}
