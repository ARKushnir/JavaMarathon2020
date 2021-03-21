package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        printResult(new File("file_test.txt"));
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        int sum = 0;
        double avg = 0.0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] lineArray = line.split(" ");
            for (String element : lineArray) {
                sum = sum + Integer.parseInt(element);
            }
            avg = (double) sum / lineArray.length;
            System.out.println(avg);
            System.out.println(decimalFormat.format(avg));
        }
    }
}
