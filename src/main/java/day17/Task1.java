package day17;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       // float f = (float) (20d + 20.02f); // 1
        //long n = (int)10 + 2L;       // 2
       // byte b = (byte) (n + 5);         // 3

       // System.out.println(f);
        //System.out.println(n);
       // System.out.println(b);

        //int number = 12241;
        //int digit = ((number % 100) / 10) % 10;
        //System.out.println(4%10);

        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        boolean descOrdered = (h1 >0) ^ (h2 >0) && (h3 >0);
        System.out.println(descOrdered);

    }
}