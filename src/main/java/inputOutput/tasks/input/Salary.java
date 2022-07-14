package inputOutput.tasks.input;

import java.io.BufferedReader;

import java.util.Scanner;

/*11.6 Łańcuch znaków zawiera oddzielone odstępami imię i nazwisko pracownika, liczbę przepracowanych godzin
i stawkę godzinową. Napisz program obliczający na tej podstawie wynagrodzenie należne pracownikowi.*/
public class Salary {
    public static void main(String[] args) {
        String employee ="Jan Kowalski 150 25,3";
        Scanner input = new Scanner(employee);
        String name = input.next();
        String surname = input.next();
        int hours = input.nextInt();
        double rate = input.nextDouble();
        System.out.printf("%s %s's salary in this month is %.2f$. %n",name,surname,hours*rate);
        input.close();
    }

}
