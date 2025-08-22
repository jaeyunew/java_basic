package java_advanced_01.day20.filterEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringEx01 {

    public static void main(String[] args) {
        //List 컬렉션 ArrayList 생성
        //list에 5명의 이름을 저장하세요
        List<String> list = new ArrayList<>();
        list.add("신세계");
        list.add("신세계");
        list.add("Java");
        list.add("김민성");
        list.add("김민서");

        List<String> list2 = Arrays.asList(
                new String("신명성"),
                new String("신명성"),
                new String("김주림")
        );

        //중복요소 제거
        list.stream()
                .distinct()
                .forEach(System.out::println);

        //list2에서 중복을 제거하고 이름에 "신"이 들어간 사람의 이름을 출력하세요

        //list2에 들어있는 모든 요소를 출력 (필터링 안함)
        list2.stream().forEach(System.out::println);

        System.out.println();

        //같은 이름 제거 필터링
        list2.stream().distinct().forEach(System.out::println);

        System.out.println();

        //같은 이름 제거 필터링 하고 이름에 "신"씨만 출력
        list2.stream().distinct().filter(name-> name.startsWith("신")).forEach(name-> System.out.println(name));
    }
}
