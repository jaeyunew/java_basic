package javabasic_02.day07.Control_ArrayTest;

import java.util.Scanner;

public class JavaBasic8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menu = """
                ------------------------------
                1.예금 | 2.출금 | 3.잔고| 4.종료
                ------------------------------
                """;

        int money = 0;
        int out = 0;

        Menu:
        while (true) {
            System.out.println(menu);
            System.out.print("선택> ");
            int num = in.nextInt();

            switch (num) {
                case 1:
                    System.out.print("예금액> ");
                    money = in.nextInt();
                    break;
                case 2:
                    System.out.println("출금액> 2000");
                    out= in.nextInt();
                    break;
                case 3:
                    System.out.printf("잔고> %d\n",money-out);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    break Menu;
                default:
                    System.out.println("1~4 사이의 숫자만 입력가능합니다.");
            }
        }
    }
}
