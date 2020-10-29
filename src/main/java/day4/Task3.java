package day4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Размерность m: ");
        System.out.print("Размерность n: ");
        Scanner scN= new Scanner(System.in);
        Scanner scM= new Scanner(System.in);
        int m = scN.nextInt();
        int n = scM.nextInt();
        int sum_m=0;
        int [][] arr = new int [m][n];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                    arr[i][j]=random.nextInt(10);
        }
}
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
                sum_m=sum_m+arr[i][j];
            }
            System.out.print("Сумма "+ sum_m);
            System.out.println();
            }
        }
    }
