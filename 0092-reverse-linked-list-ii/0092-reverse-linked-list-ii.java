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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null) return null;
        ListNode t = new ListNode(0);
        t.next = head;
        ListNode p = t;
        for(int i=0;i<left-1;i++) p = p.next;
        ListNode s = p.next;
        ListNode e = s.next;
        for(int i=0;i<right-left;i++){
            s.next = e.next;
            e.next = p.next;
            p.next = e;
            e = s.next;
        }
        return t.next;
    }
}