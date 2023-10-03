
public class RemoveWhitespace {
	public static void main(String[] args) {
		
		//Solution 1
		String value= "welecome to India";
		char charArr[] = value.toCharArray();
		int count=0;
		for(int i=0;i<charArr.length;i++) {
			if(charArr[i] !=' ') {
				charArr[count++]=charArr[i]; 
			}
		}
		System.out.println(String.valueOf(charArr,0,count));
		
		//Solution 2
		String value1= "welecome to India";
		char charArr1[] = value.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<charArr1.length;i++) {
			if(charArr1[i] !=' ') {
				stringBuilder.append(charArr1[i]);
			}
		}
		System.out.println(stringBuilder.toString());
		
	}

}
