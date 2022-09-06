
public class BasicOperations {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		// AND => 101 AND 111 --> 101 => 5
		System.out.println(a&b);
		// OR => 101 OR 111 --> 111 => 7
		System.out.println(a|b);
		// XOR => 101 XOR 111 --> 010 => 2
		System.out.println(a^b);
		// NOT => 
		System.out.println(~10);
		
		// Shift operator
		// 1010 --> 0101 => 5  ---> (10/(2^1)) = 5
		System.out.println(10>>1);
		// 1010 --> 10100 => 20  ---> (10*(2^1)) = 20
		System.out.println(10<<1);
		
		// Binary of negative integer
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(-5));
		// 5 = 00000...101
		// -5 = 11111...010 + 1 = 1111...011 // Two's complement

	}

}
