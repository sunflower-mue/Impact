package com.example;

import java.util.Collection;
import java.util.TreeSet;
import com.example.numberrangesummarizer.*;


public class Grouping implements NumberRangeSummarizer {
    
    public Collection<Integer> collect(String input) {

        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty or null");
        }

        else{

            TreeSet<Integer> set = new TreeSet<Integer>();
            String[] nums = input.split(",");
            for (String num : nums) {
                try{
                set.add(Integer.parseInt(num.trim()));
                }
                catch(IllegalArgumentException e){
                    throw new IllegalArgumentException("Entry not an int");
                }
    
            }
      return set;
        }
    }
    
    public  String summarizeCollection(Collection<Integer> input) {

        StringBuilder sb = new StringBuilder();
        int[] arr = input.stream().mapToInt(i -> i).toArray();

        for (int i = 0; i < arr.length; i++) {
            int start = arr[i];
            while (i < arr.length - 1 && arr[i] + 1 == arr[i+1]) {
                i++;
            }
            int end = arr[i];
            if (start == end) {
                sb.append(start);
            } else {
                sb.append(start).append("-").append(end);
                }
            if (i < arr.length - 1) {
                    sb.append(", ");
            }
            
        }
        return sb.toString();
    } 
    
}