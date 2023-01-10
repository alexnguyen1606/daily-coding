package com.leetcode.data_struct.linkedlist;

/**
 * The type Linked list circle 2.
 *
 * @author:Nguyen Anh Tuan
 * <p>October 10,2020
 */
public class LinkedListCircle2 {


    public ListNode detectCycle(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null) {
            int check = checkNode(currentNode);
            if (check == 1) {
                return currentNode;
            } else if (check == -1) {
                return null;
            } else {
                currentNode = currentNode.next;
            }
        }
        return null;
    }

    /**
     * Check node int.
     *
     * @param currentNode the current node
     * @return the int 1 if is node start circle -1 if not circle 0 make cirle but not an element
     * start
     */
    private int checkNode(ListNode currentNode) {
        if (currentNode == null) {
            return -1;
        }
        ListNode fast = currentNode;
        ListNode slow = currentNode;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                if (fast == currentNode) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        return -1;
    }

    public ListNode detectCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        while (head != null) {
            ListNode fast = head.next;
            ListNode slow = head;
            while (slow != null) {
                int count = 0;
                while (fast != null) {
                    if (fast == slow) {
                        if (fast == head) {
                            return head;
                        } else if (slow == head) {
                            return head;
                        }
                    }
                    fast = fast.next;
                    count++;
                    if (count == 2) {
                        break;
                    }
                }

                slow = slow.next;
            }
            head = head.next;
        }
        return null;
    }

    public ListNode floydDetection(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        boolean check = false;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                fast = head;
                check = true;
                break;
            }
        }
        if (check) {
            while (fast != null && slow != null) {
                if (fast == slow) {
                    return fast;
                }
                fast = fast.next;
                slow = slow.next;
            }
        }
        return null;
    }
}
