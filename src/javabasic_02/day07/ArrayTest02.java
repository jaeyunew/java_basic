package javabasic_02.day07;

public class ArrayTest02 {
    public static void main(String[] args) {
        char[] alphabet = {'A', 'P', 'P', 'L', 'E'};

        for (char c : alphabet) {
            //System.out.print(String.valueOf(c).toLowerCase());
            System.out.print(Character.toLowerCase(c));
        }
    }
}
