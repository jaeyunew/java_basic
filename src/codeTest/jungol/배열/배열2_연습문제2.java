package codeTest.jungol.배열;

import java.util.Scanner;

public class 배열2_연습문제2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] count = new int[10];
        while (true) {
            int num = in.nextInt();
            if (num == 0) break;
            count[num % 10]++;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] > 0)
                System.out.printf("%d : %d개\n", i, count[i]);
        }
    }
}
