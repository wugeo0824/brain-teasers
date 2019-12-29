/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int size = 1;
        ListNode pointer = head;
        while(pointer.next != null) {
            pointer = pointer.next;
            size ++;
        }
        ListNode tail = pointer;
        int step = k%size;

        if (step == 0) {
            return head;
        }

        tail.next = head;
        pointer = head;
        for (int i = 0; i<(size - step); i++) {
            pointer = pointer.next;
        }
        ListNode result = pointer.next;
        pointer.next=null;
        return result;
    }
}