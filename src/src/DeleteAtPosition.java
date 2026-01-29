package src;

public class DeleteAtPosition {
    public static Node deleteAtPosition(Node head, int position) {
        if (head == null) return null;
        if (position == 0) return head.next;
        Node current = head;
        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) return head;
        current.next = current.next.next;
        return head;
    }
}