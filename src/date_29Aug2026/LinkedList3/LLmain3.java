package date_29Aug2026.LinkedList3;

public class LLmain3 {
    public static void main(String[] args) {
        LLNode3 head = LLinput3.takeUserInput(0);
        LLNode3 curr = head;

        System.out.println("-------------------------------------------------");
        while (curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("------------------------------------------------");

        System.out.println("************* Find the 1st mid value of the LL **************");
        System.out.println(ReturnThe1stMidLL.returnThe1stMidLL1(head));
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
}
