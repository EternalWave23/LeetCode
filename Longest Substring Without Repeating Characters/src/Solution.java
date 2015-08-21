
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 0) {
			return 0;
		}
		int max = 1;
		
		int start = 0, end = 0;
		boolean[] exist = new boolean[100];
		int[] position = new int[100];
		
		char[] chars = s.toCharArray();
		
		exist[chars[0] - ' '] = true;
		
		for (int i = 1; i < chars.length; i++) {
			if (exist[chars[i] - ' ']) {
				for (int j = start; j < position[chars[i] - ' ']; j++) {
					exist[chars[j] - ' '] = false;
				}
				start = position[chars[i] - ' '] + 1;
			} else {
				exist[chars[i] - ' '] = true;
				
			}
			position[chars[i] - ' '] = i;
			end++;
			if (end - start + 1 > max) {
				max = end - start + 1;
			}
		}
        return max;
    }
}
