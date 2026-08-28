package date_28Aug2026.LinkedList2;

public class InsertNodeAtKthPosition {
    public static LLNode InsertNodeAtKthPosition(LLNode head, LLNode newNode, int k){
        LLNode curr = head;
        LLNode temp;
        int index = 0;
        while (curr != null){
            if (index == k-1){
                temp = curr.next;
                curr.next = newNode;
                newNode.next = temp;
                System.out.println("Inserted a new node at "+ k +"th position :" + newNode.value);
            }
            curr = curr.next;
            index++;
        }
        return curr;
    }
}
