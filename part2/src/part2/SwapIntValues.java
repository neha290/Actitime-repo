package part2;

public class SwapIntValues {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.println("The value of x before swap" + x);
		System.out.println("The value of y before swap" + y);
		// swap the value with using third variable
		int t;
		t = x; // here value of t will be 10
		x = y; // here x will be x will be 5;
		y = t;

		System.out.println("The valuue of x after swap" + x);
		System.out.println("The vale of y after swap" + y);
		// swap without using third variable

		x = x + y;    // 15
		y= x-y;
		x= x-y;

		

		System.out.println("The vale of x after swap without using third variable " + x);
		System.out.println("The vale of y after swap without using third variable " + y);

	}

}
