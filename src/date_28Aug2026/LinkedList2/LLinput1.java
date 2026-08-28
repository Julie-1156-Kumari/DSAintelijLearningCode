package date_28Aug2026.LinkedList2;
import java.util.Scanner;

public class LLinput1 {

        public static  LLNode takeUserInput(int n) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter " + n + " elements:");

            LLNode head = null, tail = null;

            for (int i = 0; i < n; i++) {
                LLNode newNode = new LLNode(sc.nextInt());
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
