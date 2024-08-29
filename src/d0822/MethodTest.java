package d0822;

class MethodTest {
	int i;
	
	static void test() {
		//void: 아무것도 리턴하지 않는다
	}
	
	static int test1() {
		//int를 리턴하지 않아서 오류
		return 1;
	}
	
	public static void main(String[] args) {
		int i = test1() + 1;
		System.out.println(i);
//		void a = test(); // void는 변수 앞에 선언 x
	}
}
