package java_advanced_01.day17.unmodifiable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ImmutableEx {
    public static void main(String[] args) {
        //List 불변 컬렉션 생성
        List<String> list = List.of("apple", "banana", "Pear", "Orange");
//        list.add("grape"); 수정 불가
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();

        Map<String,Integer> map = Map.of("apple", 10000, "banana", 2500, "orange", 3000);
        for (String s : map.keySet()) {
            System.out.println(s);
            System.out.println(map.get(s));
        }
        //배열로부터 수정할 수 없는 List 컬렉션 생성방법
        String[] arr = new String[]{"apple", "banana", "orange", "pear", "banana"};
        List<String> list2 = List.of(arr);
        List<String> list3 = Arrays.asList(arr);
    }
}
