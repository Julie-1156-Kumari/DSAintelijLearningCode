package date_28Aug2026.LinkedList2;

public class DeleteKthPosition {
    public static LLNode deleteKthPosition(LLNode head , int k)
    {
        LLNode curr = head;
        LLNode prev = null;
        int i=0;
        while ( i < k){
            prev = curr;
            curr = curr.next;
            i++;
        }
        if (curr == head){
            return head;
        }
        prev.next = curr.next;
        curr.next = null;
        System.out.println("Deleted " + k +"th Position Node Successfully: " + curr.value);

        return head;
    }
}
