public class T {

	public static void main(String[] args) {

//		String str1 = "ABC";
//		String str2 = "BC";
		String str1 = "BC";
		String str2 = "BANGALORE";
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		boolean flag = true;
		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				sb1.append(arr1[i]);
			}
			flag = true;
		}
		System.out.println("out");
		System.out.println(sb1.toString());
		flag = true;
		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				sb2.append(arr2[i]);
			}
			flag = true;	
		}
		System.out.println("out");
		System.out.println(sb2.toString());
	}

}
