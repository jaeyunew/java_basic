package basic_study.Collection_homework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student01> set = new HashSet<Student01>();

        set.add(new Student01(1, "홍길동"));
        set.add(new Student01(2, "신용권"));
        set.add(new Student01(1, "조민우"));

        System.out.println("저장된 객체 수: " + set.size());
        for (Student01 s : set) {
            System.out.println(s.studentNum + " : " + s.name);
        }

    }
}
