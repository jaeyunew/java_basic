package java_advanced_01.day20.flatMapEx;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {
    public static void main(String[] args) {
        List<List<String>> listOflists = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b", "c"),
                Arrays.asList("d", "e"),
                Arrays.asList("f", "g"),
                Arrays.asList("h", "i")
        );

        List<String> allNames = listOflists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(allNames);
    }
}
