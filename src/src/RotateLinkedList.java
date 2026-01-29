package src;

public class RotateLinkedList {
    public static Node rotateRight(Node head, int k) {
        if (head == null || k == 0) return head;
        Node current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        current.next = head; // جعلها دائرية مؤقتاً
        k = k % length;
        for (int i = 0; i < length - k; i++) {
            current = current.next;
        }
        head = current.next;
        current.next = null;
        return head;
    }
}