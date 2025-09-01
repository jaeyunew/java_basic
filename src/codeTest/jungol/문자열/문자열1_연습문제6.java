package codeTest.jungol.문자열;

import java.util.Scanner;

public class 문자열1_연습문제6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // isDigit() 나 isUpperCase() 사용가능
        while (true) {
            char c = in.next().charAt(0);

            if ((int) c >= 65 && (int) c <= 90) {
                System.out.println("대문자입니다.");
            } else if ((int) c >= 97 && (int) c <= 122) {
                System.out.println("소문자입니다.");
            } else if ((int) c >= 48 && (int) c <= 57) {
                System.out.println("숫자문자입니다.");
            } else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }

        }
    }
}
