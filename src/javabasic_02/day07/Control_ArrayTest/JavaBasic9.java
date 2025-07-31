package javabasic_02.day07.Control_ArrayTest;

import javabasic_01.day04.SwitchEx01;

import java.util.Scanner;

public class JavaBasic9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menu = """
                -----------------------------------------------
                1.학생수 | 2.점수입력 | 3.점수리스트| 4.분석| 5.종료
                -----------------------------------------------
                """;
        int student = 0;
        int[] score = new int[3];


        while (true) {
            System.out.println(menu);
            System.out.print("선택> ");
            int num = in.nextInt();

            switch (num) {
                case 1:
                    System.out.print("학생수> ");
                    student = in.nextInt();
                    break;
                case 2:
                    for (int i = 0; i < score.length; i++) {
                        System.out.printf("score[%d]>", i);
                        score[i] = in.nextInt();
                    }
                    break;
                case 3:
                    for (int i : score) {
                        int count = 1;
                        System.out.printf("score[%d]: %d\n", count, i);
                        count++;
                    }
                    break;
                case 4:
                    for (int i = 0; i < score.length; i++) {
                        int sum = 0;
                        sum += score[i];

                    }
                    System.out.println("최고 점수: " + );
                    System.out.printf("평균 점수: %.1f", sum/student );
            }
        }
    }
}
