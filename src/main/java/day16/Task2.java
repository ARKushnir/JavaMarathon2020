package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {

        File destFile1 = new File("file1.txt");
        FileWriter pw1 = new FileWriter(destFile1);

        File destFile2 = new File("file2.txt");
        FileWriter pw2 = new FileWriter(destFile2);

        for (int i = 0; i < 12; i++) {
            Random r = new Random();
            int randomInt = r.nextInt(100) + 1;
            //System.out.println(randomInt);
            pw1.write(randomInt + " ");
        }
        pw1.close();

        int sum = 0;
        int counter = 0;
        double avg = 0;
        File file = new File("file1.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        int[] numbers = new int[numbersString.length];

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            if ((i + 1) % 4 == 0) {
                avg = (double) sum / 4;
                pw2.write(avg + " ");
                //System.out.println(sum);
                sum = 0;
            }

        }

        pw1.close();
        pw2.close();
        scanner.close();

        printResult(new File("file2.txt"));
    }

    public static void printResult(File file) throws FileNotFoundException {
        int counter2 = 0;
        double summ = 0;
        File file3 = new File("file2.txt");
        Scanner scanner2 = new Scanner(file);
        String line = scanner2.nextLine();
        String[] numbersString2 = line.split(" ");
        double[] numbers2 = new double[numbersString2.length];

        for (String number : numbersString2) {
            numbers2[counter2++] = Double.parseDouble(number);
        }

        for (Double number : numbers2) {
            summ = summ + number;
        }
        System.out.println(Math.floor(summ));

    }
}
