package java_advanced_01.day19;

import java.util.stream.IntStream;

public class RangeStreamEx {
    public static int sum1;
    public static int sum2;

    public static void main(String[] args) {

        IntStream i1_100 = IntStream.rangeClosed(1, 100);
        i1_100.forEach(number -> sum1 += number);
        System.out.println(sum1);

        IntStream i1_10 = IntStream.range(1, 10);
        i1_10.forEach(number -> sum2 += number);
        System.out.println(sum2);


    }
}
