package basics.basic.args;

import java.util.Scanner;

/* 5.1
Napisz program, który wyświetli na ekranie liczbę argumentów wywołania aplikacji
oraz podane argumenty. Każdy argument powinien być wyświetlony w odrębnym wierszu
*/
public class Arguments {
    public static void main(String[] args) {

        System.out.println("Numbers of arguments: "+args.length);
        for (String numbers : args) {
            System.out.println(numbers);
        }
        for (int i = 0; i < args.length ; i++) {
            System.out.println(i +": "+ args[i]);
        }
    }
}
