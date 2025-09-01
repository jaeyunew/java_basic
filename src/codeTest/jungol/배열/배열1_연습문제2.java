package codeTest.jungol.배열;

public class 배열1_연습문제2 {
    public static void main(String[] args) {
        char[] array = new char[26];
        char c = 'Z';

        for (int i = 0; i < array.length; i++) {
            array[i] = c;
            c--;
        }
        for (char ch : array) {
            System.out.print(ch + " ");
        }
    }
}
