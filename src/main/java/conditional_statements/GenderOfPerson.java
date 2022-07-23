package conditional_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Napisz program, który zapyta użytkownika o imię, a nastpępbie  wykorzystując podane
imię, wyświetli w konsoli napis w postaci: "Jan jest męczyzną." lub "Anna jest
kobietą.*/
public class GenderOfPerson {
    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        System.out.print("Can you give me your name? Your name it: ");
        String name = br.readLine();
        name = name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
        input.close();

        char lastSign = name.charAt(name.length() - 1);
        boolean barnaba = name.equalsIgnoreCase("barnaba");
        boolean kuba = name.equalsIgnoreCase("kuba");
        boolean bonawentura = name.equalsIgnoreCase("bonawentura");

        if (lastSign == 'a' && !(barnaba || kuba || bonawentura)) {
            System.out.printf("Hi, %s. You are woman. How are you?", name);
        } else {
            System.out.printf("Hi, %s. You are man. How are you?", name);
        }
    }
}
