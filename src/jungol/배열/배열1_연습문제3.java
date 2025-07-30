package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(array[2]);
        System.out.println(array[4]);
        System.out.println(array[9]);
    }
}
