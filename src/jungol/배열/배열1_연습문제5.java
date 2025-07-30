package jungol.배열;

import java.util.Calendar;
import java.util.Scanner;

public class 배열1_연습문제5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Calendar:
        while (true) {
            System.out.println("YEAR = ");
            int year = in.nextInt();
            System.out.println("MONTH = ");
            int month = in.nextInt();

            if(month == 0) break;
            else if(month<1 || month>12){
                System.out.println("잘못 입력하였습니다.");
            }else{
                System.out.println("입력하신 달의 날 수는 " + array[month-1] + "일입니다.");
            }

        }
    }
}
