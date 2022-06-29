package com.zipcodewilmington;

import java.util.*;


/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        if (Arrays.toString(array).contains(value)) return true;
        else return false;
        }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int sizeOfArray = array.length;
        String[] reversal = new String[sizeOfArray];
        int y = 0;
        for (int z = array.length-1 ; z >= 0 ; z--) {
            reversal[y] = array[z];
            y++;
        }
        return reversal;

//        ArrayList<String> backwards = new ArrayList<String>();
//        backwards.addAll(Arrays.asList(array));
//        Collections.reverse(backwards);
//        return backwards.toArray(new String[backwards.size()]);

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(array, StringArrayUtils.reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");

        String arrayString = Arrays.toString(array).toLowerCase();

        for (int i = 0; i <= alphabet.length - 1; i++) {

            if (!arrayString.contains(alphabet[i])) return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurences = 0;
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i].contains(value)) {occurences++;}
        }
        return occurences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] alteredArray = new String[array.length-1];
        
        
        for (int i = 0, j = 0 ; i < array.length; i++) {
            if (!array[i].contains(valueToRemove)) {
                alteredArray[j++] = array[i];
            }
        }
        return alteredArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String preArray = "";
        for (int i = 0 ; i < array.length-1 ; i++) {
            if (!array[i].equals(array[i+1])) {
                preArray += (array[i] + " ");
            }
        }
        preArray += (array[array.length-1]);
        String[] outArray = preArray.split(" ");
        return outArray;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String grouping = array[0];
        for (int i = 1 ; i < array.length ; i++) {
            if (array[i] == array[i-1]) {
                grouping +=(array[i]);
            } else grouping += (" " + array[i]);
        }
        String[] outArray = grouping.split(" ");
        return outArray;
    }
}
