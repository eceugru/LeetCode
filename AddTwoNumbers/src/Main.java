

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int elde = 0;

        while (l1 != null || l2 != null || elde !=0) {
            int val1 = l1 !=null ? l1.val : 0;
            int val2 = l2 !=null ? l2.val : 0;

            int sum = val1 + val2 + elde;

            elde = sum/10;

            current.next = new ListNode(sum%10);
            current = current.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        }

        return result.next;

    }


}