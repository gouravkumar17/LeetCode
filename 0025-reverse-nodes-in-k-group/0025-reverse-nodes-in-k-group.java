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
    public ListNode findK(ListNode s,int k){
        for(int i=1;i<k;i++){
            if(s==null) return s;
            s = s.next;
        }
        return s;
    }
    public ListNode rev(ListNode head){
        ListNode f = head;
        ListNode b = null;
        while(head!=null){
            f = f.next;
            head.next = b;
            b = head;
            head = f;
        }
        return b;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode s = head;
        ListNode kth = findK(s,k);
        if(kth!=null) head = kth;
        else return head;
        ListNode pS = null;
        while(kth!=null){
            ListNode nS = kth.next;
            kth.next = null;
            ListNode prev = rev(s);
            if(pS!=null) pS.next = prev;
            pS = s;
            s = nS;
            kth = findK(s,k);
        }
        pS.next = s;
        return head;
    }
}