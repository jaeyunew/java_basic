package java_advanced_01.day20.testEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie","David","Eve");

        //1. 이름 중 "A"시작하는 이름을 수집하여 출력하세요
        List<String> filteredNames =
                names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filteredNames.toString());
//        names.stream().filter(name-> name.startsWith("A")).forEach(System.out::println);

        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");

        //2. 각 이름의 길이를 세어서 출력하시요 결과 :[5, 4, 7]
        names2.stream().mapToInt(String::length).forEach(System.out::println);


//        names2.stream().mapToInt(name->name.length()).forEach(System.out::println);


    }
}
