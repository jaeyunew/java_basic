package java_advanced_01.day21.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 문제 4: 바이트 단위 파일 쓰기
//         byte_output.txt 파일에 "ABCDEF"를 바이트 단위로 저장하고 성공하면 "저장완료"  출력하세요
public class Prob4 {

    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/byte_output.txt");

            byte num1 = 'A';
            byte num2 = 'B';
            byte num3 = 'C';
            byte num4 = 'D';
            byte num5 = 'E';
            byte num6 = 'F';

            os.write(num1);
            os.write(num2);
            os.write(num3);
            os.write(num4);
            os.write(num5);
            os.write(num6);

            os.flush();
            os.close();

            System.out.println("저장완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
