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
        int N =0;
        ListNode curr = head;
        ListNode tail = new ListNode();
        while(curr!=null){
            N++;
            if(curr.next==null){
                tail=curr;
            }
            curr=curr.next;
            
        }
        if(N==0){
            return head;
        }
        k=k%N;        
        if(k==0){
            return head;
        }
        int n = N-k;
        ListNode newH = new ListNode();
        ListNode newt = new ListNode();
        curr =head;
        for(int i=1;i<n;i++){
            curr=curr.next;
        }
        newt = curr;
        tail.next=head;
        newH = curr.next;
        newt.next = null;
        return newH;

        
    }
}