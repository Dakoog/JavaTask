package string;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        File palindrome = new File("palindrome.txt");

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String text;
        System.out.println("Please, type your text if you want to check if that word or sentence is a palindrome");

        do {
            System.out.println("Your text it: ");
            text = br.readLine();
            text = text.toLowerCase();

            if (text.equalsIgnoreCase("finish")) {
                System.out.println("The end. See you!");
            } else {
                if (isPalindrome(text)) {
                    System.out.println(text.toUpperCase() + ": it is palindrome.");
                } else {
                    System.err.println(text.toLowerCase() + ": it isn't palindrome");
                }
            }
        } while (!text.equals("finish"));

        input.close();
    }

    public static boolean isPalindrome(String word) {
        word = word.replace(" ", "");
        char[] arrayJavaProgramming = word.toCharArray();

        for (int i = 0, j = word.length() - 1; i < j; i++, --j) {
            char reverse = arrayJavaProgramming[i];
            arrayJavaProgramming[i] = arrayJavaProgramming[j];
            arrayJavaProgramming[j] = reverse;
        }
        String reverseWord = new String(arrayJavaProgramming);
        return reverseWord.equals(word);
    }
}
