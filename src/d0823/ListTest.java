package d0823;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {	
		//ArrayList : 순차적으로 넣고 출력이 빠르다.
		List<String> strs = new ArrayList<String>();	//interface 는 메모리 생성X
		//E, T, K, V
		System.out.println(strs.size());
		strs.add("일");
		
		System.out.println(strs.size());
		strs.add("이");
		
		System.out.println(strs.size());
	}
}
