package part2;

import java.util.Scanner;

public class ReverseUsingUserInput {

	public static void main(String[] args) {
		// using scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();// here n is the lenth of array
		int a[] = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i< a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}
