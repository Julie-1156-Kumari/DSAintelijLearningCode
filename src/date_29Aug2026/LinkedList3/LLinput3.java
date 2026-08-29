package date_29Aug2026.LinkedList3;
import java.util.Scanner;

public class LLinput3 {

        public static LLNode3 takeUserInput(int n) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter " + n + " elements:");

            LLNode3 head = null, tail = null;

            for (int i = 0; i < n; i++) {
                LLNode3 newNode = new LLNode3(sc.nextInt());
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
