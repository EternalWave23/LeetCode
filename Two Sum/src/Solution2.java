import java.util.*;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> record = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		if (record.containsKey(nums[i])) {
    			return new int[]{record.get(nums[i]) + 1, i + 1};
    		} else {
    			record.put(target - nums[i], i);
    		}
    	}
        return new int[]{2, 3};
    }
}
