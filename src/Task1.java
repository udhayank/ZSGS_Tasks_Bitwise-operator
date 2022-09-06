
public class Task1 {

	public static void main(String[] args) {
		
		System.out.println(isEven(5));
		System.out.println(isEven(4));
		
		// Swap with XOR
		int a = 5;
		int b = 8;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a=" + a + " b=" + b);
		
		// Find duplicate
		int[] arr = {1,2,3,3,4,5,6};
		int min = arr[0];
		int max = arr[0];
		for (int a1:arr) {
			if (a1<min) {
				min = a1;
			}
			if (a1>max) {
				max = a1;
			}
		}
		
		int res = 0;
		for (int i=min; i<=max; i++) {
			res ^= i;
		}
		for (int i=0; i<arr.length; i++) {
			res ^= arr[i];
		}
		System.out.println(res);

	}
	
	static boolean isEven(int n) {
		if ((n&1) == 0) {
			return true;
		}
		return false;
	}
	
	

}
