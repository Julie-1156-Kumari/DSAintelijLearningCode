package date_28Aug2026.LinkedList2;

public class CheckPalindromeLL {
    public static boolean checkPalindromeLL(LLNode head) {

        /*
          Approach - 1:
          Copy all elements in an array and use "Two Pointer" to check the Palindrome
          Time Complexity -> O(N)
          Space Complexity -> O(N)
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

        //Time Complexity -> O(N)
        LLNode test = head;
        int len = 0; // to find the length of an LinkedList
        while (test != null) {
            test = test.next;
            len++;
        }

        if (len == 0)
            return false;

        LLNode node = head;
        int[]  arr = new int[len]; // Space Complexity -> O(N)
        //Time Complexity -> O(N)
        for (int i = 0; i < len; i++) {
            arr[i] = node.value;
            node = node.next;
        }

        //Using two pointer method
        // Time Complexity -> O(N)
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

    // Approach 2: Fast/Slow Pointers + Half-Reversal (O(N) Time, O(1) Space)
    public static boolean checkPalindromeLL1(LLNode head) {
        if (head == null || head.next == null) return true;

        // 1. Find the middle of the linked list
        LLNode slow = head;
        LLNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half starting from 'slow'
        LLNode secondHalfHead = reverseList(slow);
        LLNode p1 = head;
        LLNode p2 = secondHalfHead;

        // 3. Compare values of first half and reversed second half
        boolean isPalindrome = true;
        while (p2 != null) { // p2 will terminate at the end of the list
            if (p1.value != p2.value) {
                isPalindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // 4. (Optional) Restore the original list structure
        reverseList(secondHalfHead);

        return isPalindrome;
    }

    // Helper method to reverse a linked list
    private static LLNode reverseList(LLNode head) {
        LLNode prev = null;
        LLNode curr = head;
        while (curr != null) {
            LLNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

}
