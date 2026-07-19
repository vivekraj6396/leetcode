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
        if(k==0||head==null||head.next==null)
        {
            return head;
        }
        int len=0;
        ListNode temp=head;
        while(temp!=null) {
            len++;
            temp=temp.next;
        }
        k=k%len;
        if(k==0) {
            return head;
        }
        ListNode p1=head;
        ListNode p2=null;
        while(p1.next!=null)
        {
            p2=p1;
            p1=p1.next;
        }
        p2.next=null;
        p1.next=head;
        head=p1;
        return rotateRight(head,k-1);
    }
}