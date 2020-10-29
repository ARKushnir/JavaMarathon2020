package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Задайте размер массива: ");
        Scanner sc= new Scanner(System.in);
        int count_8=0;
        int count_1=0;
        int count_cz=0;
        int count_ncz=0;
        int count_sum=0;
        int n = sc.nextInt();
        int [] input = new int[n];

        for (int i=0; i<input.length; i++){
            input[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(input));


        for (int i=0; i<input.length; i++){
            count_sum = count_sum+input[i];
            if (input[i] > 8 ) {
                count_8++;
            }
            else if
                (input[i] == 1) {
                 count_1++;
            }
            else if (input[i]%2==0){
                count_cz++;
            }
            else if (input[i]%2!=0){
                count_ncz++;
            }


        }
           System.out.println("Количество чисел > 8 : " + count_8);
           System.out.println("Количество чисел = 1 : " + count_1);
           System.out.println("Количество четных числе : " + count_cz);
           System.out.println("Количество нечетных чисел : " + count_ncz);
            System.out.println("Сумма массива : " + count_sum);

    }
}
