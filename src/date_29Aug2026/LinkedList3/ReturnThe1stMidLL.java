package date_29Aug2026.LinkedList3;

public class ReturnThe1stMidLL {
    public static int returnThe1stMidLL1(LLNode3 head) {
        System.out.println("Approach 1: ");
        System.out.println("Iterate and calculate the size of Linked List and get the mid value");
        LLNode3 curr = head;
        if(curr == null) return -1;
        int size = 0;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        curr = head;
        if(size%2 == 0){
            for (int i = 0; i < ((size/2) - 1); i++) {
                curr = curr.next;
            }
        }else{
            for (int i = 0; i < size/2; i++) {
                curr = curr.next;
            }
        }
        return curr.value;

    }
}
