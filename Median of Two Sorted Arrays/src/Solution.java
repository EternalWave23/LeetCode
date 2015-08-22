
public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;

		if ((m + n) % 2 == 1) {
			return (double)findKth(nums1, nums2, (m + n) / 2, 0, m - 1, 0, n-1);
		} else {
			return (findKth(nums1, nums2, (m + n) / 2, 0, m - 1, 0, n-1) + 
					findKth(nums1, nums2, (m + n) / 2 - 1, 0, m - 1, 0, n-1)) / 2;
		}
    }
	
	private double findKth(int[] a, int[] b, int k, int aStart, int aEnd, int bStart, int bEnd) {
		int aLen = aEnd - aStart + 1;
		int bLen = bEnd - bStart + 1;
		
		if (aLen == 0) {
			return b[bStart + k];
		}
		if (bLen == 0) {
			return a[aStart + k];
		}
		if (k == 0) {
			return a[aStart] < b[bStart] ? a[aStart] : b[bStart];
		}
		
		int aMid = aLen * k / (aLen + bLen);
		int bMid = k - aMid - 1;
		
		aMid = aMid + aStart;
		bMid = bMid + bStart;
		
		if (a[aMid] > b[bMid]) {
			k = k - (bMid - bStart + 1);
			aEnd = aMid;
			bStart = bMid + 1;
		} else {
			k = k - (aMid - aStart + 1);
			bEnd = bMid;
			aStart = aMid + 1;
		}
		
		return findKth(a, b, k, aStart, aEnd, bStart, bEnd);
	}
}
