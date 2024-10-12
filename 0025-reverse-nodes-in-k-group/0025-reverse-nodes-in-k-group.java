/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1)
            return head;

        // Dummy node initialization
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = dummy;

        while (ptr != null) {
            ListNode tracker = ptr;

            // Check if there are at least k nodes ahead
            for (int i = 0; i < k && tracker != null; i++) {
                tracker = tracker.next;
            }

            if (tracker == null) {
                break;
            }

            // Reverse the k nodes
            ListNode[] updatedNodes = reverseLinkedList(ptr.next, k);

            ListNode previous = updatedNodes[0];
            ListNode current = updatedNodes[1];

            // Link the reversed part back to the main list
            ListNode lastNodeOfReversedGroup = ptr.next;
            lastNodeOfReversedGroup.next = current;
            ptr.next = previous;
            ptr = lastNodeOfReversedGroup;
        }

        return dummy.next;
    }

    private ListNode[] reverseLinkedList(ListNode head, int k) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        for (int i = 0; i < k; i++) {
            // Temporarily store the next node
            next = current.next;
            // Reverse the current node
            current.next = previous;
            // Before we move to the next node, point previous to the current node
            previous = current;
            // Move to the next node
            current = next;
        }

        // Return the new head and the next pointer for further operations
        return new ListNode[] { previous, current };
    }
}