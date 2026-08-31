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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first=-1;
        int prev=-1;
        int min=Integer.MAX_VALUE;
        int max=-1;
        ListNode a=head;
        ListNode b=head.next;
        ListNode c=head.next.next;
        int index=1;
        while(c!=null)
        {
            if((b.val>a.val && b.val>c.val) ||
               (b.val<a.val && b.val<c.val))
            {
                if(first==-1)
                {
                    first=index;
                }
                else
                {
                    min=Math.min(min,index-prev);
                    max=index-first;
                }

                prev=index;
            }
            a=b;
            b=c;
            c=c.next;
            index++;
        }
        if(first==-1 || first==prev)
        {
            return new int[]{-1,-1};
        }
        return new int[]{min,max};
    }
}