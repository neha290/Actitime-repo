package part2;


public class UniqueValueArray {
	public static void main(String[] args) {
		 int[] arr= {10,20,30};
		// for(int i=0; i<arr.length; i++) {
		////// arr[i]=0;
		// for(int i1:arr) {
		// System.out.println(i1);

		// }
		// }

		
		//removing  3rd element
		
	
		arr[2]=0;
		arr[1]=10;
		arr[0]=20;
		System.out.println(arr[2]);
		System.out.println(arr[1]);
		System.out.println(arr[0]);
		
	}
}