package javabasic_01.day02;

public class Boolean {
    public static void main(String[] args) {
        int x = 30;

        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        boolean result3 = (0 < x && x < 30);
        boolean result4 = (x < 0 || x >= 30);

        System.out.printf("result1=" + result1);
        System.out.printf("\nresult2=" + result2);
        System.out.printf("\nresult3=" + result3);
        System.out.printf("\nresult4=" + result4);
    }
}
