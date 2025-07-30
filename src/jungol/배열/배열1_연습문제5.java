package jungol.배열;

import java.time.LocalDate;
import java.util.Scanner;

public class 배열1_연습문제5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.printf("YEAR = ");
            int year = in.nextInt();
            System.out.print("MONTH = ");
            int month = in.nextInt();

            if (month == 0) break;

            if (month < 1 || month > 12) {
                System.out.println("잘못 입력하였습니다.");
                continue;
            }

            LocalDate localDate = LocalDate.of(year, month, 1);
            System.out.printf("입력하신 달의 날의 수는 %d일입니다.\n", localDate.lengthOfMonth());
        }
    }
}
