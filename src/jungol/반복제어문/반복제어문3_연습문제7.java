package jungol.반복제어문;

public class 반복제어문3_연습문제7 {
    public static void main(String[] args) {
        char word = 'a';
        int num = 1;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(word + " ");
                word++;
            }
            for (int k = 4; k >= i; k--) {
                System.out.printf(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
