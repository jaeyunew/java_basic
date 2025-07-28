package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("점수를 입력하세요.");
        int score = in.nextInt();

        if (score >= 90)
            System.out.println("A");
         else if (score >= 80)
            System.out.println("B");
         else if (score >= 70)
            System.out.println("C");
         else if (score >= 60)
            System.out.println("D");
         else
            System.out.println("F");

    }
}
