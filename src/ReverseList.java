/*
Leetcode Question ID: 206
 */
import java.util.*;
public class ReverseList {
    public static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements do you want to add to the list? ");
        int n = scanner.nextInt();
          ListNode head = null;
          ListNode tail = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int value = scanner.nextInt();
              ListNode newNode = new   ListNode(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        head= reverseList(head);
        for (ListNode curr = head; curr != null; curr = curr.next)
            System.out.print(curr.val + (curr.next != null ? " -> " : " -> null"));
    }
}
