package src;

public class FindIndexInLinkedList {
    public static int findIndex(Node head, int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
}