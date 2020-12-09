package com.google.kickstart.rounda2020;

import java.util.*;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:37 AM ,December 08,2020
 */
public class Solution  {
  private List<Stack<Integer>> listStack;
  private Integer numberItemOfStack;
  private Integer numberPick;

  public Solution(Integer numberItemOfStack, Integer numberPick) {
    this.numberItemOfStack = numberItemOfStack;
    this.numberPick = numberPick;
  }

  public void setListStack(List<Stack<Integer>> listStack) {
    this.listStack = listStack;
  }

  public Solution() {
    this.input();
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập số Test case:");
    int numberTest = scanner.nextInt();
    int numberElement = 0;
    int numberStack;
    int numberPick = 0;
    List<Stack<Integer>> listStack = null;
    while (numberTest-- > 0) {
      System.out.println("Nhập số lượng stack:");
      numberStack = Integer.parseInt(scanner.next());
      listStack = new ArrayList<>(numberStack);
      System.out.println("Nhập số lượng phần tử:");
      numberElement = Integer.parseInt(scanner.next());
      System.out.println("Nhập số lượng cần lấy:");
      numberPick = scanner.nextInt();
      while (numberStack-- > 0) {
        Stack<Integer> stack = new Stack<>();
        int i = numberElement;
        while (i-- > 0) {
          stack.push(Integer.valueOf(scanner.next()));
        }
        listStack.add(stack);
      }
    }
    setListStack(listStack);
    setNumberItemOfStack(numberElement);
    setNumberPick(numberPick);
  }

  public Integer calculate() {
    Stack<Integer> result = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    Map<Integer,Stack<Integer>> stackMap = new HashMap<>();
    for (Stack<Integer> stack : listStack){
      while (!stack.empty() && result.size()>=numberPick){
        result.push(stack.pop());
      }
    }
    return totalStack(result) + totalStack(temp);
  }

  public int totalStack(Stack<Integer> stack) {
    int sum = 0;
    while (!stack.isEmpty()) {
      sum += stack.pop();
    }
    return sum;
  }

  public int count(Stack<Integer> stack) {
    return stack.size();
  }

  public int totalArray(int[] array) {
    int i = 0;
    int j = array.length - 1;
    int sum = 0;
    while (i <= j) {
      if (j != i) {
        sum += array[i] + array[j];
      } else {
        sum += array[i];
      }
      i++;
      j--;
    }
    return sum;
  }

  public int totalArray(int[] array, int i, int j) {
    int sum = 0;
    while (i <= j) {
      if (j != i) {
        sum += array[i] + array[j];
      } else {
        sum += array[i];
      }
      i++;
      j--;
    }
    return sum;
  }

  public void sort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; i++) {
      int value = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > value) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = value;
    }
  }

  public void setNumberItemOfStack(Integer numberItemOfStack) {
    this.numberItemOfStack = numberItemOfStack;
  }

  public void setNumberPick(Integer numberPick) {
    this.numberPick = numberPick;
  }
}
