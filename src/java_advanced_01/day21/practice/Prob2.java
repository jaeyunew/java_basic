package java_advanced_01.day21.practice;

import java.io.FileReader;
import java.io.Reader;

// 문제 2: 텍스트 파일에 저장된 문자열 읽기
//         hello.txt 파일을 읽어 화면에 출력하세요.
public class Prob2 {

    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("C:/Temp/hello.txt");
        char[]datas = new char[100];
        while(true){
            int numRead = reader.read(datas);
            if(numRead == -1) break;
            for (int i = 0; i < numRead; i++) {
                System.out.print(datas[i]);
            }
        }
        reader.close();

    }
}
