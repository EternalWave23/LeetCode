
public class Test {
	
	public static void main(String[] args) {
		Solution2 sl = new Solution2();
		int[] ans = sl.twoSum(new int[]{2, 7, 11, 15}, 9);
		System.out.println(String.format("index1=%d, index2=%d", ans[0], ans[1]));
	}
}
