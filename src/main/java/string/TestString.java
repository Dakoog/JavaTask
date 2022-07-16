package string;

public class TestString {
    public static void main(String[] args) {
        String tasks = "Zadania z programowania.";
        System.out.println(tasks);// text edition
        System.out.println(tasks.charAt(0));// char of index 0 (first element)
        System.out.println(tasks.length());//  text length o
        System.out.println(tasks.charAt(23));// char of index 23 (last element)
        System.out.println(tasks.toUpperCase()); // all text in uppercase.
        System.out.println(tasks.toLowerCase());// all text in lowercase
        System.out.println(tasks.indexOf('z'));// first index for element "z"
        System.out.println(tasks.indexOf("prog")); // first index for string "prog".
        char dot = '.', questionMark = '?';
        System.out.println(tasks.replace('.', '?'));// replace characters with "." to "?"
        String str1 = "adania", str2 = "dania";
        System.out.println(tasks.replace(str1, str2));// replace string with "adania" to "dania"
        str1 = "ania";
        str2 = "anka";
        System.out.println(tasks.replaceAll(str1, str2));// replace all strings with "anka" to "danka"
        System.out.println(tasks.replaceFirst(str1, str2));// replace only first string with "ania" to "anka".
        System.out.println(tasks.substring(10));// cut and give string that begin at index 10
        System.out.println(tasks.substring(10, 17)); // cut and give string that begin at index 10 and ending at index 17
        str1 = "\b z podpowiedziami.";
        System.out.println(tasks.concat(str1));//concatenates the old string with the new string "\ b with hints." Warning! \ b - backspace (remove the last character before it) the old string with the new string "\ b with hints." Warning! \ b - backspace (remove the last character before it)
        System.out.println(tasks + str1.substring(0,4) + str1.substring(5));//concatenates three strings
    }
}