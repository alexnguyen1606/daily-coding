package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 * @created: 8/8/2022 - 9:10 PM
 */
public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode nextNode = result;
        ListNode preNode = null;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                Integer sum = l1.val + l2.val;
                addNumber(nextNode, sum);
                l2 = l2.next;
                l1 = l1.next;
            }
            else if (l1 != null) {
                addNumber(nextNode, l1.val);
                l1 = l1.next;
            } else {
                addNumber(nextNode, l2.val);
                l2 = l2.next;
            }

            nextNode.next = nextNode.next != null ? nextNode.next : new ListNode();
            preNode = nextNode;
            nextNode = nextNode.next;
        }

        if(preNode.next != null && preNode.next.val == 0) {
            preNode.next = null;
        }

        return result;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode nextNode = l1;
        ListNode preNode = null;

        while (l2 != null) {
            addNumber(nextNode, l2.val);
            l2 = l2.next;
            preNode = nextNode;
            nextNode = nextNode.next;
        }

        if(preNode.next != null && preNode.next.val == 0) {
            preNode.next = null;
        }

        return l1;
    }

    private void addNumber(ListNode node, Integer num) {
        int sum = num + node.val;
        node.val = sum % 10;
        int x = sum / 10;
        if (x > 0) {
            if (node.next == null) {
                node.next = new ListNode();
            }
            addNumber(node.next, x);
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        AddTwoNumbers_2 addTwoNumbers_2 = new AddTwoNumbers_2();
        addTwoNumbers_2.addNumber(listNode, 9999999);
        addTwoNumbers_2.addNumber(listNode, 9999);
        ListNode listNode2 = new ListNode(0);
        addTwoNumbers_2.addNumber(listNode2, 465);
        ListNode result = addTwoNumbers_2.addTwoNumbers(listNode, listNode2);

    }


}
