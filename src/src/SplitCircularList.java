package src;

public class SplitCircularList {
    public static CNode[] split(CNode head) {
        CNode[] halves = new CNode[2];
        if (head == null) return halves;
        CNode slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        halves[0] = head;
        halves[1] = slow.next;
        slow.next = head; // جعل النصف الأول دائري
        if (fast.next == head) {
            fast.next = halves[1];
        } else {
            fast.next.next = halves[1];
        }
        return halves;
    }
}