package com.amigoscode._5_generics._4_genericmethods;

import java.util.Arrays;

/**
 * Exercise: Generic Swap and Reverse
 *
 * This exercise practices generic methods by implementing swap and reverse
 * operations that work with arrays of any type.
 *
 * Complete the TODOs below.
 */
public class GenericSwap {

    // TODO: 1 - Create a static generic method: <T> void swap(T[] array, int i, int j)
    //  It should swap the elements at indices i and j in the array.
    //  Use a temporary variable of type T to perform the swap.
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // TODO: 2 - Create a static generic method: <T> T[] reverse(T[] array)
    //  It should reverse the array in place and return it.
    //  Hint: swap elements from both ends, moving toward the center.
    //  Use the swap() method you wrote in TODO 1.
    public static <T> T[] reverse(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, array.length - 1 - i);
        }
        return array;
    }

    public static void main(String[] args) {

        // TODO: 3 - Create an Integer[] array {1, 2, 3, 4, 5}.
        //  Use swap() to swap the first and last elements.
        //  Print the result using Arrays.toString().
        Integer[] intArray = {1, 2, 3, 4, 5};
        swap(intArray, 0, 4);
        System.out.println(Arrays.toString(intArray));

        // TODO: 4 - Create a String[] array {"A", "B", "C", "D"}.
        //  Use swap() to swap elements at index 1 and index 2.
        //  Print the result using Arrays.toString().
        String[] strArray = {"A", "B", "C", "D"};
        swap(strArray, 1, 2);
        System.out.println(Arrays.toString(strArray));

        // TODO: 5 - Use reverse() on both the Integer[] and String[] arrays.
        //  Print the reversed arrays using Arrays.toString().
        //  Verify the output is correct.
        reverse(intArray);
        System.out.println(Arrays.toString(intArray));
        reverse(strArray);
        System.out.println(Arrays.toString(strArray));

    }
}
