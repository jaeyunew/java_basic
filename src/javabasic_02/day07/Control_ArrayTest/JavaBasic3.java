package javabasic_02.day07.Control_ArrayTest;

public class JavaBasic3 {
    public static void main(String[] args) {


        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            System.out.printf("(%d, %d)", dice1, dice2);

            if (dice1 + dice2 != 5) continue;
            else break;
        }

    }
}
