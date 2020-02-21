package com.zipcodewilmington;

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
        return array[(array.length) - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[(array.length) - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean result = false;

        int r = array.length - 1;
        for (int i = 0; i < array.length / 2; i++, r--) {
            if (array[i] == array[r]) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++)
            sb.append(array[i] + " ");
        String str2 = sb.toString();
        String str = str2.toLowerCase();
        System.out.println(str);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int n = 26;

        for (int j = 0; j < 26; j++) {
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == alphabet.charAt(j)) {
                    n = n - 1;
                    break;
                }
            }
        }

        if (n == 0) {
            return true;
        } else {
            return false;
        }
    }

    //}return isPangram;}


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int i = 0;
        int counter = 0;
        for (i = 0; i < array.length; ) {
            if (array[i] == value)
                counter += 1;
            i++;
        }
        return counter;
    }        //return 0;


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int total = getNumberOfOccurrences(array, valueToRemove);
        String[] output = new String[array.length - total];
        int count = 0;
        for (String i : array) {
            if (!i.equals(valueToRemove)) {
                output[count++] = i;
            }
        }
        return output;
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        StringBuilder arrayToReturn = new StringBuilder();
        arrayToReturn.append(array[1] + " ");
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i-1])){
                arrayToReturn.append(array[i] + " ");
            }
        }
        return arrayToReturn.toString().split(" ");
    }



//        String[]  newArray;
//
//        // loop here to count counter up
//        int counter = 0;
//        for (int i = 0; i < array.length-1; i++) {
//            if (array[i] == array[i + 1])
//                counter++;
//        }
//        newArray = new String[counter];
//
//        newArray[0] = array[0];
//        int index = 1;
//        for (int i = 1; i < array.length-1 ; i++) {
//            if (!array[i].equals(array[i - 1])) {
//                newArray[index] = array[i];
//                index++;
//            }
//        }
//
//        return newArray;
//}


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder resultString = new StringBuilder();
        resultString.append(array[0]);
        for (int i = 1; i < array.length; i++){
            if (array[i].equals(array[i-1])){
                resultString.append(array[i]);
            } else {
                resultString.append(" " + array[i]);
            }
        }
        return resultString.toString().split(" ");
    }
    }




