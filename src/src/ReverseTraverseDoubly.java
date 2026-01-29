package src;

public class ReverseTraverseDoubly {
    public static void traverseReverse(DNode head) {
        DNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
}