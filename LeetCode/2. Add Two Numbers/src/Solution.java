public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //first dummy node is created for head node
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        //carry is created for storing value for adding value to next node if we have value greater than 9.
        //just like we do in math addition where we get value greater than 9 and then we add its value to next value.
        int carry = 0;
        //using this while we have to confirm that there is no value remaining for addtion.
        while(l1!=null||l2!=null||carry!=0){
            //In next step we are checking of we have null value on l1 and l2 node. Because we have to make sure 
            //we want get any exception. If we have null value then n1 stores 0 and if we have value then that value gets stored.
            int n1 = (l1!=null) ? l1.val : 0;
            int n2 = (l2!=null) ? l2.val : 0;
            //Its simple addtion just like we do in math
            int sum = n1 + n2 +carry;
            int num = sum%10;
            carry = sum/10;
            ListNode newNode = new ListNode(num);
            tail.next = newNode;
            tail = tail.next;
            
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        ListNode out = dummy.next;
        dummy.next = null;
        return out;
    }
}