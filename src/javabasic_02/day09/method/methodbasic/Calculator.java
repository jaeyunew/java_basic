package javabasic_02.day09.method.methodbasic;

import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    static boolean a = true;

    public static void main(String[] args) {

        while (a) {
            System.out.println("======================================================");
            System.out.println("                     사칙 연산 계산기                    ");
            System.out.println("======================================================");
            System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");
//            int num1 = sc.nextInt();
//            int num2 = sc.nextInt();
//            int menuNum = sc.nextInt();
            // split() 구분자를 스페이스
            String inputData = sc.nextLine();
            String[] data = inputData.split(" ");
            calculator(data);
        }
    }

    //사용자가 입력한 아이디와 비밀번호를 idPwPrint()를 이용하여 출력하세요.
    public static void calculator(String[] data) {
        int num1, num2, menuNum = 0;
        num1 = Integer.parseInt(data[0]);
        num2 = Integer.parseInt(data[1]);
        menuNum = Integer.parseInt(data[2]);

        switch (menuNum) {
            case 1:
                System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
                break;
            case 2:
                System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
                break;
            case 3:
                System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
                break;
            case 4:
                System.out.printf("%d / %d = %.1f \n", num1, num2, (double) num1 / num2);
                break;
            case 5:
                a = false;
                break;
            default:
                System.out.println("숫자만 입력해주세요.");
        }

    }

}
