package date_26Aug2026.LinkedList;

public class ReverseLL {
    public static LLNode reverseLL(LLNode head){
        LLNode temp = null;
        LLNode prev = null;
        LLNode curr = head;

        while (curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return (head);
    }
}
