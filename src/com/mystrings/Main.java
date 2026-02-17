/**
 *  Java program to convert strings to character arrays and wise versa.
 */

package com.mystrings;

/**
 *  Main method.
 */
public class Main {

    // Main class to run java program.
    public static void main(String[] args) {

        // Creating string.
        String str = "Hello";

        // Creating char array.
        char[] array = {'H', 'e', 'l', 'l', 'o'};

        // Printing str to console.
        System.out.println(str); // Output: Hello

        // Printing array to console.
        System.out.println(array); // Output: Hello

        // Converting string to char array.
        char[] array1 = str.toCharArray();

        // Converting char array to string.
        String str1 = new String(array1);

        // Printing str1 to console.
        System.out.println(str1); // Output: Hello

        // Printing array1 to console.
        System.out.println(array1); // Output: Hello

    }
}