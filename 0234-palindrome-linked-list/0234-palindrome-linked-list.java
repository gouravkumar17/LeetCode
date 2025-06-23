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
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode p = null;
        ListNode s = null;
        while(temp!=null){
            s = temp.next;
            temp.next = p;
            p = temp;
            temp = s;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f.next!=null && f.next.next!=null){
            s = s.next;
            f = f.next.next;
        }
        ListNode temp = reverse(s.next);
        s.next = temp;
        ListNode p1 = head;
        ListNode p2 = s.next;
        while(p2!=null){
            if(p1.val!=p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}