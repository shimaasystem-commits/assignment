package src;

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class LinkedListConcat {
    public static Node concatenate(Node list1, Node list2) {
        if (list1 == null) return list2;
        Node current = list1;
        while (current.next != null) {
            current = current.next;
        }
        current.next = list2;
        return list1;
    }
}
