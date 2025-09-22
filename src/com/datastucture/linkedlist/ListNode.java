package com.datastucture.linkedlist;

  public class ListNode {
      public int val;
      public ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public static ListNode from(int[] array) {
          ListNode rs = null;
          ListNode head = null;
          for (int i = 0 ; i < array.length; i++) {
              if (rs == null) {
                  rs = new ListNode(array[i]);
                  head = rs;
              } else {
                  rs.next = new ListNode(array[i]);
                  rs = rs.next;
              }
          }
          return head;
      }

      public static void print(ListNode node) {
          ListNode current = node;
          while(current != null) {
              System.out.println(current.val);
              current = current.next;
          }
      }
  }