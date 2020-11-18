package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List<String> lists = parseFileToStringList();
        for (String list :lists){
            System.out.println(list);
        }

    }

   public static List<String> parseFileToStringList(){
        File file = new File("people.txt");
        Scanner scanner = null;
       List<String> lists = new ArrayList<String>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                // scanner.nextLine();
                String line = scanner.nextLine();
                String []  lineArray = line.split(" ");
                if (Integer.parseInt(lineArray[1])<0) {
                    throw new ArithmeticException ("Возраст не может быть меньше 0") ;
                }
                lists.add(line);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (ArithmeticException e){
            System.out.println("Некорректный файл "+e.getMessage());
            lists.clear();
        };
        scanner.close();
        return lists;
    }
}
