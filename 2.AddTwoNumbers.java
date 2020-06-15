package pkg;


public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
		if(l1==null && l2 == null)return null;
		ListNode dummy = new ListNode(0);
		ListNode head = dummy;
		int addOne = 0;
		while(l1!=null || l2!=null || addOne!=0) {
			int val1 = l1==null?0:l1.val;
			int val2 = l2==null?0:l2.val;
			int sum = val1+val2+addOne;
			head.next = new ListNode(sum%10);
			addOne = sum/10;
			if(l1!=null)l1 =l1.next;
			if(l2!=null)l2 = l2.next;
			head = head.next;
		}
		return dummy.next;
		
	}
	class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {
			this.val = x;
		}
	}
}
