/**
 * Definition for singly-linked list.
 */
class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
// Classification: Easy
class Solution {
  public ListNode reverseList(ListNode head) {
      if (head == null || head.next == null) {
          return head;
      }

      ListNode prev = new ListNode(head.val);
      head = head.next;
      ListNode curr = prev;

      while (head != null) {
          curr = new ListNode(head.val);
          head = head.next;
          curr.next = prev;
          prev = curr;
      }
      return curr;
  }
}