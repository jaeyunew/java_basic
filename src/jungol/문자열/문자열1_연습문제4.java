package jungol.문자열;

import java.util.Scanner;

public class 문자열1_연습문제4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int lenOfstr = str.length();
        System.out.println("입력받은 문자열의 길이는 " + lenOfstr + "입니다.");

        //StringBuffer 사용법
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();

        System.out.println(reverse);

        //for문 사용법
        for (int i = lenOfstr-1; i >=0; i--) {
            System.out.print(str.charAt(i));;
            
        }

    }
}
