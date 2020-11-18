package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("resources/shoes.csv");
        Scanner scanner = null;
        List<String> lists = new ArrayList<String>();
        try {
            scanner = new Scanner(file);
            //scanner.nextLine();
            while (scanner.hasNextLine()){
                String[] line = scanner.nextLine().split(" ");
                lists.addAll(Arrays.asList(line));

            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        scanner.close();
        for (String list:lists){
            System.out.println(list);
        }

    }
}
