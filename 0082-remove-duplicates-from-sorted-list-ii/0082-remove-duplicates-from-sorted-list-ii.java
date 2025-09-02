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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t = head;
        ListNode p = null;
        while(t!=null){
            if(t.next!=null && t.val==t.next.val){
                int v = t.val;
                while(t!=null && t.val==v){
                    t = t.next;
                    if(p!=null) p.next = t;
                    else head = t;
                }
            }
            else{
                p = t;
                t = t.next;
            }
        }
        return head;
    }
}