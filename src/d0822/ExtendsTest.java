package d0822;

class Mother{
	public void work() {
		System.out.println("회사에 출근!!");
	}
}

class Son extends Mother{
	public void work() {
		System.out.println("학교에 등교!!");
	}
	public void play() {
		System.out.println("그놈의 롤");
	}
}
public class ExtendsTest extends Object{	//Object 생략
	public static void main(String[] args) {
		Mother m = new Mother();
		m.work();
		if(m instanceof Son) {	//m을 Son이라고 불러도 돼?
			Son s = (Son)m;
			s.play();
		}
	}
}
