package src;

public class SearchCircularLinkedList {
    public static boolean search(CNode head, int target) {
        if (head == null) return false;
        CNode current = head;
        do {
            if (current.data == target) return true;
            current = current.next;
        } while (current != head);
        return false;
    }
}