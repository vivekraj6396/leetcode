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
        HashSet<Integer> set=new HashSet<>();
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode p1=head;
        while(p1.next!=null)
        {
            if(p1.val==p1.next.val)
            {
                set.add(p1.val);
                p1.next=p1.next.next;
            }
            else
            p1=p1.next;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        p1=head;
        while(p1!=null)
        {
            if(set.contains(p1.val)){
                prev.next=p1.next;
                p1=p1.next;
            }
            else
            {
                prev=p1;
                p1=p1.next;
            }
            
        }
        return dummy.next;
    }
}