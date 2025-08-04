package javabasic_02.day09.method.methodbasic;

public class Example03 {
    public static void main(String[] args) {
        int result = div();
        System.out.println(result);
    }

    public static int div() {
        int n1 = 10, n2 = 5, result = 0;
        if (n2 != 0) {
            result = n1 / n2;
        } else System.out.println("0으로 나누기 금지");
        return result;
    }
}
