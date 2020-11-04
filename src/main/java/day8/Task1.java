package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str="";
        String str2="";
        for (int i = 0; i<=10000; i++) {
            str=str+i+ " ";
        }
        System.out.println(str);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<=10000; i++) {
            sb.append(str2).append(i).append(" ");
        }
        System.out.println(sb.toString());
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println(timeConsumedMillis2);
        }


    }
