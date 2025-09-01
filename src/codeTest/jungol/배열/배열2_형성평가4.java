package codeTest.jungol.배열;

import java.util.Scanner;

public class 배열2_형성평가4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arrayNum = new int[100];

        int count = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = in.nextInt();
            if (arrayNum[i] == -1) break;
            count++;
        }
        for (int i = count - 3; i < count; i++) {
            System.out.print(arrayNum[i] + " ");

        }
    }
}
