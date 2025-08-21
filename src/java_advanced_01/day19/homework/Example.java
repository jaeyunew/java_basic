package java_advanced_01.day19.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports Lambda Expressions"
        );
        list.stream().filter(line -> line.toLowerCase().contains("java")).forEach(line -> System.out.println(line));
    }
}
