package com.example;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.TreeSet;

import org.junit.Test;

/**
 * Unit tests on both functions
 */


public class GroupingTest {

    @Test
    public void testCollectWithSimpleValidInput() {
        
        Grouping grouping = new Grouping();
        String expected = "[1, 2, 3, 4, 5]";
        String actual = grouping.collect("1,2,3,4,5").toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testCollectWithSimpleValidInput2() {
        
        TreeSet<Integer> numbers = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5));
        Grouping grouping = new Grouping();
        String expected = "1-5";
        String actual = grouping.summarizeCollection(numbers);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCollectWithDuplicateInput() {

        Grouping grouping = new Grouping();
        String expected ="[1, 2, 3, 4, 5]";
        String actual = grouping.collect("1,2,3,4,5,3,4,1,5").toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testCollectWithDuplicateInput2() {

        TreeSet<Integer> numbers = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,3,4,1,5));
        Grouping grouping = new Grouping();
        String expected ="1-5";
        String actual = grouping.summarizeCollection(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testCollectFromInterfaceExample(){

        Grouping grouping = new Grouping();
        String expected ="[1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31]";
        String actual = grouping.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31").toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCollectFromInterfaceExample2(){

        TreeSet<Integer> numbers = new TreeSet<Integer>(Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31));
        Grouping grouping = new Grouping();
        String expected ="1, 3, 6-8, 12-15, 21-24, 31";
        String actual = grouping.summarizeCollection(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testCollectWithOneInput(){

        Grouping grouping = new Grouping();
        String expected ="[1]";
        String actual = grouping.collect("1").toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCollectWithOneInput2(){

        TreeSet<Integer> numbers = new TreeSet<Integer>(Arrays.asList(1));
        Grouping grouping = new Grouping();
        String expected ="1";
        String actual = grouping.summarizeCollection(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testCollectWithDescendingOrder(){

        Grouping grouping = new Grouping();
        String expected ="[1, 2, 3, 4, 5]";
        String actual = grouping.collect("5,4,3,2,1").toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCollectWithDescendingOrder2(){

        TreeSet<Integer> numbers = new TreeSet<Integer>(Arrays.asList(5,4,3,2,1));
        Grouping grouping = new Grouping();
        String expected ="1-5";
        String actual = grouping.summarizeCollection(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testCollectWithUnorderedInput(){

        Grouping grouping = new Grouping();
        String expected ="[1, 2, 5, 7, 8, 9, 10, 100]";
        String actual = grouping.collect("2,5,10,9,8,100,7,1").toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCollectWithUnorderedInput2(){

        TreeSet<Integer> numbers = new TreeSet<Integer>(Arrays.asList(2,5,10,9,8,100,7,1));
        Grouping grouping = new Grouping();
        String expected ="1-2, 5, 7-10, 100";
        String actual = grouping.summarizeCollection(numbers);
        assertEquals(expected, actual);
    }
    //======================EXCEPTIONS=============================//
  
   

}
            