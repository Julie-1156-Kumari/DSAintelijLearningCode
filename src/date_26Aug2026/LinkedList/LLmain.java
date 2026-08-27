package date_26Aug2026.LinkedList;

public class LLmain {
    public static void main(String[] args) {
        LLNode head = new LLNode(1);
        LLNode temp = head;
        temp.next = new LLNode(4);
        temp.next.next = new LLNode(9);

        System.out.println("============= Simple LinkedList =====================");
        LLNode curr = head;
        while (curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("======================================================");

        System.out.println();

        System.out.println("============== Reversed LinkedList ====================");
        //reverse the string
        curr = ReverseLL.reverseLL(head);
        while (curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("=======================================================");

        System.out.println();

        System.out.println("=============== UserInput LinkedList===================");
        //take Input from users and print all ll
        curr = UserInputLL.userInputLL();
        while (curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("=========================================================");

    }
}
