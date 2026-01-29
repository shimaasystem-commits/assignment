package src;

public class DeleteFromCircularList {
    public static CNode deleteAtPosition(CNode head, int position) {
        if (head == null) return null;
        CNode current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        if (current.next == head) {
            head = head.next;
        }
        current.next = current.next.next;
        return head;
    }
}