package java_advanced_01.day19.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example02 {
    public static void main(String[] args) {
        List<Member02> list = Arrays.asList(
                new Member02("홍길동", "개발자"),
                new Member02("김나리", "디자이너"),
                new Member02("신용권", "개발자")
        );

        List<Member02> developers = list.stream()
                .filter(job -> job.getJob().equals("개발자")).collect(Collectors.toList());

        developers.forEach(job -> System.out.println(job.getName()));
    }
}
