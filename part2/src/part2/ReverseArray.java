package part2;

public class ReverseArray {
	public static void main(String[] args) {
		// without using scanner class
		int a[] = { 10, 20, 30, 40, 50, 67, 85, 474 };
		// iterate each every element in array
		// before revere
		System.out.println("before reverse");
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
		// Reverse
		System.out.println("After reverse");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}

	}

}
