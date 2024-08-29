package d0822;

public class Access {
	public int i = 1;	//멤버 변수
	public int i2 = 1;
	
	public static void main(String[] args) {
		
		Access a = new Access();
		System.out.println(a.i);
		System.out.println(a.i2);
		
		Access a1 = a;
		System.out.println(a==a1);
	}
}
