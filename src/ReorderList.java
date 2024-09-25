/*
Leetcode Question ID: 143
difficulty: Medium
 */
import java.util.*;
public class ReorderList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void reorderList(ListNode head) {
        if(head==null || head.next==null)
            return;

        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev = null, next = null;
        while(slow != null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode firstHf = head;
        ListNode secondHf = prev;

        while(secondHf.next != null) {
            next = firstHf.next;
            prev = secondHf.next;

            firstHf.next = secondHf;
            secondHf.next = next;

            firstHf = next;
            secondHf = prev;
        }
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
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        reorderList(head);
        for (ListNode curr = head; curr != null; curr = curr.next)
            System.out.print(curr.val + (curr.next != null ? " -> " : " -> null"));
    }
}
