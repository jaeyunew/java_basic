package java_advanced_01.day19;

import java.util.*;
import java.util.stream.Stream;

public class StreamEx01 {

    public static void main(String[] args) {
     //지금까지 컬렉션과 배열에 저장된 요소를 반복처리하기 위해서는 for문을 이용하거나
     //Iterator(반복자)를 이용하였다.

     //List 컬렉션에서 저장되어 있는 요소(Element)를 하나씩 처리하는 for문
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }
        //향상된 for를 이용하여 요소를 하나씩 처리하였다.
        for (String item : list) {
            System.out.println(item);
        }

        //Iterator 사용
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);  //요소 처리 => 콘솔창에 요소의 값을 확인하겠다.
        }

        //Java8 부터 Stream을 사용하여 요소들이 하나씩 흘러가면서 처리하는 방법을 제시함
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);


        //Set names에 홍길동, 김나무, 김꽃분 세명의 회원을 저장하고 회원의 이름을 Stream을 이용하여 출력
        Set<String> names = new HashSet<String>();
        names.add("홍길동");
        names.add("김나무");
        names.add("김꽃분");

        Stream<String> users = names.stream();
        users.forEach(System.out::println);
//        users.forEach(name -> System.out.println(name));

        //1. 내부 반복자이므로 처리 속도가 빠르다. 병렬처리에 효율적이다.
        //2. 람다식으로 다양한 요소 처리가 가능하다.
        //3. 중간처리와 최종처리를 수행하도록 파이프라인을 형성할 수 있다.

    }
}
