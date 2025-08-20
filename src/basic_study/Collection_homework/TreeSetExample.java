package basic_study.Collection_homework;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student02> treeSet = new TreeSet<Student02>();
        treeSet.add(new Student02("blue", 96));
        treeSet.add(new Student02("hong", 86));
        treeSet.add(new Student02("white", 92));

        Student02 student = treeSet.last();
        System.out.println("최고 점수: " + student.score);
        System.out.println("최고 점수를 받은 아이디: " + student.id);
    }
}
