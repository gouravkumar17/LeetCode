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
    public ListNode reverseList(ListNode head) {
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
}