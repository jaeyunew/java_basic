package jungol.입력;

import java.util.Scanner;

public class 입력_연습문제6 {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);

        System.out.println("당신의 나이는 몇 살입니까?");
        age = input.nextInt();

        System.out.printf("당신의 나이는 %d살이군요.", age);

    }
}