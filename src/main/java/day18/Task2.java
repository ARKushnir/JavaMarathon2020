package day18;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(6777));

    }
    private static  int  count7(int number){
        int j = 1;
        int counter=0;
        String strNumber = Integer.toString(number);
        int i = strNumber.length();

        if ( strNumber.substring(0,1).equals("7")) {
            counter++;
        }

        if (i==j){
            return counter++;
        }

        String substring = strNumber.substring(j , i);
        int recur = count7(Integer.parseInt(substring));
        return counter + recur;
    }
}
