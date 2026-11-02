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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
            return;
        ListNode slow =head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next =null;
        ListNode prev = null;
        while(curr!=null)
        {
            ListNode next = curr.next;
            curr.next =prev;
            prev=curr;
            curr=next;
        }
        ListNode fi = head;
        ListNode sec= prev;
        while(sec!=null)
        {
            ListNode temp1 =fi.next;
            ListNode temp2=sec.next;
            fi.next=sec;
            sec.next=temp1;
            fi=temp1;
            sec=temp2;
        }
    }
}