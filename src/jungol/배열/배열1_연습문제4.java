package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[100];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (array[i] == 0) break;
            count++;
        }
        for (int i = 1; i < count; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
