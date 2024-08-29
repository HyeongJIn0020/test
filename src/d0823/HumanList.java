package d0823;

import java.util.ArrayList;
import java.util.List;

public class HumanList {
	public static void main(String[] args) {
		List<Human> people = new ArrayList<Human>();
		
		Human h = new Human("춘식이", 30, "남");
//		people.add(h); == people.add(new Human("춘식이", 30, "남")); 
		people.add(new Human("춘식", 30, "남"));
		people.add(new Human("만식", 15, "남"));
		people.add(new Human("춘자", 25, "여"));
		
		System.out.println(people);
		
		for(int i=0; i<people.size(); i++) {
			System.out.println(people.get(i));
		}
	}
}
