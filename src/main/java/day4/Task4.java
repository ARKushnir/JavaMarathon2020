package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] input = new int [9];
        Random rand = new Random();
        int sum=0;
        int max_sum=0;
        int max_index=0;
        for (int i=0; i<input.length; i++) {
            input[i] = (int) (Math.random() * 10);
            System.out.print(input[i]+" ");
        }

            for (int i=1; i<input.length-1; i++) {
               sum = input[i-1] + input[i]+input[i+1];
               //System.out.println("Сумма "+ sum);
                if (sum > max_sum) {
                    max_sum = sum;
                    max_index=i;
                }
            }
                System.out.println("   " +max_sum);
                System.out.println("    "+max_index);
        }
    }
