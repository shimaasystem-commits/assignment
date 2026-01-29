package src;

public class SearchDoublyLinkedList {
    public static boolean search(DNode head, int target) {
        DNode current = head;
        while (current != null) {
            if (current.data == target) return true;
            current = current.next;
        }
        return false;
    }
}
