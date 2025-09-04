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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int n = 1;
        ListNode t = head;
        while(t.next!=null){
            t = t.next;
            n++;
        }
        t.next = head;
        k = k%n;
        k = n-k;
        while(k-->0) t = t.next;
        head = t.next;
        t.next = null;
        return head;
    }
}