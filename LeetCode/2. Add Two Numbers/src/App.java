import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the first linked list (l1), separated by spaces:");
        ListNode l1 = createLinkedList(sc.nextLine());

        System.out.println("Enter the elements of the second linked list (l2), separated by spaces:");
        ListNode l2 = createLinkedList(sc.nextLine());

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.println("The sum of the two linked lists is:");
        printLinkedList(result);

        sc.close();
    }

    // Helper method to create a linked list from a string of numbers
    private static ListNode createLinkedList(String input) {
        String[] nums = input.trim().split("\\s+");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String num : nums) {
            current.next = new ListNode(Integer.parseInt(num));
            current = current.next;
        }

        return dummy.next;
    }

    // Helper method to print a linked list
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(",");
            }
            current = current.next;
        }
        System.out.println("]");
    }
}
