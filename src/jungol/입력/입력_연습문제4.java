package jungol.입력;

public class 입력_연습문제4 {
    public static void main(String[] args) {
       double r1, a1, a2;
       int r;

       r = 5;
       r1 = 3.14;
       a1 = 2 * r * r1;
       a2 = r * r * r1;

        System.out.printf("원주 = %d * 2 * %.6f = %.6f\n", r, r1, a1);
        System.out.printf("넓이 = %d * %d * %.6f = %.6f", r, r, r1, a2);
    }
}
