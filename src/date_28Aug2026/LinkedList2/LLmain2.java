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

        System.out.println("******** Insert a new node at kth position ********");
        LLNode curr2 = new LLNode(12);
        InsertNodeAtKthPosition.InsertNodeAtKthPosition(head, curr2 ,2);
        curr1 = head;
        System.out.println("-------------------------------------------------");
        while (curr1 != null){
            System.out.print(curr1.value + " -> ");
            curr1 = curr1.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("*********************************************");

        System.out.println("******** Check Palindrome of Given LinkedList ********");
        boolean bool = CheckPalindromeLL.checkPalindromeLL(head);
        System.out.println("Is the Input Given LL is Palindrome using two pointer and array, True or False : " + bool);

        boolean bool1 = CheckPalindromeLL.checkPalindromeLL1(head);
        System.out.println("Is the Input Given LL is Palindrome using same ll and two pointer method, True or False : " + bool1);
        System.out.println("*********************************************");

    }
}
