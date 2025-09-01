package codeTest.jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("점수를 입력하세요.");
        int score = in.nextInt();

        if(score>=80){
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }

    }
}
