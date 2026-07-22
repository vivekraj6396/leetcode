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
    public ListNode sortList(ListNode head) {
        ArrayList <Integer> list= new ArrayList<>();
        ListNode p=head;
        while(p!=null)
        {
            list.add(p.val);
            p=p.next;
        }
        Collections.sort(list);
        p=head;
        int i=0;
        while(p!=null)
        {
            p.val=list.get(i);
            i++;
            p=p.next;
        }
        return head;
    }
}