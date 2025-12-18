/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
      ListNode f = head;
      ListNode s = head;
      while(f!=null && s!=null && s.next!=null){
        f = f.next;
        s = s.next.next;
        if(f==s) return true;
      }
      return false;
    }
}