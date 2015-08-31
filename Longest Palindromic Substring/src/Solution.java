
public class Solution {
	public String longestPalindrome(String s) {
		String t = insert(s);
		int[] p = new int[t.length()];
		int c = 0; // current center
		int r = 0; // current right bound
		for (int i = 0; i < t.length(); i++) {
			int iMirror = 2 * c - i;
			p[i] = r > i ? Math.min(r - i, p[iMirror]) : 0;
			while (i + p[i] + 1 < t.length() && i - p[i] - 1 >= 0
					&& t.charAt(i + p[i] + 1) == t.charAt(i - p[i] - 1)) {
				p[i]++;
			}
			if (i + p[i] > r) {
				c = i;
				r = i + p[i];
			}
		}
		
		int maxC = 0;
		for (int i = 0; i < t.length(); i++) {
			if (p[i] > p[maxC]) {
				maxC = i;
			}
		}
		return t.substring(maxC - p[maxC], maxC + p[maxC]).replace("#", "");
    }
	
	private String insert(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append("#");
			sb.append(s.charAt(i));
		}
		sb.append("#");
		return sb.toString();
	}
}
