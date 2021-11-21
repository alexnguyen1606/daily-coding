package com.lunar_2021;

import com.brownbox_online.list.Twitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:11 AM ,February 12,2021
 */
public class HelloWorld  {
    
    static List<?> abc;
    
    
    public static void main(String[] args) {
        List<String> s1 = Arrays.asList("A","B","C","K");
        List<String> s2 = Arrays.asList("A","B","C","D");
        List<String> s3 = Arrays.asList("A","B","C","E");
        List<List<String>> lists = Arrays.asList(s1,s2,s3);
        List<String> demo = lists.parallelStream().collect(LinkedList::new,List::addAll,List::addAll);
        List<String> list ;
        list = s1;
        add(list,"ac");
        
    }
    
    public static <T> void add (List<T> list,T element){
        list.add(element);
    }
    
    public static class Box <T> {
        T value;
    
        public T getValue() {
            return value;
        }
    
        public void setValue(T value) {
            this.value = value;
        }
        
       
        
    }
    
    
    
}
