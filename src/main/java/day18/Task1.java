package day18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //int[] numbers = {1, 2, 3 , 4};
        System.out.println(recursionSum(new int[] {1, 2, 3, 4}));

    }
    private static  int  recursionSum(int [] numbers){
        int i=numbers.length;
        int sum=numbers[i-1];
        if (i==1){
            return sum;
        }
        //int recur = recursionSum(Arrays.copyOfRange(numbers,0, i-1 ));
        return sum +  recursionSum(Arrays.copyOfRange(numbers,0, i-1 ));
    }
}


