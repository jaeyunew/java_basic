package javabasic_01.day05.forEx;

public class StarEx06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("-");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
