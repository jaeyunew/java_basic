package day01;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        int num1, num2, num3, sum;
        Scanner input = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요");
        num1 = input.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        num2 = input.nextInt();
        System.out.println("세번째 숫자를 입력하세요");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        System.out.println("출력결과는 다음과 같습니다");

        System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + sum);
        System.out.printf("%d + %d + %d = %d ", num1, num2, num3, sum);
    }

}
