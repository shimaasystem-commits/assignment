package src;

class DNode {
    int data;
    DNode prev, next;
    DNode(int data) { this.data = data; }
}

public class RemoveDuplicatesDoubly {
    public static DNode removeDuplicates(DNode head) {
        DNode current = head;
        while (current != null) {
            DNode runner = current.next;
            while (runner != null) {
                if (runner.data == current.data) {
                    if (runner.next != null) runner.next.prev = runner.prev;
                    if (runner.prev != null) runner.prev.next = runner.next;
                }
                runner = runner.next;
            }
            current = current.next;
        }
        return head;
    }
}