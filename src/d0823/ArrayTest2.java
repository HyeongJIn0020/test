package d0823;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] nums = new int[3];	//배열은 방개수를 정해줘야 한다.
		nums[0]=10;
		nums[1]=24;
		nums[2]=38;
		int[] tmps = nums;
		nums = new int[4];	//방을 늘리면 값이 초기화됨
		
		for(int i=0;i<3;i++) {
			nums[i] = tmps[i];
			System.out.println(nums[i] = tmps[i]);
		}
	}
}
