package day04;

public class ForEx02 {
    public static void main(String[] args) {
        //1~10까지의     출력: 55

        int result = 0;
        for (int i = 1; i < 11; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
