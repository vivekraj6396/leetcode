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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while(count>=k) {
            ListNode curr=prev.next;
            ListNode next=null;
            ListNode first=curr;
            for(int i=0;i<k;i++) {
                next=curr.next;
                curr.next=prev.next;
                prev.next=curr;
                curr=next;
            }
            first.next=curr;
            prev=first;
            count=count-k;
        }
        return dummy.next;
    }
}