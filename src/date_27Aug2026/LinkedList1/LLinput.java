package date_27Aug2026.LinkedList1;

import java.util.Scanner;

public class LLinput {
    public static class LLNode1 {
        public int value;
        public LLNode1 next;

        public LLNode1 (int value){
            this.value = value;
            this.next = null;
        }
    }
    public static LLNode1 takeInput(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");

        LLNode1 head = null, tail = null;

        for (int i = 0; i < n; i++) {
            LLNode1 newNode = new LLNode1(sc.nextInt());
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }
}
