package src;

class CNode {
    int data;
    CNode next;
    CNode(int data) { this.data = data; }
}

public class InsertInCircularList {
    public static CNode insertAtPosition(CNode head, int data, int position) {
        CNode newNode = new CNode(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        CNode current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }
}