package javabasic_02.day07.Control_ArrayTest;

public class JavaBasic7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
