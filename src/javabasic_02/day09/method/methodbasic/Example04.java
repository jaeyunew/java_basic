package javabasic_02.day09.method.methodbasic;

import java.util.Scanner;

public class Example04 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("두 수를 차례로 입력해 주시면 나누기 결과를 제공해 드립니다");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int result = div(n1, n2);
        System.out.println("요청하신" + n1 + " /" + n2 + "의 나구기 결과는" + result);

    }

    public static int div(int number1, int number2) {
        int result = 0;
        if (number2 != 0) {
            result = number1 / number2;
        } else System.out.println("0으로 나누기 금지");
        return result;
    }
}