package date_28Aug2026.LinkedList2;

public class CheckPalindromeLL {
    public static boolean checkPalindromeLL(LLNode head) {

        /*
          Approach - 1:
          Copy all elements in an array and use "Two Pointer" to check the Palindrome
          */

        System.out.println("checkPalindromeLL -- Original LL");
        LLNode curr = head;
        System.out.println("-------------------------------------------------");
        while (curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("------------------------------------------------");


        LLNode test = head;
        int len = 0; // to find the length of an LinkedList
        while (test != null) {
            test = test.next;
            len++;
        }

        if (len == 0)
            return false;

        LLNode node = head;
        int[]  arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = node.value;
            node = node.next;
        }

        //Using two pointer method
        int left = 0;
        int right = len - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}
