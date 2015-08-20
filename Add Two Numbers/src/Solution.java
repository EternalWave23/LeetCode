
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode rst = new ListNode((l1.val + l2.val) % 10);
    	boolean jinwei = l1.val + l2.val > 9;
    	l1 = l1.next;
    	l2 = l2.next;
    	ListNode cur = rst;
    	while (l1 != null || l2 != null) {
    		int sum = 0;
    		if (l1 != null) {
    			sum += l1.val;
    		}
    		if (l2 != null) {
    			sum += l2.val;
    		}
    		if (jinwei) {
    			sum++;
    		}
    		cur.next = new ListNode(sum % 10);
    		cur = cur.next;
    		jinwei = sum > 9;
    		if (l1 != null) {
    			l1 = l1.next;
    		}
    		if (l2 != null) {
    			l2 = l2.next;
    		}
    	}
    	if (jinwei) {
    		cur.next = new ListNode(1);
    	}
        return rst;
    }
}