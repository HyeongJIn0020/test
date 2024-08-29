package d0822;

public class Calc2 {
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	static int multiple(int n1, int n2) {
		return n1*n2;
	}
	
	static int division(int n1, int n2) {
		return n1/n2;
	}
	
	public static void main(String[] args) {
		int result = add(1,3);
		System.out.println(result);
		result = minus(4,1);
		System.out.println(result);
		result = multiple(2,3);
		System.out.println(result);
		result = division(4,2);
		System.out.println(result);
	}
}
