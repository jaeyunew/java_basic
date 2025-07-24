package jungol.입력;

import java.util.Scanner;

public class 입력_형성평가5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("yard?");
        double yard = input.nextDouble();

        double cm = yard * 91.44;

        System.out.printf("%.1fyard = %.1fcm", yard, cm);
    }
}
