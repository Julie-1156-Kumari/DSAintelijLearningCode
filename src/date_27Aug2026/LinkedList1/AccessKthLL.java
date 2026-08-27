package date_27Aug2026.LinkedList1;
import java.util.Scanner;

public class AccessKthLL {
    public static int accessKLL(LLinput.LLNode1 head){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a Number less than 5 and not negative: ");
        int K = sc1.nextInt();

        LLinput.LLNode1 curr = head;
        int i = 0;
        while(i < K){
            curr = curr.next;
            i++;

        }
        System.out.print(K + "th position value of Linked List: ");
        return curr.value;
    }
}
