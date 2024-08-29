package d0823;

public class ArrayTest {
	public static void main(String[] args) {
		int[] nums = new int[7]; //참조형
		for(int i=0;i<7;i++) {
			nums[i]=i+1;
		}
		for(int i=0;i<7;i++) {
			System.out.println(nums[i]);
		}
	}
}
