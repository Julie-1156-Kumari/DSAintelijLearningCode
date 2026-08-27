package date_27Aug2026.LinkedList1;
import java.util.Scanner;

public class LLmain1 {
    public static void main(String[] args) {
        LLinput.LLNode1 head = LLinput.takeInput(5);
        LLinput.LLNode1 curr = head;

        System.out.println("-------------------------------------------------");
        while (curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("------------------------------------------------");

        System.out.println("-------------------------------------------------");
        System.out.println(AccessKthLL.accessKLL(head));
        System.out.println("-------------------------------------------------");
    }
}
