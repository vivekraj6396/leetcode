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
    public ListNode oddEvenList(ListNode head) {
        ListNode  odd=new ListNode(0);
        ListNode even=new ListNode(0);
        ListNode p1=odd;
        ListNode p2=even;
        int pos=1;
        while (head != null){
            if (pos % 2 != 0) {
                p1.next = head;
                p1 = p1.next;
            } else {
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
            pos++;
        }
        p2.next = null;
        p1.next = even.next;
        return odd.next;
    }
}