package ru.gavriloff;

import ru.gavriloff.decorator.Decorator;
import ru.gavriloff.reader.FileReader;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filename = ".\\testTime.txt";
        Scanner sc = new Scanner(System.in, "cp866");
        FileReader fr = new FileReader(filename);
        while (true) {

            System.out.println("Print a message:");
            String record = sc.nextLine();

            if (record.equals("exit"))
                break;
            try {
                fr.addRecord(Decorator.addTimeToRecord(record));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
