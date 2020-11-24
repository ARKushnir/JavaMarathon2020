package day15;

import org.hibernate.validator.constraints.Length;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class Task1 {
    public static void main(String[] args) throws IOException {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("shoes.csv");
        File file = new File(classloader.getResource("shoes.csv").getFile());

        File destFile = new File("day15_dest_file.txt");
        FileWriter pw = new FileWriter(destFile);

        Scanner scanner = null;
        List<String> lists = new ArrayList<String>();
        List<String[]> lists_new = new ArrayList<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(";");
                lists.addAll(Arrays.asList(line));
                if (Integer.parseInt(line[2]) == 0) {
                    lists_new.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        scanner.close();
        // System.out.println(lists_new.toString());
        for (String[] strings : lists_new) {
            //for (String s:strings){
            //System.out.print(s + " ");
            // pw.write(s + ", ");
            for (int i = 0; i < strings.length; i++) {
                if (i == 0) {
                    pw.write(strings[i]);
                } else {
                    pw.write(", " + strings[i]);
                }

            }
            pw.write(System.lineSeparator());
        }

//        for (int i=0; i < strings.length; i++) {
//            if (i > 0) {
//                pw.write(", ");
//            }
//            pw.write(strings[i]);
//        }



       /* for (String[] strings : lists_new) {
            System.out.println(Arrays.toString(strings));
        }*/

        /* for(String[] strings: lists_new) {
            pw.write(Arrays.toString(strings) + System.lineSeparator());
        } */
        pw.close();

    }}
