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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l = 0;
        ListNode temp = head;
        while(temp!=null){
            l++;
            temp = temp.next;
        }
        if(l==n) return head.next;
        temp = head;
        for(int i=0;i<l-n-1;i++) temp = temp.next;
        temp.next = temp.next.next;
        return head;
    }
}