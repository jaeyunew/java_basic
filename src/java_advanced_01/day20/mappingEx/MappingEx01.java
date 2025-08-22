package java_advanced_01.day20.mappingEx;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
class Student {
    private String name;
    private int score;
};

public class MappingEx01 {

    public static void main(String[] args) {
        //학생 3명을 리스트컬렉션을 생성하여 순서대로 저장하세요
        List<Student> students = Arrays.asList(
                new Student("김동현",80),
                new Student("추성훈",50),
                new Student("정찬성",100)
        );
        //학생들의 점수(score)를 stream()방법으로 출력하세요
        students.stream().forEach(score-> System.out.println(score.getScore()));
        students.stream().mapToInt(student->student.getScore()).forEach(System.out::println);

        //학생들의 총점을 출력하세요
        int totalScore = students.stream().mapToInt(student->student.getScore()).sum();
        System.out.println(totalScore);

        //학생들의 평균을 소숫점 1자리로 출력하세요
        double averageScore = students.stream().mapToInt(Student::getScore).average().getAsDouble();
        System.out.printf("%.1f", averageScore);
    }
}
