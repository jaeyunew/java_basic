package javabasic_02.day07.Control_ArrayTest;

import javabasic_01.day04.SwitchEx01;

import java.util.Arrays;
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
        int[] scoreArray = new int[0];
        int sum = 0;

        Menu:
        while (true) {
            System.out.println(menu);
            System.out.print("선택> ");
            int num = in.nextInt();

            switch (num) {
                case 1:
                    System.out.print("학생수> ");
                    student = in.nextInt();
                    scoreArray = new int[student];
                    break;

                case 2:
                    for (int i = 0; i < scoreArray.length; i++) {
                        System.out.printf("score[%d]>", i);
                        scoreArray[i] = in.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i < scoreArray.length; i++) {
                        int score = scoreArray[i];
                        System.out.printf("score[%d]: %d\n", i, score);
                    }
                    break;
                case 4:
                    for (int i = 0; i < scoreArray.length; i++) {
                        sum += scoreArray[i];
                    }
                    Arrays.sort(scoreArray);
                    System.out.println("최고 점수: " + scoreArray[student - 1]);
                    System.out.printf("평균 점수: %.1f\n", (double) sum / student);
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    break Menu;
                default:
                    System.out.println("1~5사이의 숫자만 입력가능합니다.");
            }
        }
    }
}
