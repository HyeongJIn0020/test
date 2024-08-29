package d0822;

public class StaticTest {
	static int age = 10;
	String name = "홍길동";
	final int EXAM = 10;	//final은 변수를 대문자로 
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		StaticTest.age = 20;
		
		StaticTest st2 = new StaticTest();
		System.out.println(st2.age);
		
		//소문자 ()o 메소드
		//소문자 ()x 변수
		
		
	}
}
