package inputOutput.tasks.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*11.7
Plik tekstowy dane.txt zawiera wiersz tekstu, a w nim oddzielone odstępami imię i nazwisko pracownika,
 liczbę przepracowanych godzin i stawkę godzinową.
 Napisz program obliczający na tej podstawie wynagrodzenie należne pracownikowi.*/
public class FileEmployees {
    public static void main(String[] args) throws FileNotFoundException {
        File employeesData = new File("data.txt");
        Scanner input = new Scanner(employeesData);
        String name = input.next();
        String surname = input.next();
        int hours = input.nextInt();
        double rate = input.nextDouble();
        System.out.printf("%s %s's salary in this month is %.2f$. %n",name,surname,hours*rate);
        input.close();
    }

}


