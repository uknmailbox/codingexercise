import java.util.*;

public class CodingTest {

    public static void main(String[] args) {
        CodingTest obj = new CodingTest();
        //Complete all problems below.
        //Once done run all problems from here

        obj.Question_PlusOne();


    }

    //Instructions:
    //  Given an array of integers, return indices of two numbers that add up to the provided target.
    //  Return only ONE solution.  You may not use the same index twice.
    public void Question_TwoSum() {

        //Do NOT modify values below
        final int[] INPUT_ARRAY = {1, 5, 2, 0, 4, 11, 9, 6, 12, 7};
        final int TARGET_VAL = 9;

        Map<Integer, Integer> oMap = new HashMap<>();

        //YOUR CODE HERE
        for (int i = 0; i < INPUT_ARRAY.length; i++) {
            oMap.put(INPUT_ARRAY[i], i);
        }

        for (int i = 0; i < INPUT_ARRAY.length; i++) {
            int diff = TARGET_VAL - INPUT_ARRAY[i];

            if (oMap.containsKey(diff)) {
                System.out.println(INPUT_ARRAY[i] + "(" + i + ") + "
                        + diff + "(" + oMap.get(diff) + ") = " + TARGET_VAL);
                break;
            }
        }

        //OUTPUT TWO INDICES
        System.out.println("\n\n-----QUESTION_TWOSUM-----\n\n");

    }

    //Instructions:
    //  Given an array of integers, output all numbers appearing more than once.  Only output duplicates
    //  one time.
    public void Question_FindDuplicates() {
        Map<Integer, Integer> oMap = new HashMap<>();

        //Do NOT modify values below
        final int[] INPUT_ARRAY = {1, 5, 3, 2, 6, 8, 9, 10, 1, 5, 8, 9, 3, 10, 45, 32, 16, 14, 3, 5, 9};

        //YOUR CODE HERE
        for (Integer input : INPUT_ARRAY) {
            if (!oMap.containsKey(input)) {
                oMap.put(input, 1);
            } else {
                int count = oMap.get(input);
                oMap.put(input, count + 1);
            }
        }

        Iterator<Integer> iterator = oMap.keySet().iterator();

        //OUTPUT DUPLICATE NUMBERS
        System.out.println("\n\n-----QUESTION_FINDDUPLICATES-----\n\n");

        for (Integer i : oMap.keySet()) {
            if (oMap.get(i) > 1) {
                System.out.println(i);
            }
        }
    }

    //Instructions:
    //  Given an array of digits representing a number, add one to the number and output it
    //  Example:  In array [1, 2, 4, 5] this translates into number 1245.  You would add one and output the value.
    public void Question_PlusOne() {

        //Do NOT modify values below
        final int[] INPUT_ARRAY = {4, 5, 6, 7};
        

        //YOUR CODE HERE
        for (int i=INPUT_ARRAY.length - 1; i>=0; i--) {
            //INPUT_ARRAY[i] =
        }


        //OUTPUT FINAL VALUE
        System.out.println("\n\n-----QUESTION_PLUSONE-----\n\n");

    }

    //Instructions:
    //  Given an input string, reverse the value using recursion.
    public void Question_ReverseString() {

        //Do NOT modify values below
        final String INPUT_STRING = "This is a string to reverse";

        //OUTPUT REVERSE STRING
        System.out.println("\n\n-----QUESTION_REVERSESTRING-----\n\n");

    }

    //Instructions:
    //  Given an input string, see if it's a palindrome.  Filter out any non letters.  Ignore capitalization.
    //  Example: Racecar is a palindrome.
    public void Question_Palindrome() {

        //Do NOT modify values below
        final String test1 = "Racecar1";
        final String test2 = "ABC123cba";
        final String test3 = "31Civ23ic";

        //YOUR CODE HERE

        //OUTPUT BOOLEAN VALUES FOR THREE TESTS
        System.out.println("\n\n-----QUESTION_PALINDROME-----\n\n");

    }

    //Instructions:
    //  Generate 100 random numbers in the range of [1 - 1000], inclusive.
    //  Then put the numbers into a Map
    //  Move all the numbers into a Set, from the Map
    //  Move the numbers into a List, from the Set
    //  Sort the numbers and then output them with one number on every row
    public void Question_Collections() {

        //YOUR CODE HERE

        //OUTPUT THE NUMBERS
        System.out.println("\n\n-----QUESTION_COLLECTIONS-----\n\n");

    }

    //Instructions:
    //  Given an input array, output all missing numbers in order.
    //  Example: In array [7, 4, 3, 2, 1, 10], you would output: 5, 6, 8, 9
    public void Question_MissingNumbers() {

        //Do NOT modify the values below
        final int[] INPUT_ARRAY = {4, 5, 1, 2, 10, 8, 7, 14, 20};

        //YOUR CODE HERE

        //OUTPUT MISSING NUMBERS
        System.out.println("\n\n-----QUESTION_MISSINGNUMBERS-----\n\n");

    }
}
