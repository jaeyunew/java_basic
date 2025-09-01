package codeTest.jungol.배열;

import java.util.Scanner;

public class 배열2_연습문제1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] count = new int[11];
        while (true) {
            int num = in.nextInt();
            if (num == 0) break;
            else if (num >= 1 && num <= 10) {
                count[num]++;
            } else {
                System.out.println("1부터 10사이의 정수를 입력하시오");
            }

        }
        for (int i = 1; i <= 10; i++) {
            if (count[i] > 0)
                System.out.printf("%d : %d개\n", i, count[i]);
        }
    }
}
