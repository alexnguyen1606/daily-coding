package com.leetcode.data_struct.linkedlist;

/**
 * The type Odd even linked list 328. sắp xếp các phần từ index lẽ lên phía trước,phần tử index chẵn
 * phía sau ,không thay đổi vị trí Chèn phần tử lẻ vào cuối của dãy lẽ và đâu của day chẵn Chèn phần
 * tử vào giữa 2 rãy lẻ và chẵn Xác định phần tử cuối cùng của dãy lẻ và bắt đầu của dãy chẵn
 *
 * @author:Nguyen Anh Tuan
 *     <p>October 26,2020
 */
public class OddEvenLinkedList_328 {
  /**
   * Odd even list list node. Chèn node mới vào list lẻ Nối list vào node tiếp theo
   *
   * @param head the head
   * @return the list node
   */

  public static ListNode oddEvenList(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode lastOdd = null;
    ListNode lastEven = null;
    ListNode currentNode = head;
    int count = 1;
    while (currentNode!=null){
        ListNode nextNode = currentNode.next;
        if (count==1){
            lastOdd  = currentNode;
        }else if (count==2){
            lastEven = lastOdd.next;
        }
        if (count>2){
            if (count%2 != 0){ // node odd
                currentNode.next = lastOdd.next;
                lastOdd.next = currentNode;
                lastEven.next = nextNode;
            }else { //node even
                lastEven = lastEven.next;
                lastOdd = lastOdd.next;
            }
        }
        count++;
        currentNode = nextNode;
    }
    return head;
  }

}
