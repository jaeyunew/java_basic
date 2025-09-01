package codeTest.jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arrayNum = new int[10];
        int oddsum = 0;
        int evensum = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = in.nextInt();
        }

        for (int i = 0; i < arrayNum.length; i++) {
            int i1 = arrayNum[i];

            if (i % 2 == 0) {
                oddsum = oddsum + i1;
            } else {
                evensum = evensum + i1;
            }
        }
        System.out.println("odd : " + oddsum);
        System.out.println("even : " + evensum);
    }
}
