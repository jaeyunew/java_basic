package java_advanced_01.day21.practice;

import java.io.FileReader;
import java.io.Reader;

// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
public class Prob3 {

    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("C:/Temp/hello.txt");
        int num = 0;
        while (true) {
            int data = reader.read();
            if (data == -1) break;
            num++;
        }
        System.out.println(num);
        reader.close();
    }
}
