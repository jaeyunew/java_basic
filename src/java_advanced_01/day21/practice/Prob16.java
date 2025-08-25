package java_advanced_01.day21.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//문제 : 3명의 학생 (김철수,21,3.5), (이영희,22,3.9) (박민수, 20,3.2) 학생 정보를 students.dat파일에 저장하고 다시 읽어 출력
// ex) 반 총점 = 10.6  반 평균 = 3.5 (소수 첫째자리 표현)을 출력하고 학생정보를 나이순으로 콘솔에 출력하세요
//학생정보
// 박민수 , 20세
// 김철수 , 21세
// 이영희 , 22세
public class Prob16 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                Student.builder().name("김철수").age(21).score(3.5).build(),
                Student.builder().name("이영희").age(22).score(3.9).build(),
                Student.builder().name("박민수").age(20).score(3.2).build()
        );
        String fileName = "students.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for (Student student : students) {
                dos.writeUTF(student.getName());
                dos.writeInt(student.getAge());
                dos.writeDouble(student.getScore());
            }
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Student> studentList = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            for (int i = 0; i < 3; i++) {
                String name = dis.readUTF();
                int age = dis.readInt();
                double score = dis.readDouble();
                studentList.add(Student.builder().name(name).age(age).score(score).build());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double total = studentList.stream().mapToDouble(student -> student.getScore()).sum();
        double avg = total / studentList.size();

        System.out.printf("반 총점 = %.1f 반 평균 = %.1f\n", total, avg);

        studentList.stream().sorted(Comparator.comparingInt(student -> student.getAge())).
                forEach(student -> System.out.println(student.getName() + "," + student.getAge()));
    }
}
