
public class Test {
	public static void main(String[] args) {
		
		ListNode input1 = new ListNode(5);
		//input1.next = new ListNode(4);
		//input1.next.next = new ListNode(3);
		
		ListNode input2 = new ListNode(5);
		//input2.next = new ListNode(6);
		//input2.next.next = new ListNode(4);
		
		Solution sl = new Solution();
		ListNode rst = sl.addTwoNumbers(input1, input2);
		while (rst != null) {
			System.out.println(rst.val);
			rst = rst.next;
		}
	}
}
