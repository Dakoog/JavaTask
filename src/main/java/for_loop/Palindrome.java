package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    /*Napisz program, który sprawdzi, czy palindromem jest wprowadzone z klawiatury:
16.2 a) słowo
16.3 b) zdanie
*/
public class Palindrome {
    public static void main(String[] args) throws IOException {

        try(InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(input)){

            System.out.print("a) Please, insert any word: ");
            String word = br.readLine();
            if(isWordPalindrome(word.toUpperCase())){
                System.out.printf("%s is palindrome. %n",word);
            } else {
                System.out.printf("%s isn't palindrome. %n",word);
            }

            System.out.print("b) Please, insert any sentence: ");
            String sentence = br.readLine();
            if(isSentencePalindrome(sentence.toUpperCase())){
                System.out.printf("%s is palindrome. %n",sentence);
            } else {
                System.out.printf("%s isn't palindrome. %n",sentence);
            }

        }
    }
    public static boolean isWordPalindrome(String word) {
        int wordLength = word.length();
        for (int i = 0; i < wordLength / 2; i++) {
            if (word.charAt(i) != word.charAt(wordLength - 1 - i)) {
                return false;
            }
        }

        return true;
    }
    public static boolean isSentencePalindrome(String word) {
        word = word.replace(" ", "");
        int wordLength = word.length();
        for (int i = 0; i < wordLength / 2; i++) {
            if (word.charAt(i) != word.charAt(wordLength - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
