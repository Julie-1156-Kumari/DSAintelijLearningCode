package date_28Aug2026.LinkedList2;

public class LLmain2 {
    public static void main(String[] args) {
        LLNode head = LLinput1.takeUserInput(5);
        LLNode curr = head;

        System.out.println("-------------------------------------------------");
        while (curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("------------------------------------------------");

        System.out.println("********* Delete kth position **************");
        DeleteKthPosition.deleteKthPosition(head, 2);
        LLNode curr1 = head;
        System.out.println("-------------------------------------------------");
        while (curr1 != null){
            System.out.print(curr1.value + " -> ");
            curr1 = curr1.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("*********************************************");

    }
}
