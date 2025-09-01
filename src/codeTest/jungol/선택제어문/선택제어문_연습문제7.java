package codeTest.jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. 삽입");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        System.out.println("숫자를 선택하세요.");
        int num = in.nextInt();

        if(num == 1) System.out.println("삽입을 선택하셨습니다.");
        else if (num ==2) System.out.println("수정을 선택하셨습니다.");
        else if (num ==3) System.out.println("삭제를 선택하셨습니다.");
        else System.out.println("1, 2 ,3 중 하나를 선택해주세요.");
    }
}
