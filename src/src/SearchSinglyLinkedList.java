package src;

public class SearchSinglyLinkedList {
    public static int search(Node head, int target) {
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.data == target) return position;
            current = current.next;
            position++;
        }
        return -1;
    }
}