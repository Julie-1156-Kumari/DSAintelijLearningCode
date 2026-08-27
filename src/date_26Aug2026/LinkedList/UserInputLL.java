package date_26Aug2026.LinkedList;

import java.util.Scanner;

public class UserInputLL {
    public static LLNode userInputLL(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value & to stop type -1 : ");

        int value = sc.nextInt();
        LLNode head = null;
        LLNode curr = null;

        while (value != -1){
            LLNode newNode = new LLNode(value);

            if(head == null){
                head = newNode;
                curr = head;
            }else{
                curr.next = newNode;
                curr = newNode;
            }
            value = sc.nextInt();
        }
        return head;
    }
}
