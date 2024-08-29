package d0823;

public class ArrayTest5 {
	public static void main(String[] args) {
		int[][] nums = new int[2][2];	//2차원 배열
		
		int n=1;
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				nums[i][j] = n++;
			}
		}
	}
}
