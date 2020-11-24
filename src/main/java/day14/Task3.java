package day14;

import java.io.*;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        parseFileToObjList();
        for (Person person : parseFileToObjList()) {
            System.out.println(person);
        }
    }

    public static List<Person> parseFileToObjList() {
        Scanner sc = null;
        List<Person> lists = new ArrayList<Person>();
        try {
            sc = new Scanner(new File("people.txt"));
            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(" ");
                lists.add(new Person(data[0], Integer.parseInt(data[1])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ArithmeticException e) {
            System.out.println("Некорректный входной файл" + e.getMessage());
            lists.clear();
        }
        sc.close();
        return lists;
    }
}