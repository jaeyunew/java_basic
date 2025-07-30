package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i]= in.nextInt();
        }
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum = sum+ array[i];
        }
        double avg = sum/10.0;

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + avg);
    }
}
