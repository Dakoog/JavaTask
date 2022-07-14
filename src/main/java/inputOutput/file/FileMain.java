package inputOutput.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) throws IOException {

        File myPoetry = new File("myPoetry.txt");
        boolean creatingFile = myPoetry.createNewFile();
        System.out.println("Is created myPoetry.txt file? " + creatingFile);
        String pathFileMyPoetry = myPoetry.getAbsolutePath();
        System.out.println("myPoetry file is located in " + pathFileMyPoetry);

        PrintWriter writer = new PrintWriter(myPoetry);
        writer.println("""
                ******* A jeżeli ...  ********

                A jeżeli nic? A jeżeli nie?
                Trułem ja się myślą złudną
                Tobą jasną tobą cudną
                I zatruty śnię...
                Bo jeżeli nie, no to ...\s
                Trudno.

                A jeżeli coś? A jeżeli tak?
                Rozgołębią mi się zorze
                Ogniem cały świat zagorze
                Jak czerwony mak
                Bo jeżeli tak, no to ...
                Boże...
                               Julian Tuwim""");
        writer.close();
        Scanner input = new Scanner(myPoetry);
        System.out.println();
        while(input.hasNext()){
            String myPoetryContent = input.nextLine();
            System.out.println(myPoetryContent);
        }

    }


}
