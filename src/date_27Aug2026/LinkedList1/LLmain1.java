package date_27Aug2026.LinkedList1;

import java.util.Scanner;

public class LLmain1 {
    public static void main(String[] args) {
        LLinput.LLNode1 head = LLinput.takeInput(10);
        LLinput.LLNode1 curr = head;

        System.out.println("-------------------------------------------------");
        while (curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("------------------------------------------------");

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a Number less than 10 and not negative: ");
        int K = sc1.nextInt();

        curr = head;
        int i = 0;
        while(i < K){
            curr = curr.next;
            i++;

        }
        System.out.println("Kth position value of Linked List: " + curr.value);
    }
}
