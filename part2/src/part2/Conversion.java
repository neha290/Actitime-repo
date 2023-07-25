package part2;

public class Conversion {
	public static void main(String[] args) {
		int i = 10;
		// convert in to string
		// int is a ptimitive datatype
		// string is a non primitve datatype .we use to.string method
		// String s=Integer.toString(i);
		String s = String.valueOf(i);
		System.out.println(s.charAt(0));

		String str = "123";
		// convert string in to int
		int d = Integer.parseInt(str);
		System.out.println(d);

		// double in to string
		double d1 = 23.5;
		// convert in to string
		String s2 = Double.toString(d1);
		System.out.println(s2 + 10);

		// String in to Charater
		String s3 = "hi";
		char ch = s3.charAt(0);
		System.out.println(ch);

	}

}
