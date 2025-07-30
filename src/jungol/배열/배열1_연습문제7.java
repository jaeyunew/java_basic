package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int max = array[1];
        int min = array[0];

        for (int i = 1; i < array.length; i += 2) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
