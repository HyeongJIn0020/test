package d0823;

public class ArrayTest3 {
	public static void main(String[] args) {
		String[] strs = new String[5];
		for(int i=0;i<strs.length;i++) {
			strs[i]= (i+1)*10 +"";
//			strs[i]= Integer.toString((i+1)*10);
//			strs[i] = (i+1) + "0";
		}
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
}
