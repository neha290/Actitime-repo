package part2;

public class Auto {
 public static void main(String[] args) {
	int x=10;
	int y=5;
	x = x + y;    // 15
	y= x-y;
	x= x-y;

	

	System.out.println("The vale of x after swap without using third variable " + x);
	System.out.println("The vale of y after swap without using third variable " + y);

}
}

