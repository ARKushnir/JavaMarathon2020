package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int max=0;
        int min=1000 ;
        int [] input = new int [10];
        int count_0=0;
        int sum_0=0;
        for (int i=0; i<input.length; i++){
            input[i]=(int) (Math.random()*1000);
            System.out.println(input[i]);
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
            if (input[i] < min) {
                min = input[i];
            }

            if (input[i] %10==0) {
                count_0++;
            }

            if (input[i] %10==0) {
                sum_0=sum_0+input[i];
            }

    }
        System.out.println("Наибольший элемент массива" + max);
        System.out.println("Наименьший элемент массива" + min);
        System.out.println("Кол-во элементов оканчивающихся на 0 "+count_0);
        System.out.println("Сумма лементов оканчивающихся на 0 "+sum_0);
}}
