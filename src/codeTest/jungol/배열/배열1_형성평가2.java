package codeTest.jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arrayNum = new int[5];
        int sum = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = in.nextInt();
            if (i % 2 == 0) {
                sum = sum + arrayNum[i];
            }
        }
        System.out.println(sum);

    }
}
