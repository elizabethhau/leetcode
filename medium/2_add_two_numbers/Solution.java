
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//  import java.lang.Math;
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      // create listnode to hold the resulting linked list
      ListNode dummyHead = new ListNode(0);
      ListNode tail = dummyHead; // pointer for the tail of the linked list
      int carry = 0;
      
      // loop until L1 is empty, L2 is empty, and there are no more carries
      while (l1 != null || l2 != null || carry != 0) {
          int digit1 = l1 != null ? l1.val : 0;
          int digit2 = l2 != null ? l2.val : 0;
          int sum = digit1 + digit2 + carry;
          int nodeVal = sum % 10; // the value of the current node
          carry = sum / 10; // any value that needs to be carried
          ListNode currentNode = new ListNode(nodeVal);
          tail.next = currentNode;
          tail = currentNode;
          l1 = l1 != null ? l1.next : null;
          l2 = l2 != null ? l2.next : null;
      }
      return dummyHead.next;


      // long l1Num = this.getNumFromListNode(l1);
      // long l2Num = this.getNumFromListNode(l2);
      // long sum = l1Num + l2Num;
      // String sumString = Long.toString(sum);
      // StringBuilder sb = new StringBuilder(sumString);
      // sb = sb.reverse();

      // int digit = sb.charAt(0) - '0'; // to convert char to int value, subtract by the char value of '0'
      // ListNode output = new ListNode(digit);
      // ListNode res = output;
      
      // for (int i = 1; i < sb.length(); i++) {
      //     digit = sb.charAt(i) - '0';
      //     // System.out.println("digit is:" + digit);
      //     output.next = new ListNode(digit);
      //     output = output.next;
      // }
      // output.next = null;
      // return res;
  }

  // private long getNumFromListNode(ListNode ln) {
  //     long num = ln.val;
  //     int index = 1;
  //     while (ln.next != null) {
  //         ln = ln.next;
  //         num += ln.val * Math.pow(10, index);
  //         index++;
  //     }
  //     System.out.println("num is: " + num);
  //     return num;
  // }
}