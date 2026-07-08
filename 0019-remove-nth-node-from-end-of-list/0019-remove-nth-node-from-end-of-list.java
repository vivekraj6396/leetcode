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
        if(head==null)
        {
            return head;
        }
        int size = 0;
        ListNode temp = head;

        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }
        int m=size-n+1;
        if(m == 1)
        {
            head = head.next;
            return head;
        }
        int i=1;
        ListNode p1=head;
        while(i<m-1)
        {
            p1=p1.next;
            i++;
        }
        p1.next=p1.next.next;
        return head;
    }
}