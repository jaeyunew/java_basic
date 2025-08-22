package java_advanced_01.day20.testEx;

import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 3, 2, 4, 8, 6, 9, 5, 7, 1);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNumbers);

        List<Integer> squareNumbers = numbers.stream().map(n -> n * n).toList();
        System.out.println(squareNumbers);

        List<String> students = Arrays.asList("Alice", "Bob", "Dan", "Dan", "Alice");
        List<String> sortedStudents = students.stream().distinct().toList();
        System.out.println(sortedStudents);

        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println(sortedNumbers);

        List<Integer> sumNumber = numbers.stream().filter(n -> n % 2 == 0).toList();
        int sum = sumNumber.stream().mapToInt(n -> n).sum();
        System.out.println(sum);

    }
}
