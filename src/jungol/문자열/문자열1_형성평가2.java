package jungol.문자열;

import java.util.Scanner;

public class 문자열1_형성평가2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            String word = in.nextLine();
            if (word.length() < 5 || word.length() > 100) {
                System.out.println("5개 이상 100개 이하의 문자로 된 단어를 입력하시오.");
            } else {
                String front = word.substring(0, 5);
                System.out.println(front);
                break;
            }
        }
    }
}
