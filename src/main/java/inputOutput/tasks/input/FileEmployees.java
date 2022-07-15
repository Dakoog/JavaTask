package inputOutput.tasks.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*11.7
Plik tekstowy dane.txt zawiera wiersz tekstu, a w nim oddzielone odstępami imię i nazwisko pracownika,
 liczbę przepracowanych godzin i stawkę godzinową.
 Napisz program obliczający na tej podstawie wynagrodzenie należne pracownikowi.*/
public class FileEmployees {
    public static void main(String[] args) throws IOException {

        File employeeData = new File("employeeData.txt");
        boolean isCreatedNewFile = employeeData.createNewFile();

        PrintWriter writer = new PrintWriter(employeeData);
        writer.println("""
                Lech Bolecki 150 25,3
                Ewa  Wąż 270 19,8
                Piotr Klucznik 220 17,0
                Małgorzata Mistrz 70 34,8
                Tomasz Niedowiarek 237 25,3"""
        );
        writer.close();
        Scanner input = new Scanner(employeeData);

        String name, surname;
        int hours;
        double rate, salary;
        try {
            System.out.println("\n           *** Employee payroll ***");
            do {
                name = input.next();
                surname = input.next();
                hours = input.nextInt();
                rate = input.nextDouble();
                salary = hours * rate;

                System.out.printf("%s %s's salary in this month is %.2f$. %n", name, surname, salary);
            }
            while (!name.isEmpty());
        } catch (NoSuchElementException nsee) {
            System.out.println();
        }

    }
}


