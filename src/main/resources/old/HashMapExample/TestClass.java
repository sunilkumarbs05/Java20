package HashMapExample;

public class TestClass {
	public static void main(String args[]) {
		int arr[] = { 10, 343, 54, 2 };
		int n = arr.length;
		int temp = 0;
		System.out.println("Before ");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println("\nAfter ");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}
}