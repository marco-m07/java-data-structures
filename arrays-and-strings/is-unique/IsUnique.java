/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data
 * strucures?
 */

import java.util.Arrays;
import java.util.Scanner;

public class IsUnique {

    private static boolean CheckIfUnique(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Please type a word: ");
        Scanner reader = new Scanner(System.in);
        String word = reader.next();
        boolean isUnique = CheckIfUnique(word);
        System.out.println("The word you typed has only unique characters: " + String.valueOf(isUnique));
        reader.close();
    }
}