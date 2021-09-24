package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:23 PM ,September 19,2021
 */
public class ReverseWordsInString_151 {
  public String reverseWords(String s) {
    s = s.trim();
     s = removeDuplicateSpace(s);
    String[] array = s.split(" ");
    reverse(array);
    return buildString(array);
  }

  private void reverse(String[] array) {
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      swap(array, start, end);
      start++;
      end--;
    }
  }

  private String buildString(String[] array) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      builder.append(array[i]);
      if (i != array.length - 1) {
        builder.append(" ");
      }
    }
    return builder.toString();
  }

  private String removeDuplicateSpace(String s) {
    char[] characters = s.toCharArray();
    StringBuilder builder = new StringBuilder();
    char temp;
    boolean flag = false;
    for (int i = 0; i < characters.length; i++) {
      temp = characters[i];
      if (temp != ' ') {
        builder.append(temp);
        flag = false;
      } else if (!flag) {
        builder.append(temp);
        flag = true;
      }
    }
    return builder.toString();
  }

  private void swap(String[] array, int i, int j) {
    String temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void main(String[] args) {
    String test = "A B  C  D";
    ReverseWordsInString_151 reverseWordsInString = new ReverseWordsInString_151();
    System.out.println(reverseWordsInString.reverseWords(test));
  }
}
