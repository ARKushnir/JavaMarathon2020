package day14;

import org.w3c.dom.ls.LSOutput;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printSumDigits();
    }

    public static void  printSumDigits()  {
        File file = new File("file_test.txt");
        //File file = new File ("C:\\java_tasks\\JavaMarathon2020\\src\\main\\java\\day14\\file_test.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        String line = scanner.nextLine();
        String [] numbersString = line.split(" ");
        if (numbersString.length>10 || numbersString.length<10){
            try {
                throw new IndexOutOfBoundsException();
            } catch (IndexOutOfBoundsException e){
                System.out.println("Неккоректный входной файл");
            }
        }
        int [] numbers = new int[numbersString.length];
        int counter = 0;
        int sum = 0;

        for (String number :numbersString ){
            numbers[counter++]= Integer.parseInt(number);
        }
        //System.out.println(Arrays.toString(numbers));
        for (Integer number:numbers){
            sum = sum + number;
        }
        System.out.println(sum);
        scanner.close();
    }
}
